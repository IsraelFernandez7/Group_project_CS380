
package Code;

import java.util.Timer;
import java.util.TimerTask;

public class timerClass {

	private String timeString;
	public int time = 0; 
	public Timer timer = new Timer();
	
	
		/**
		 * starting methot
		 */
	
		public void start1() {
	        timer.scheduleAtFixedRate(new TimerTask() {
	            @Override
	            public void run() {
	                action();
	            }
	        }, 0, 1000);
	    }

		/**
		 *function to stop the timer
		 */
	    public void stop1() {														
	    	//stop timer
	        timer.cancel();
	    }

	    /**
	     * function to reset the timer
	     */
	    public void reset1() {
	    	timer.cancel();
	        time = 0;
	        //clear time
	        //lbl1.setText("00 : 00 : 00");			//****************************
	    }

	    /**
	     * //function to start the timer
	     */
	    public void action() {														
	        //increment by 1
	    	time = time + 1;
	    	//calling timer conversion
	        int[] timing = timeConversion(time);
	        //setting up the string for the timer
	        String timeString = makeTimeString(timing[0], timing[1], timing[2]);
	        //lbl1.setText(timeString);				//*****************************
	    }

	    /**
	     * function to convert seconds to minutes then minutes to hours
	     * @param seconds
	     * @return
	     */
	    public int[] timeConversion(int seconds) {									
	        //three elements
	    	int[] result = new int[3];
	    	//seconds
	        result[0] = seconds / 3600;
	        //minutes
	        result[1] = (seconds % 3600) / 60;
	        //hours
	        result[2] = (seconds % 3600) % 60;
	        return result;
	    }


	    public String makeTimeString(int hours, int minutes, int seconds) {
	        // Creating the timeString
	        timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
	        return timeString;
	    }
	 
	    public String getTimeString() {
	    	return timeString;
	    }
}
