/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mehraj
 */
class List implements Serializable{
    int Index;
    int MaxSize;
    int[] Data;
    List(){
        Data = new int[10];
        for(int d: Data){
            d = -1;
        }
        Index = -1;
    }
    List(int max){
        Data = new int[max];
        Index = -1;
    }
    
    public void push(int d){
        Index++;
        Data[Index] = d;
    }
    public void pop(){
        Data[Index] = -1;
        Index--;
    }
    public void display(){
        for(int d: Data){
            System.out.print(d + " ");
        }
        System.out.println("");
    }
    public int top(){
        return Data[Index];
    }
}
public class Problem04 {
    public static void main(String[] args){
        File file = new File("Lab08_04.dat");
        ArrayList<List> list = new ArrayList<List>();
       
        for(int i = 0; i < 5; ++i){
            int s = (int)(Math.random()*10);
            List l = new List(s);
            for(int j = 0; j < s;++j){
                l.push((int)(Math.random()*100));
            }
            list.add(l);
            
            
            
            
        }
        
        try( ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));){
               for(List l : list){
                    output.writeObject(l);
                    l.display();
                           
               }
               output.close();
            }catch(Exception e ){
                System.out.println(e);
            }
        
        
        
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));){
     
                while(input.available() == 0){
                    List ll = (List)input.readObject(); 
                    if(ll != null){
                        ll.display();
                    }else{
                        break;
                    }
                }
            }catch(Exception e ){
                System.out.println(e);
            }
        
        System.out.println("Exception worked ");
        
        
        
        
        
        
    }
    
}
