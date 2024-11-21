public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public abstract boolean eat(String foodType);

    public abstract void showMood(boolean happy);
}




