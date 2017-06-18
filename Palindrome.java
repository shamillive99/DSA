/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author ESOFT
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Enter a Potential Palindrome: ");
         Scanner sc = new Scanner(System.in);
         String st = sc.nextLine();
      
         String st2 = st.toLowerCase().replaceAll("[^a-z]", ""); // Remove data from user input(Regex)
         System.out.println(st2);
         String st3 = new String();
         for(int i =st2.length()-1;i>=0;i--){
             st3+=st2.charAt(i);
         }
         if(st3.equals(st2)){
             System.out.println("It is a Palindrome");
         }
         else{
             System.out.println("IT is not a Palindrome");
         }
    }
}