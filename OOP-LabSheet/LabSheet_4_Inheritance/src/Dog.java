public class Dog extends Mammal{
    String breed;


    Dog(){
        String name = "Bool";
        int age = 5;
        String furColor="Yellow";
    }

    public void toString1(String name, int age,String furColor){
        System.out.println("Dog name : "+ name);
        System.out.println("Dog age : "+ age);
        System.out.println("Fur Colour : "+ super.furColor);
    }
}
