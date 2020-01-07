/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

import java.util.Scanner;

/** Store information of number of students in an array by creating array of objects and
 * display them
 * My first Program
 * @author Megha, Winter 2020
 */
public class DisplayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student[] s=new Student[2];
       // Student st1=new Student();
       // st1.setName("Megha");
        
       // s[0]=st1;
       Scanner scan=new Scanner(System.in);
        System.out.println("length: "+s.length);
       for(int i=0;i<s.length;i++)
       {
           s[i]=new Student();
           System.out.println("Enter name: ");
           s[i].setName(scan.nextLine());
       
       }
        
        
        

    }
    
}
