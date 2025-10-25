package person;

public class Person{
    public String name;
    public String contact;
    public String city;
    public String district;
    public String state;

    public void acceptData(String name, String contact, String city, String district, String state){
        this.name = name;
        this.contact = contact;
        this.city = city;
        this.district = district;
        this.state = state;
    }

    public void showData(){
        System.out.println("Name: " + name + "\nContact: " + contact + "\nCity: " + city + "\nDistrict: " + district + "\nState: "+ state);
    }
};