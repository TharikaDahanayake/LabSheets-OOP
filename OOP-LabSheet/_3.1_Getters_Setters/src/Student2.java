public class Student2{
    private String name;
    private int age;
    private char grade;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }

    public void displayInfo(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Grade is "+grade);
    }
    public static void main(String [] args){
        Student2 details = new Student2();
        details.setName("Tharika");
        details.setAge(20);
        details.setGrade('A');
        details.displayInfo();


    }

}