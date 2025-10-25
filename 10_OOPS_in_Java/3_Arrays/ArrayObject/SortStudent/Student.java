// package declaration.
package student;

// Definition of "Student" class.
class Student{
    // Declaration of Instance variable.
    private int id;
    private String name;
    private String department;
    private double cgpa;

    // Definition of the constructor which will assign the value to the instance variable.
    public Student(int id, String name, String department, double cgpa){
        this.id = id;
        this.name = name;
        this.department = department;
        this. cgpa = cgpa;
    }

    // setter method to set the value.
    public void setId(int id){
        this.id = id;
    }

    // getter method to get or return the value.
    public int getId(){
        return id;
    }

    // toString method returns all the value in String format.
    @Override
    public String toString(){
        return "Student[ id: " + id + ", name: "+ name + ", Department: " + department + ", CGPA: " + cgpa +" ]";
    }
};