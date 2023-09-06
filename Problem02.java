/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author mehraj
 */
public class Problem02 {

    public static void main(String[] args) {
        File file = new File("Lab08_02.dat");
        try (
                FileOutputStream out = new FileOutputStream(file); DataOutputStream output = new DataOutputStream(out);) {
            for (int i = 0; i < 100; ++i) {
                int num;
                num = (int) (Math.random() * 100);
                output.writeInt(num);
                output.writeUTF(" ");
            }

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }
}
