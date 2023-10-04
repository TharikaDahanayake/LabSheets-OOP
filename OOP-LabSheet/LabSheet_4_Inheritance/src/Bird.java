public class Bird extends Animal {
    double wingSpan;

    Bird(){
        String name = "Parrot";
        int age = 12;
        String furColor="Pink";
    }
    @Override
    public void makeSound() {
        System.out.println("The Parrot makes sound");
    }
    public void toString1(String name, int age,String furColor){
        System.out.println("Bird name : "+ name);
        System.out.println("Bird age : "+ age);
        System.out.println("Fur Colour : "+ super.furColor);
    }
}

