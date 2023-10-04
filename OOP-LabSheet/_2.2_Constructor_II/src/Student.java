public class Student {
    private String name;
    private int age;
    private char grade;

    public Student(){
        String name;
        int age;
        char grade;
    }

    public void Para(String x, int y, char z){
        name=x;
        age=y;
        grade=z;
    }
    public void  displayInfo(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Grade is "+grade);
    }

    public void LastCon(String Name, int Age){
        name=Name;
        age=Age;
        grade='N';
    }

    public static void main(String [] args){
        Student Student = new Student();
        Student.displayInfo();

        Student Para = new Student();
        Para.Para("Tharika",20,'U');
        Para.displayInfo();

        Student LastCon = new Student();
        LastCon.LastCon("rose",55 );
        LastCon.displayInfo();


    }

}