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
            
            final int SkaterMAX = 20;
	
	// ***** declaration of variables *****
            
        String strin;  //string for times read in
        int counter = 0;
        String newTime = "1:00"; //default "new" time
	
	// ***** create objects *****
        
        Skater[] skater = new Skater[SkaterMAX]; //creates new skater object array
        
	// ***** create input stream *****
        
            //creates reader to read in data
        BufferedReader fin = new BufferedReader(new FileReader("skaterData.txt"));
        
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        McFadden");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  Assignment Two");
		System.out.println("**********************************\n");
		
	// ***** Main Body *****
	 
        strin = fin.readLine(); //reads in new line and primes the loop
        
        while(strin != null){//EoF Loop
            
            //creates new skater object
            skater[counter] = new Skater(strin);
            
            System.out.println(skater[counter].toString());
            
            //adds new time which is predetermined as 1:00
            skater[counter].addTime(newTime);
            
            //prints updated times
            System.out.print("Updated Times For ");
            System.out.println(skater[counter].returnSkaterData());
            
            //creates divider between skaters
            System.out.println("\n**********************************\n");
             
            counter++;//ads
            strin = fin.readLine();
        }//end of EoF loop

	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class