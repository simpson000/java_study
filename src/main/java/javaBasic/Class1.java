package javaBasic;

public class Class1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John Doe";
        student1.age = 22;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "Jhn Doe";
        student2.age = 2;
        student2.grade = 0;


        Student[] students = new Student[2];
        students[0] =student1;
        students[1] = student2;
        for (Student student : students) {
            System.out.println(student.name+" "+student.age+" "+student.grade);
        }
        for (Student student : students) {
            
        }
    }
}
