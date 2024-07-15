package org.patterns.gof.singleton;

// encapsular a instância em uma classe estatica interna
public class SingletonLazyHolder {

   private static class InstanceHolder {
       public static SingletonLazyHolder instancia = new SingletonLazyHolder();
   }

   private SingletonLazyHolder() {
       super();
   }

   public static SingletonLazyHolder getInstancia() {
       return InstanceHolder.instancia;
   }
}
