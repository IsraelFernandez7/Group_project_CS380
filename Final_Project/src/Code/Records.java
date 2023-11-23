package Code;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;

//updated
//import GUI.Display;	
import Code.Note;
import Code.timerClass;

public class Records {
    private Note noteInstance;
    private timerClass timerInstance;
    private Activity activityInstance;
    
    
protected static void main(String[] args) {
	Database.connection();
}
	
	
    //Constructor for initializing the Note and timer instances
    public Records(String note, String timeString, String activityName, String date) {
        this.noteInstance = new Note(note);
        this.timerInstance = new timerClass();
        this.activityInstance = new Activity(activityName, date, timeString, null);
    }

    /**
     * print
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
    	System.out.println("Add Data");
        Database.add(textField_Activity.getActivityName(),
        		textField_date.getDate(), 
        		textField_timeString.getTimeString(),
        		textField_note.getNote());
    }
    
    
    /**
     * print button
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
    	System.out.println("Print Data");
        Database.printTable();
    }
   

    /**
     * remove button
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
    	System.out.println("Remove Data");
        Database.remove(textField_Activity.getActivityName(),
        		textField_date.getDate(), 
        		textField_time.getTime(),
        		textField_timeString.getTimeString(),
        		textField_note.getNote());
    }

    
    /**
     * this is the method for the update button 
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
    	System.out.println("Update Data");
        Database.update(textField_Activity.getActivityName(),
        		textField_date.getDate(),
        		textField_time.getTime(),
        		 
        		textField_timeString.getTimeString(),
        		textField_note.getNote());
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
