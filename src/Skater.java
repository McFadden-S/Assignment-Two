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
        private final int MtoS = 60;   //number that converts minutes to seconds
        private final double DISTANCE = 5000;  //distance of the race
 	
 	// ********** instance variable **********
 	
        private int id;       // Skater id number
        private int[] minutes = new int[MAX];  //array for minute times
        private int[] seconds = new int [MAX];  //array for seconds times
        private int[] secondsTime = new int [MAX]; //array for race time in seconds
        private int amountTimes;       //variable for amount of times in the array
        private String sTimes;       //contains string for the times
        private int averageSecondTime;     //variable for average time of all the races
        private int totalSeconds;       //total number of seconds in the array
        private String averageTime;     //average time of the races
        private double averageSingleSpeedMS;  //average of a singe speed in m/s
        private double totalSpeed;        //all speeds added up
        private double averageSpeed;     //average of all speeds
        
        
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
            secondsTime = raceTime.returnTotalSeconds();
            amountTimes = raceTime.returnAmountTimes();
            sTimes = t;
     } // end default constructor
 	
 	// ********** accessors **********
 	
        /********************************************************
        * Purpose:        prints the skater's id number and race times
        *         
        * Interface:
        *     in:         None
        *     out:        Prints the id and times to consol window
        ********************************************************/
        public void printSkaterData(){
             System.out.println("Skater: " + id);
             System.out.println("Times: " + sTimes);
   
        } // end printSkaterData
        
        /********************************************************
        * Purpose:        returns average time of races
        *         
        * Interface:
        *     in:         None
        *     out:        Prints the id and times to consol window
        ********************************************************/
        public String returnAverageTime(){
             for (int i = 0; i < amountTimes; i++){
                 totalSeconds += secondsTime[i];
             }//end of for loop
             
             averageSecondTime = totalSeconds/amountTimes;
             averageTime = (averageSecondTime/MtoS) + ":" + (averageSecondTime%MtoS);
                     
             return(averageTime);
        } // end returnAverageTime
        
        /********************************************************
        * Purpose:        get average speed of one of the races
        *         
        * Interface:
        *     in:         race number
        *     out:        speed in km/h for single race
        ********************************************************/
        public double returnSingleSpeed (int num){
            averageSingleSpeedMS = DISTANCE/secondsTime[num]; 
                
               return (averageSingleSpeedMS * 3.6);
        } // end returnSingleSpeed
        
        /********************************************************
        * Purpose:        returns average speed of all races
        *         
        * Interface:
        *     in:         None
        *     out:        Prints the id and times to consol window
        ********************************************************/
        public double returnAverageSpeed(){
             for (int i = 0; i < amountTimes; i++){
                 totalSpeed += this.returnSingleSpeed(i);
             }//end of for loop
             
             averageSpeed = totalSpeed/amountTimes;
                     
             return(averageSpeed);
        } // end returnAverageSpeed
        
 	// ********** mutators **********
 
 }  // end class