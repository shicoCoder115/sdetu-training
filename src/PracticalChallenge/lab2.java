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
public class lab2 {
    
    public static void main(String[] args) {
        
        Student2 s1 = new Student2("Maxwell James", "342437895");
        Student2 s2 = new Student2("Janette Austin", "343255337");
        Student2 s3 = new Student2("Elizabeth Mary", "435562345");
        
        s1.Enroll("COMP1206");
        s1.Enroll("COMP1216");
        s1.Enroll("COMP1201");
        
        //s1.showCourses();
        //s1.checkBalance();
        s1.payTuition(600);
        //s1.checkBalance();
        System.out.println(s1.toString());
        
        
        /*
        s1.Enroll();
        s1.setPhone("+447496189815");
        s1.setCity("Norwish");
        s1.setState("N/A");
        System.out.println(s1.toString());
        s2.Enroll();
        s2.setCity("London");
        System.out.println(s2.toString());
*/
    }
    
}

class Student2{
    
    private static int iD = 1000;
    private String userID;
    private String name;
    private String email;
    private String SSN;
    private String Phone;
    private String City;
    private String State;
    public String courses = "";
    private static final int costofCourse = 800;
    private int balance = 0;
    
    
    public Student2(String name, String SSN){
        iD++;
        this.name = name;
        this.SSN = SSN;
        System.out.println("New Student Added.");
        setEmail();
        setUserId();

    }
    
    private void setEmail(){
        int random1 = (int) (Math.random() * 100);
        email = name.substring(0, 1).toLowerCase() + ""+ iD + "" +  random1 +"" + name.substring(name.length()-1) + "@soton.ac.uk";
        System.out.println("Your email is: " + email);
    }
    private void setUserId(){
        int random2 = (int) (Math.random() * 10000);
        userID = iD + "" + random2 + "" + SSN.substring(5);
        System.out.println("Your Student ID: " + userID);
    }
    //Add a course every time we enroll
    public void Enroll(String course){
        this.courses = this.courses + "\n" + course;
        //System.out.println(courses);
        balance = balance + costofCourse;

    }
    
    public void payTuition(int amount){
        System.out.println("Payment: £" + amount);
        balance = balance - amount;
    }
    public void checkBalance(){
        System.out.println("Balance: £" + balance);
    }
    
    public void showCourses(){
        System.out.println("Course: " + courses);
    }
    
    @Override
    public String toString(){
        return "[Student Name: " +  name + "\n[User ID: " + userID +"]\n"
        + "[Email: " + email + "]\n" + "[Course(s) Selected: "  + courses + "]\n" + "[Balance: £" + balance
                + "]";
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

}

    

