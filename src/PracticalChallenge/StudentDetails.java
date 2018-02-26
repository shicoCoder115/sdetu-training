/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticalChallenge;

/**
 *
 * @author sua2g16
 */
public class StudentDetails {
    
    public static void main(String[] args) {
        
        Student s1 = new Student("Maxwell James", "342437895");
        s1.Enroll();
        s1.setPhone("+447496189815");
        s1.setCity("Norwish");
        s1.setState("N/A");
        System.out.println(s1.toString());
    }
    
}

class Student{
    
    private static int iD = 2301;
    private String userID;
    private String name;
    private static String email;
    private String SSN;
    private String Phone;
    private String City;
    private String State;
    
    public Student(String name, String SSN){
        this.name = name;
        this.SSN = SSN;
        System.out.println("New Student Added.");
        int random1 = (int) (Math.random() * 100);
        email = name.substring(0, 1) + "" +  random1 +"" + name.substring(name.length()-1) + "@soton.ac.uk";
        
        
    }
    
    public void Enroll(){
        System.out.println("Enrolment processing");
        int random2 = (int) (Math.random() * 10000);
        userID = iD + "" + random2 + "" + SSN.substring(5);
        System.out.println("ID Created: " + userID);
    }
    
    public void Pay(){
        
    }
    public void checkBalance(){
        
    }
    @Override
    public String toString(){
        return "[Student Name: " +  name + "\n[User ID: " + userID +"]\n"
        + "[Email: " + email + "]\n" + "[Course Selected: "  + ""
                + "";
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    public void setState(String State) {
        this.State = State;
    }
        public String getState() {
        return State;
    }
    public void showCourses(){
        
    }
}
