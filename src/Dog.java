public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("vov vov");

    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
