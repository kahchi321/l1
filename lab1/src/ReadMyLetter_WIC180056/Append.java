/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadMyLetter_WIC180056;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author HP
 */
public class Append {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            PrintWriter p=new PrintWriter(new FileOutputStream("Phoon Kah Chi_WIC180056.txt",true));
            p.println();
            p.println();
            p.println("Thursday, 10 May 2019");
            p.println();
            p.println("It’s me again. Finally, it’s the end of the term and the DS class has finished! I think I did well in this course.");
            p.close();
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
}
