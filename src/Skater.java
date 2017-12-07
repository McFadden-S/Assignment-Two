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
        private final double MStoKH = 3.6;   //number that converts m/s to km/h
        private final double DISTANCE = 5000;  //distance of the race
 	
 	// ********** instance variable **********
 	
        private int id;       // Skater id number
        private int[] NormalizedTime = new int [MAX]; //array for race time in seconds
        private String[] time = new String [MAX];      //array for times as a string
        private int amountTimes;       //variable for amount of times in the array
        private int averageSecondTime;     //variable for average time of all the races
        private int totalSeconds;       //total number of seconds in the array
        private String averageTime;     //average time of the races
        private double averageSingleSpeedMS;  //average of a singe speed in m/s
        private double averageSingleSpeedKH;  //average of a singe speed in k/h 
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
           
            NormalizedTime = raceTime.returnNormalizedTime(); //get times as seconds
            amountTimes = raceTime.returnAmountTimes(); //gets amount of times
            
            for (int i = 0; i < amountTimes; i++){
                time[i] = raceTime.returnTimes()[i]; //assign time as strings into string array
            }//end of for loop
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
             System.out.println("Skater: " + id); //prints id
             System.out.println("Time: "); //header
             
             for (int i = 0; i < amountTimes; i++){
             System.out.print(time[i] + " "); //prints times
             }//end of for loop
             
             System.out.print("\n"); //creates new lines
        } // end printSkaterData
        
         /********************************************************
        * Purpose:        get time of one of the races
        *         
        * Interface:
        *     in:         race number
        *     out:        time for single race
        ********************************************************/
        public String returnSingleTime (int num){
               return (time[num]); //returns single time
        } // end returnSingleSpeed
        
        /********************************************************
        * Purpose:        returns average time of races
        *         
        * Interface:
        *     in:         None
        *     out:        Prints the id and times to consol window
        ********************************************************/
        public String returnAverageTime(){
             for (int i = 0; i < amountTimes; i++){
                 totalSeconds += NormalizedTime[i]; //creates running total
             }//end of for loop
             
             averageSecondTime = totalSeconds/amountTimes; //calculates average time in seconds
             //converts seconds to minutes and seconds
             averageTime = (averageSecondTime/MtoS) + ":" + (averageSecondTime%MtoS);
                   
             return(averageTime); //returns average time in minutes and seconds
        } // end returnAverageTime
        
        /********************************************************
        * Purpose:        get average speed of one of the races
        *         
        * Interface:
        *     in:         race number
        *     out:        speed in km/h for single race
        ********************************************************/
        public double returnSingleSpeed (int num){
            //finds the speed in m/s
            averageSingleSpeedMS = DISTANCE/NormalizedTime[num];
            //converst m/s to km/h
            averageSingleSpeedKH = averageSingleSpeedMS * MStoKH;
                
               return (averageSingleSpeedKH); //returns km/h
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
                 //creats running total for speed
                 totalSpeed += this.returnSingleSpeed(i);
             }//end of for loop
             //calculates average speed
             averageSpeed = totalSpeed/amountTimes;
                     
             return(averageSpeed); //returns average speed
        } // end returnAverageSpeed
        
 	// ********** mutators **********
        
        /********************************************************
        * Purpose:        Adds a new time to the array
        *         
        * Interface:
        *     in:         new time
        *     out:        None
        ********************************************************/
        public void addTime(String n){
            Times T = new Times(n); 
            
            if (amountTimes < MAX){ //execute if under max amount of values
                //adds new value in next open space
                NormalizedTime[amountTimes] = T.returnNormalizedTime()[0];
                //adds new value in next open space
                time[amountTimes] = T.returnTimes()[0];
                //increase amount of times because of new time added
                amountTimes = amountTimes+1;
             }//end of if
            else{ //execute if array is full
                for (int i = 0; i < amountTimes-1; i++){
                    //shifts all data over one place, removing first data
                    NormalizedTime[i] = NormalizedTime[i+1];
                    //shifts all data over one place, removing first data
                    time[i] = time[i+1];
                }//end of for loop
                //adds new time at end of array
                NormalizedTime[MAX-1] = T.returnNormalizedTime()[0];
                //adds new time at end of array
                time[MAX - 1] = T.returnTimes()[0];
            }//end of else
                     
        } // end addTime
 }  // end class