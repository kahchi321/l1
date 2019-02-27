/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{
            Scanner s=new Scanner(new FileInputStream("text 1.txt"));
            int count=0;
            String str;
            while(s.hasNext()){
                str=s.next();
                for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=','){
                    System.out.print(str.charAt(i) + " ");
                    count++;
                }
                }
            }         
            s.close();
             System.out.println("");
            System.out.println("Number of character: "+ count);
        }
            catch(FileNotFoundException e){
                System.out.println("File not found");
            }
        catch(IOException e){
            System.out.println("IO Error");
        }
         
    }
    
}
