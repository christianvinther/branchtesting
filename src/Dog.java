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

    public void showMood(boolean happy) {
        if (happy) {
            System.out.println(getName() + " logrer");
        } else {
            System.out.println(getName() + " knurrer");
        }
    }
}
