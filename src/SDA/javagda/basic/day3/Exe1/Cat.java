package SDA.javagda.basic.day3.Exe1;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("meow");
    }

    public void eatMouses(int mouses) {
        System.out.println("I ate " + mouses);
    }

    public void print(){
        System.out.println("Cat :");
        System.out.println("\t name: " + name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
