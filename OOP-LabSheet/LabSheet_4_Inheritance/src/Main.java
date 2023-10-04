public class Main {

    public static void main(String [] args){
        Animal animal =new Animal();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Mammal mammal= new Mammal();

        animal.makeSound();
        dog.makeSound();
        bird.makeSound();
        mammal.makeSound();

        animal.toString1();
        dog.toString1("Bool",5,"Yellow");
        bird.toString1("Parrot",12,"Pink");
        mammal.toString1("Malli poos",4,"Orange");
    }
}
