import java.util.*;
import java.text.SimpleDateFormat;

class Person {
    String id, name, sex;
    int age;

    Person(String id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
    }
}

class Staff extends Person {
    String designation;
    int salary;

    Staff(String id, String name, String sex, int age, String designation, int salary) {
        super(id, name, sex, age);
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class Doctor extends Person {
    String specialization;
    String appointmentTime;
    String qualification;
    int roomNumber;

    Doctor(String id, String name, String sex, int age, String specialization, String appointmentTime, String qualification, int roomNumber) {
        super(id, name, sex, age);
        this.specialization = specialization;
        this.appointmentTime = appointmentTime;
        this.qualification = qualification;
        this.roomNumber = roomNumber;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("Appointment Time: " + appointmentTime);
        System.out.println("Qualification: " + qualification);
        System.out.println("Room Number: " + roomNumber);
    }
}

class Patient extends Person {
    String disease;
    String admitStatus;

    Patient(String id, String name, String sex, int age, String disease, String admitStatus) {
        super(id, name, sex, age);
        this.disease = disease;
        this.admitStatus = admitStatus;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Disease: " + disease);
        System.out.println("Admit Status: " + admitStatus);
    }
}

class Medicine {
    String name;
    String company;
    String expiryDate;
    int cost;
    int quantity;

    Medicine(String name, String company, String expiryDate, int cost, int quantity) {
        this.name = name;
        this.company = company;
        this.expiryDate = expiryDate;
        this.cost = cost;
        this.quantity = quantity;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Cost: " + cost);
        System.out.println("Quantity: " + quantity);
    }
}

class Laboratory {
    String facility;
    int cost;

    Laboratory(String facility, int cost) {
        this.facility = facility;
        this.cost = cost;
    }

    void displayInfo() {
        System.out.println("Facility: " + facility);
        System.out.println("Cost: " + cost);
    }
}

class Facility {
    String name;

    Facility(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Facility: " + name);
    }
}

class HospitalManagement1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy hh:mm:ss");

        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Medicine> medicines = new ArrayList<>();
        ArrayList<Laboratory> laboratories = new ArrayList<>();
        ArrayList<Facility> facilities = new ArrayList<>();
        ArrayList<Staff> staffMembers = new ArrayList<>();

        while (true) {
            System.out.println("\n-------------------------------------------------");
            System.out.println("       ** Hospital Management System **");
            System.out.println("-------------------------------------------------");
            System.out.println("1. Manage Doctors");
            System.out.println("2. Manage Patients");
            System.out.println("3. Manage Medicines");
            System.out.println("4. Manage Laboratories");
            System.out.println("5. Manage Facilities");
            System.out.println("6. Manage Staff");
            System.out.println("7. Exit");
            System.out.println("-------------------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

           
}
    }
}
