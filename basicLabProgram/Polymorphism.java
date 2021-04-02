import java.util.*;

class Polymorphism{
	class Animal{
       public void animalSound(){
       System.out.println("The animal makes a sound");
       }
    }

    class Pig extends Animal{
       public void animalSound(){
       System.out.println("The pig says: wee wee");
       }
    }

    class Dog extends Animal{
       public static void animalSound(){
       System.out.println("The dog says: bow wow");
       }
    }
	
	public static void main(String args[][]){
		Dog obj1 = new Dog();
		obj1.animalSound();
	}	
}
