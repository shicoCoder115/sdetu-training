package oop;


class Person{
    String name;
    String email;
    String phone;
    
    void walk(){
        System.out.println(name + " is walking");
    }
    
    void eat(){
        System.out.println("would you like to use this email " + email + " to order your food?");
    }
    
    void sleep(){
        System.out.println(name + " is sleeping.");
    }
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sua2g16
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create an instance of the person class 
        //instantiating an object
        Person p1 = new Person();
        Person p2 = new Person();
        //define some properties
        p1.name = "Sherif";
        p1.email = "sua2g16@soton.ac.uk";
        p1.phone = "07722049932";
        
        p2.name = "Burnsy";
        p2.sleep();
        
        //Abstraction
        p1.walk();
        
        //
        p1.eat();
        ///
        p1.sleep();
        
        }
        
        /*
        //Person - 
        //Attributes, variables, adjectives, descriptors
        String name = "Sherif";
        String email = "sua2g16@soton.ac.uk";
        String phone = "07496189815";
        
        //Actions, activities, behaviour
        
        walking(name);
        
        //System.out.println(name + "is eating");
        //System.out.println(name + "is sleeping");
        //What if we wanted to do this for another person? (Inefficient way)
        String name2 = "Burns";
        String email2 = "burnsy212@soton.ac.uk";
        String phone2 = "07492349815";
        
        //Actions, activities, behaviour

        System.out.println(name + " is eating");
        System.out.println(name + " is sleeping");
        walking(name2);
        System.out.println(name2 + " is workign");
        System.out.println(name2 + " is learning java");
       
        //What about binding attributes and properties together
*/
    
    
    //Enhance by adding functions to minimize code
    /*
    static void walking(String name){
        
        System.out.println(name + " is walking");
        
    }*/
    
}
