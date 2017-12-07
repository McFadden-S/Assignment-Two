// **********************************************************************
// Programmer:      McFadden
// Class:           CS30S
//
// Assignment:      Assignment Two
//
// Description:     This program processes the data of skaters and prints
//                  out processed iformation such as their average time, speed,
//                  adding times and getting indivdual time from race.
//
//
// Input:           None
//
//  Output:         Will output the data on the skaters as well as their 
//                  average time, speed, adding times and getting indivdual 
//                  time from race.
// ***********************************************************************

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.text.DecimalFormat;

public class A2Client
{  // begin class
	public static void main(String args[]) throws FileNotFoundException, IOException
	{  // begin main
	
        // ***** declaration of constants *****
            
            final int SkaterMAX =20;
	
	// ***** declaration of variables *****
            
        String strin;    
        int counter = 0;
	
	// ***** create objects *****
        
        Skater[] skater = new Skater[SkaterMAX];
        
	// ***** create input stream *****
        
        BufferedReader fin = new BufferedReader(new FileReader("SkaterData.txt"));
        
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        McFadden");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  Assignment Two");
		System.out.println("**********************************");
		
	// ***** get input *****
	 
        strin = fin.readLine();
        while(strin != null){
            skater[counter] = new Skater(strin);
            skater[counter].printSkaterData();
            System.out.println(skater[counter].returnAverageTime());
            System.out.printf("%.2f", skater[counter].returnSingleSpeed(0));
            System.out.println(" km/h");
            System.out.printf("%.2f", skater[counter].returnAverageSpeed());
            System.out.println(" km/h");
            
            counter++;
            strin = fin.readLine();
        }//end of EoF loop
	
	
	// ***** processing *****
	
		
	// ***** output *****
	
		

	// ***** closing message *****
	
		System.out.println("\nend of processing");
	
	}  // end main	
}  // end class