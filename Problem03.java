/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author mehraj
 */
public class Problem03 {
    public static void main(String[] args){
        File file = new File("Lab08_01.txt");
        File fileWrite = new File("Lab08_03.dat");
        try(
            Scanner input = new Scanner(file);
            DataOutputStream output = new DataOutputStream(new FileOutputStream(fileWrite));
                ){
            while(input.hasNext()){
                int n = input.nextInt();
                output.writeInt(n);
                System.out.println(n + " ");
                output.writeUTF(" ");              
            }
            
        }catch(Exception e){
            System.out.println("Error : " + e);
            
        }
        
    }
    
}
