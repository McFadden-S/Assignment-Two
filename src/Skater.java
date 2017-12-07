/* **********************************************************
 * Programmer:      McFadden
 * Class:           CS30S
 * 
 * Assignment:      Assignment Two
 *
 * Description:	Object which has the following properties:
 *              average time, speed, adding times and getting 
 *              indivdual time from race
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Skater
 {  // begin class
 	
 	// *********** class constants **********
 	
        private static int nextId = 1000;      // unique skater id
        private final int MAX = 10;         //max number for array
 	
 	// ********** instance variable **********
 	
        private int id;       // Skater id number
        private int[] minutes = new int[MAX];  //array for minute times
        private int[] seconds = new int [MAX];  //array for seconds times
        private int[] totalSeconds = new int [MAX]; //array for race time in seconds
        private int amountTimes;       //variable for amount of times in the array
        private String sTimes;       //contains string for the times
        
        
        
 	// ********** constructors ***********
        
        /********************************************************
         * Purpose:        create a new default Skater object which will
         *                 read in times split it into a minute time and seconds
         *                 time array which will be parallel
         *                 
         *         
         * Interface:
         *     in:         Times
         *     out:        none
         ********************************************************/     
        public Skater(String t){
             id = nextId++;     // set id and increment for next instance
                 
            Times raceTime = new Times(t);    //creates object time which will process time data
            
            minutes = raceTime.returnMinutes();
            seconds = raceTime.returnSeconds();
            totalSeconds = raceTime.returnTotalSeconds();
            amountTimes = raceTime.returnAmountTimes();
            sTimes = t;
     } // end default constructor
 	
 	// ********** accessors **********
 	
        /********************************************************
        * Purpose:        prints the skater's id number and race times
        *         
        * Interface:
        *     in:         None
        *     out:        None
        ********************************************************/
        public void printSkaterData(){
             System.out.println("Skater: " + id);
             System.out.print("Times: " + sTimes);
   
        } // end returnMinutes
        
 	// ********** mutators **********
 
 }  // end class