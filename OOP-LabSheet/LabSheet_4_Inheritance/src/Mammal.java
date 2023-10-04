public class Mammal extends Animal {
    String furColor="Orange";
    Mammal(){
        String name = "Malli poos";
        int age = 6;
        String furColor="Orange";
    }
    @Override
    public void makeSound() {
        System.out.println("The Mammal makes sound");
    }

    public void toString1(String name, int age, String furColor){
        System.out.println("Cat name : "+ name);
        System.out.println("Cat age : "+ age);
        System.out.println("Fur Colour : "+ super.furColor);

    }
}
