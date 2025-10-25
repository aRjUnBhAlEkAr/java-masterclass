package practice;

class Members{
    String name;
    short age;
    long phone_number;
    String address;
    double salary;

    void printSalary(){
        System.out.println("Salary of " + name + " is " + salary);
    }
};

class Employee extends Members{
    String specification;

    Employee(String name, short age, long phone_number, String address, double salary){
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }
};

class Manager extends Members{
    String department;

    Manager(String name, short age, long phone_number, String address, double salary){
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }
};

public class MembersDetails{
    public static void main(String[] args){
        Employee e = new Employee("Sangram", (short)21, 886598656, "Satara", 9820.01);
        Manager m = new Manager("Kuldip", (short)32, 886598656, "Solapur", 896592.01);
        e.printSalary();
        m.printSalary();
    }
};