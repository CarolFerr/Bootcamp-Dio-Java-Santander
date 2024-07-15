package dio.web_security_api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    // forma global de consumo será atraves do security service
    private SecurityDatabaseService securityService;
    @Autowired
    // autenticação de um gerenciador de autenticação
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // rota padrão, qualquer pessoa pode acessar
                .antMatchers("/").permitAll()
                // rota login
                .antMatchers(HttpMethod.POST, "/login").permitAll()
                // usuarios com perfil manager
                .antMatchers("/managers").hasAnyRole("MANAGERS")
                // usuarios com perfil user e manager
                .antMatchers("/users").hasAnyRole("USERS","MANAGERS")
                // tela de login do spring para autenticação
//                .anyRequest().authenticated().and().formLogin();
                // Não mais por uma tela de login do spring mas pelo httpBasic
                .anyRequest().authenticated().and().httpBasic();

    }
    // usado apenas quando se está realizando em memória
    /*@Override
    // não está relacionado com banco de dados
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                // estrategia de criptografia
                .password("{noop}user123")
                .roles("USERS")
                .and()
                .withUser("admin")
                .password("{noop}master123")
                .roles("MANAGERS");
    }*/
}