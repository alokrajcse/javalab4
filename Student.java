//LAB QUES4

public class Student {
 String name;
   int roll;
   Address address;
    static int studentCount = 0;

    public Student(String name, int roll, String city, int pin) {
        this.name = name;
        this.roll = roll;
        this.address = new Address(city, pin);
        System.out.println("Creating student number " + (++studentCount) + " from the constructor.");
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Address: " + address.city + ", Pin: " + address.pin);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Student student1 = new Student("Mohit", 101, "City1", 12345);
        Student student2 = new Student("Rohit", 102, "City2", 56789);
        Student student3 = new Student("Alok", 103, "City3", 98765);

        System.out.println("Student Information:");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }

    static class Address {
        String city;
        int pin;

        public Address(String city, int pin) {
            this.city = city;
            this.pin = pin;
        }
    }
}
