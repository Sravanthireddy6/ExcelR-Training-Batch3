// wap to create inheritance-class name parent and class name child
class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }
}
public class Demo011 {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        animal.makeSound();
        Dog dog = new Dog("Buddy");
        dog.makeSound();
    }
}
