class Parameterized{

    int id;
    String name;
    //creating a parameterized constructor

    Parameterized(int i,String n){
        id = i;
        name = n;
    }

    //method to display the values
    void student(){
        System.out.println(id+" "+name);
    }

    public static void main(String args[]){
        //creating objects and passing values
        Parameterized s1 = new Parameterized(111,"Karan");
        Parameterized s2 = new Parameterized(222,"Aryan");
        //calling method to display the values of object

        s1.student();
        s2.student();
    }
}