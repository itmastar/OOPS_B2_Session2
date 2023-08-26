public class Main {
    public static void main(String[] args) {
        Person p1=new Person("Ali",32);
        System.out.println(p1.Details());
        System.out.println("-----------");
        Student s1=new Student("Shanthi",27,"CBIT");
        System.out.println(s1.StudentDetails());
    }
}

class Person{
    private String name;
    private int age;

    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String Details(){
        return "Name :"+this.name+"\nAge :"+this.age;
    }
}

//class Student {
//    private String name;
//    private int age;
//    private String collegeName;
//
//    public Student(String name, int age, String collegeName) {
//        this.name = name;
//        this.age = age;
//        this.collegeName = collegeName;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getCollegeName() {
//        return collegeName;
//    }
//
//    public void setCollegeName(String collegeName) {
//        this.collegeName = collegeName;
//    }
//
//    public String StudentDetails(){
//        return "Name :"+this.name+"\nAge :"+this.age+"\nCollegeName :"+this.collegeName;
//    }
//}

class Student extends Person{
    private String collegeName;

    public Student(String name, int age, String collegeName) {
        super(name, age);
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String StudentDetails(){
        return super.Details()+"\nCollegeName :"+this.collegeName;
    }
}