/* **********************************************************
 * Programmer:	McFadden
 * Class:	CS30S
 * 
 * Assignment:	Assignment Two
 *
 * Description:	Processes time string into required data
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Times
 {  // begin class
 	
 	// *********** class constants **********
 	
        private static int nextId = 1000;      // unique skater id
        private final int MAX = 10;         //max number for array
        private final int MtoS = 60;   //number that converts minutes to seconds
 	
 	// ********** instance variable **********
 	private int id;       // Skater id number
        
        private int[] minutes = new int[MAX];  //array for minute times
        private int[] seconds = new int[MAX];  //array for seconds times
        private int[] totalSeconds = new int[MAX]; //array for race time in seconds
        
        private String[] tokens1;   //holds the seperated times
        private String[] tokens2;   //holds seperated time and minutes
        private int amountTimes; //amout of times for the skater
        private String delim1 = "[ ]+";  //used to split time data into indiviudal times
        private String delim2 = "[:]+";  //used to split time data into minutes and seconds
     
 	// ********** constructors ***********
 	
        /********************************************************
         * Purpose:        read in times split it into a minute time and seconds
         *                 time array which will be parallel
         *                 
         *         
         * Interface:
         *     in:         Times
         *     out:        none
         ********************************************************/     
        public Times(String times){
             id = nextId++;     // set id and increment for next instance
             
             tokens1 = times.split(delim1);   //splits string of time into individual times
             amountTimes = tokens1.length;  //meassures how many times there are
             
             for(int i = 0; i < amountTimes; i++){
                 tokens2 = tokens1[i].split(delim2);
                 
                 minutes[i] = Integer.parseInt(tokens2[0]);
                 seconds[i] = Integer.parseInt(tokens2[1]);
                 
                 totalSeconds[i] = minutes[i] * MtoS + seconds[i];
         } // end of for loop o construct parellel arrays 
     } // end default constructor
        
 	// ********** accessors **********
        
        /********************************************************
        * Purpose:        returns minute array
        *         
        * Interface:
        *     in:         none
        *     out:        return minutes
        ********************************************************/
        public int[] returnMinutes(){
             return minutes;
        } // end returnMinutes
 	
        /********************************************************
        * Purpose:        returns seconds array
        *         
        * Interface:
        *     in:         none
        *     out:        return seconds
        ********************************************************/
        public int[] returnSeconds(){
             return seconds;
        } // end returnSeconds
        
        /********************************************************
        * Purpose:        returns total seconds array
        *         
        * Interface:
        *     in:         none
        *     out:        return totalSeconds
        ********************************************************/
        public int[] returnTotalSeconds(){
             return totalSeconds;
        } // end returnTotalSeconds
        
        /********************************************************
        * Purpose:        returns amount of times there are
        *         
        * Interface:
        *     in:         none
        *     out:        return amountTimes
        ********************************************************/
        public int returnAmountTimes(){
             return amountTimes;
        } // end returnAmountTimes
        
 	// ********** mutators **********
 
 }  // end class