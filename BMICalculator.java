/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaHomework;

import java.util.Scanner;
import java.text.DecimalFormat;
//import java.lang.Math;


/**
 *
 * @author DELL
 */
public class BMICalculator {
    
    public static Scanner sc = new Scanner(System.in);
    /*public static int help;
    public static int confirm;
    public static int check_confirm;*/
    
    //(Weight in kg.) / ((Height in cm./100)^2)
    public static double calculate(double weight, double height){
        weight = weight * 1;
        height = Math.pow((height/100),2);
        return weight / height;
    }
    
    public static String message(double BMI) {
        if (BMI > 30) 
            {
                return "Your way to chubby!!";
            }
            else if (BMI < 15) 
            {
                return "You need to eat more!!!";
            }
            else 
            {
                return "Your BMI is Perfect!!";
            }
    }   
    
    public static void main(String[] args) {
        String name;
        double height;
        double weight;
        
        //Input data
        System.out.println ("----------------------------------------------");    
        System.out.println ("           Welcom to BMI Calculator           ");
        System.out.println ("----------------------------------------------");  
        
        System.out.print   ("Enter your name: ");
            name = sc.next();
        System.out.print   ("Enter your weight in kilogram: ");
            weight = sc.nextDouble();
        System.out.print   ("Enter your height in centimeter: ");
            height = sc.nextDouble();    
        System.out.println ("----------------------------------------------");     
        
        //Calculate BMI
        double BMI = calculate(weight, height);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println ("Your BMI is " + (df.format(BMI)));
        System.out.println ("----------------------------------------------");    
        System.out.println(message(BMI)); 
             
        check_confirm(suggestion());         
    }
    
    public static int suggestion() {
        int help = 0;
       
        do
        {    
        System.out.println ("----------------------------------------------");      
        System.out.println ("         Do you need some suggestion?         ");
        System.out.println ("1. Yes I do");
        System.out.println ("2. No I don't");
        System.out.println ("----------------------------------------------"); 
        System.out.print   ("Choose your choices: ");
            help = sc.nextInt();            
        } while(help <= 0 || help >= 3); 
        return help;
    }
    
    public static void check_confirm(int choice) { //choice = suggestion
        int confirm = 0;
        
        do
        {    
        System.out.println ("----------------------------------------------"); 
        System.out.println ("                Are you sure?                 ");
        System.out.println ("1. Yes");
        System.out.println ("2. No");
        System.out.println ("----------------------------------------------"); 
        System.out.print   ("Choose your choices: ");    
            confirm = sc.nextInt();
        } while(confirm <= 0 || confirm >= 3);
        if (confirm == 1) 
        {
            condition(choice);
        }  
        else
        {
            check_confirm(suggestion());
        }
    }
    
    public static void condition(int check_confirm) {
         
        switch (check_confirm) {
            case 1:
            {   System.out.println ("----------------------------------------------"); 
                System.out.println ("Open this link for exercise program: https://chloetingting.com/program/");
                System.out.println ("                                     ");
                System.out.println ("Open this link for meals idea: https://chloeting.com/recipes/");
                System.out.println ("----------------------------------------------");  
                System.out.println ("Fighting!!! for your new body :)");
                System.out.println ("----------------------------------------------"); 
            break;
            }
            
            case 2:
            {   System.out.println ("----------------------------------------------");  
                System.out.println("Have a nice day!!!");
                System.out.println ("----------------------------------------------"); 
            break;
            }    
        }     
    }    
}