/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formattted.output.to.text.file;

import java.io.File;
import java.util.Formatter;

/**
 *
 * @author Dell
 */
public class FormatttedOutputToTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    throws Exception{
        Formatter out=new Formatter(new File("out.txt"));//Declare the formatter for the output
        int grade1=89;
        double grade2=82;
        String name="Jaspreet Singh";
        double average=(grade1+grade2)/2;
        out.format("hello %s%n", name);//store the name in the output file
        
    } 
    
}
