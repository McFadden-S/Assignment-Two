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
                 
            Times time = new Times(t);    //creates object time which will process time data
            
            minutes = time.returnMinutes();
            seconds = time.returnSeconds();
            totalSeconds = time.returnTotalSeconds();
            
     } // end default constructor
 	
 	// ********** accessors **********
 	
        /********************************************************
        * Purpose:        returns minute array
        *         
        * Interface:
        *     in:         none
        *     out:        return minutes
        ********************************************************/
        public void printSkaterData(){
             return minutes;
        } // end returnMinutes
        
 	// ********** mutators **********
 
 }  // end class