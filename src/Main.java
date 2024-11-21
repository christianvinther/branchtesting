public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Christian");
        Cat cat = new Cat("Thomas");

        dog.makeSound();
        cat.makeSound();

        System.out.println(dog.eat("dogfood"));
        System.out.println(cat.eat("fish"));

    }
}