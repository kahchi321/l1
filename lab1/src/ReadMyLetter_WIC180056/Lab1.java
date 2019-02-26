/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadMyLetter_WIC180056;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Scanner s=new Scanner(new FileInputStream("Phoon Kah Chi_WIC180056.txt"));
            while(s.hasNextLine()){
                System.out.println(s.nextLine());
            }
            s.close();
            
        }
            catch(FileNotFoundException e){
                System.out.println("File not found");
            }
        catch(IOException e){
            System.out.println("IO Error");
        }
            
                    
    }
    
}
