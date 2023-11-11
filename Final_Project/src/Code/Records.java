package Code;
//updated
//import GUI.Display;	
import Code.Note;
import Code.timer;

public class Records {
    private Note noteInstance;
    private timer timerInstance;
    private Activity activityInstance;

    //Constructor for initializing the Note and timer instances
    public Records(String note, String timeString, String activityName, String date, String time) {
        this.noteInstance = new Note(note);
        this.timerInstance = new timer();
        this.activityInstance = new Activity(activityName, date, time, null);
    }


    /**
     * Update display function for the screen records
     */
    public void updateDisplay() {
   /**
    *assuming recordsDisplay() returns some kind of display component
    *"display" is just a place holder name for wherever we display stuff
    **/

    	//  GUI display = recordsDisplay();
    	
        /**
         *  Retrieve note and timeString from instances
         */
        String note = noteInstance.getNote();
        String timeString = timerInstance.getTimeString();
        String Activity = activityInstance.getActivityName();
        String date = activityInstance.getDate();
        String time = activityInstance.getTime();

        /**
         *  Set text on the display component
         *  
         */
       // display.setText(note + " " + timeString + " " + Activity + " " + date +
       //  " " + time);   
        
    }

    
   // private GUI recordsDisplay() {
        // Implementation of the method to get the display
        // ...
    }
//}
