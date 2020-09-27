package SDA.javagda.basic.day3.Exe1;

public class MainCat {
    public static void main(String[] args) {

        Cat[] array = new Cat[2];
        Cat cat1 = new Cat("Pimpek");
        Cat cat2 = new Cat("Lucjan");

        array[0] = cat1;
        array[1] = cat2;

        int mouses = 10;
        for(Cat element : array){
            element.print();
            element.makeSound();
            element.eatMouses(mouses++);
            System.out.println(element.toString());
            System.out.println();
        }
        Cat cat3 = new Cat("Mysza");
        System.out.println(cat3.getName());
        cat3.setName("Puszek");
        System.out.println(cat3.getName());
    }
}
