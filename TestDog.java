class Animal {
    protected void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
 
	protected String myName;
	public void move() {
      super.move();   // invokes the super class method
      System.out.println("Dogs can walk and run");
   }
	protected  void name(String anyString) {
	      myName = anyString;
	      System.out.printf("My dog is named %s", myName);
	   }
}


class PetDog{
       
	   public static void check(String args[]) {
	      Animal b = new Dog();   // Animal reference but Dog object 
	      
	   }
}
public class TestDog {

   public static void main(String args[]) {
      Dog b = new Dog();   // Animal reference but Dog object
      
      b.move();   // runs the method in Dog class
      b.name("Geo");
     
      
   }
}
