package Code;

//import GUI.Display;	
import Code.Note;
import Code.timer;

public class Records {
    private Note noteInstance;
    private timer timerInstance;
    

    // Constructor for initializing the Note and timer instances
    public Records(String note, String timeString) {
        this.noteInstance = new Note(note);
        //this.timerInstance = new timer(timeString);
    }


    /**
     * Update display function for the screen records
     */
    public void updateDisplay() {
        // Assuming recordsDisplay() returns some kind of display component
      //  GUI display = recordsDisplay();

        // Retrieve note and timeString from instances
        String note = noteInstance.getNote();
       // String timeString = timerInstance.makeTimeString(
          //      timerInstance.timeConversion(timerInstance.getTime())
       // );

        /**
         *  Set text on the display component
         *  error is because ther
         */
       // display.setText(note + " " + timeString);   
        
    }

    // Assume you have a method like this in your class
   // private GUI recordsDisplay() {
        // Implementation of the method to get the display
        // ...
    }
//}
