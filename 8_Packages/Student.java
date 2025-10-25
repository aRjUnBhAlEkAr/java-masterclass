package student;

public class Student{
        String name;
        int age;
        int roll_no;
        String sub1;
        String sub2;
        String sub3;
        String sub4;
        String sub5;

        public void getProperties(String name, int age, int roll_no, String sub1, String sub2, String sub3, String sub4, String sub5){
            this.name = name;
            this.age = age;
            this.roll_no = roll_no;
            this.sub1 = sub1;
            this.sub2 = sub2;
            this.sub3 = sub3;
            this.sub4 = sub4;
            this.sub5 = sub5;
        }

        public void printProperties(){
            System.out.println("Name: " + name);
            System.out.println("Age : " + age);
            System.out.println("Roll no: " + roll_no);
            System.out.println("Sub1 : " + sub1);
            System.out.println("Sub2 : " + sub2);
            System.out.println("Sub3 : " + sub3);
            System.out.println("Sub4 : " + sub4);
            System.out.println("Sub5 : " + sub5);
        }
};