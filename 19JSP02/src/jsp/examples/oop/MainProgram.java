/**
 * 
 */
package jsp.examples.oop;

/**
 * @author TechCare
 *
 */
public class MainProgram {
	public static void main(String args[]) {
		Dog dog = new Dog("kiki", 3, "dog");
		System.out.println("Name of " + dog.getTypeAnimal() + " : " + dog.getName());
		System.out.println("Age of " + dog.getTypeAnimal() + " : " + dog.getAge());
		Tiger tiger = new Tiger("alpha", 4, "tiger");
		System.out.println("Name of " + tiger.getTypeAnimal() + " : " + tiger.getName());
		System.out.println("Age of " + tiger.getTypeAnimal() + " : " + tiger.getAge());
	}
}
