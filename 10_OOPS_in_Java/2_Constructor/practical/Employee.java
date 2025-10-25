package practice;

public class Employee{
    private int id;
    private String name;
    private double salary;
    private String designition;
    private String address;
    private String department;

    Employee(){
        // code to be executed.
    }

    Employee(int id, String name){
        // code to be executed.
    }

    public void setProperties(int id, String name, double salary, String designition, String address, String department){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designition = designition;
        this.address = address;
        this.department = department;
    }

    public void showProperties(){
        System.out.println("Employee ID: " + id + "\nEmployee Name: " + name + "\nEmployee Salary: " + salary + "\nEmployee Designition: " + designition + "\nEmployee Department: "+ department + "\nEmployee Address: "+ address);
    }
};