/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filehandling;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author mehraj
 */
public class FileHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("Lab08_01.txt");
        try (
                PrintWriter output = new PrintWriter(file);
                ) {
            for (int i = 0; i < 100; ++i) {
                int num;
                num = (int) (Math.random() * 100);
                output.print(num);
                output.print(" ");
            }
            output.close();
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
            
            

    }

}
