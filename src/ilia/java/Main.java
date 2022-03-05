package ilia.java;


abstract class University {
    public abstract void uniMember();

    public void Worker() {
        System.out.println("I am a member of university.");
    }
}

    class Teacher extends University {
        public void uniMember() {
            System.out.print("Teacher: ");
        }
    }

    class Student extends University {
    public void uniMember() {
        System.out.print("Student: ");
    }
}

class Employee extends University {
    public void uniMember(){
        System.out.println("Employee: ");
    }
}


public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        Employee employee = new Employee();
        teacher.uniMember();
        teacher.Worker();
        student.uniMember();
        student.Worker();
        employee.uniMember();
        employee.Worker();
    }

}