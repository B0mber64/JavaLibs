/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actuallyjavalibs;
import java.util.Scanner;
/**
 *
 * @author lnickloy
 */
public class ActuallyJavaLibs {
    
    /**
     * JavaLibs assignment for Mr Geiger
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop=0;
    //loop variable to continue or stop do/while loop.
        System.out.println("Welcome to the MadLib. \nPlease input your name.");
        String yourName=sc.nextLine();
    //Brackets for arrays. Arrays used for easier management and creation of multiple variables.
        String noun[]=new String[9];
        String verb[]=new String[9];
        String adjective[]=new String[9];
        int number[]=new int[9];
        System.out.println("Hello "+yourName+", are you ready for madness?");
        do{
            String response=sc.nextLine();
            response=response.toLowerCase();
            if(response.compareTo("yes")==0){
            System.out.println("Good choice.");
            loop++;
        //MadLib inputs start here <---
            System.out.println("Please input the following:");
            System.out.println("noun (plural): ");
            noun[0]=sc.nextLine();
            System.out.println("noun (plural): ");
            noun[1]=sc.nextLine();
            System.out.println("noun (plural, preferably a weapon): ");
            noun[2]=sc.nextLine();
            System.out.println("noun (singular, preferably a weapon): ");
            noun[3]=sc.nextLine();
            
            System.out.println("verb: ");
            verb[0]=sc.nextLine();
            System.out.println("verb (ing): ");
            verb[1]=sc.nextLine();
            System.out.println("verb: ");
            verb[2]=sc.nextLine();
            
            System.out.println("adjective: ");
            adjective[0]=sc.nextLine();
            System.out.println("adjective: ");
            adjective[1]=sc.nextLine();
            System.out.println("adjective: ");
            adjective[2]=sc.nextLine();
            System.out.println("adjective: ");
            adjective[3]=sc.nextLine();
            System.out.println("adjective: ");
            adjective[4]=sc.nextLine();
            
            System.out.println("number: ");
            number[0]=sc.nextInt();
            System.out.println("number: ");
            number[1]=sc.nextInt();
            System.out.println("number (less than the first number): ");
            number[2]=sc.nextInt();
            
            int remaining= number[0]-number[2];
            
        //Actual MadLib story <---
            System.out.println("On one "+adjective[0]+" day, "+yourName+
                               " wakes up and looks out their window to see "
                               +number[0]+""+adjective[1]+" "+noun[0]+".");
            System.out.println(yourName+" throws on a "+adjective[2]+" outfit and "
                               +verb[0]+" out the door to see what was going on");
            System.out.println("They see that the "+noun[0]+" are in a turf war against the "
                               +adjective[3]+" "+noun[1]+".");
            System.out.println("All "+number[1]+" "+noun[1]+" are "+verb[1]+" wildy with their "+noun[2]+" in hand.");
            System.out.println("In the middle of the fighting, one of the "+noun[0]+" hands "
                    +yourName+" a "+noun[3]+".");
            System.out.println("Filled with "+adjective[4]+" they "+verb[2]+" into battle.");
            System.out.println("In the end, the "+number[0]+" "+noun[0]+" overcame the "+number[1]);
            System.out.println("Sadly, "+number[2]+" of the "+noun[0]+" were lost in battle.");
            System.out.println("The remaining "+remaining+" "+noun[0]+" stand victorious");
            }
            else if(response.compareTo("no")==0){
            System.out.println("Why are you still here? Begone with you.");
            loop++;
            }
            else{
            System.out.println("This is a yes or no question. Please answer appropriately.");
        //will loop when entering anything other than "yes" or "no" and repeat the String above.
            }
        }
        while(loop==0);
    }
    
    
}
