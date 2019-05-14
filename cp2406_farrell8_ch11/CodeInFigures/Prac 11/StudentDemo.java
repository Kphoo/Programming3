public class StudentDemo {
    public static void main(String[] args) {
        UndergraduateStudent Student1= new UndergraduateStudent(1,"Zwe");
        GraduateStudent Student2= new GraduateStudent(2,"Kphoo");
        StudentAtLarge Student3=new StudentAtLarge(3,"Hoo");
        Student1.setAnnualTution();
        Student2.setAnnualTution();
        Student3.setAnnualTution();
        System.out.println(Student1.getAnnualTution());
        System.out.println(Student2.getAnnualTution());
        System.out.println(Student3.getAnnualTution());
    }
}
