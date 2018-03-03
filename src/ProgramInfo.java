/* **********************************************************
 * Programmer:	McFadden
 * Class:	CS30S
 * 
 * Assignment:	program information class
 *
 * Description:	class to print banners and closing messages
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class ProgramInfo
 {  // begin class

    // *********** class constants **********

    // ********** instance variable **********

    // ********** constructors ***********
     public ProgramInfo(){
         
     } // end default constructor

    // ********** accessors **********
   
//*****************************************************
// Purpose: returns banner
// Interface: IN: none
// Returns: banner
// *****************************************************   
     public String getBanner(String a){
         String bannerOut = "";
         
    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		McFadden\n";
    	bannerOut += "Class:		CS30S\n";
    	bannerOut += "Assignment:	" + a + "\n";
    	bannerOut += "*******************************************\n\n";         
         
         return bannerOut;
     } //end of getBanner
     
//*****************************************************
// Purpose: return closing message
// Interface: IN: none
// Returns: closing message
// *****************************************************   
     public String getClosingMessage(){
         String closing = "end of processing.\n";
         
         return closing;
     }//end of getClosing Message

    // ********** mutators **********
 
 }  // end class