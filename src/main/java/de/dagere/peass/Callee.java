package de.dagere.peass;

class Callee {

   protected void method1() {
      innerMethod();
   }

   private void innerMethod() {
      try {
         Thread.sleep(20);
      } catch (final InterruptedException e) {
         e.printStackTrace();
      }
   }

}