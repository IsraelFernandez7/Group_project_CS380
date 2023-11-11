package Code;

public class Activity {
	
	//variables that will be used
	private Note note;
	private String date;
	private String time;
	private String activityName;
	
	/**
	 * constructor for Activity class
	 * @param activityName name of activity
	 * @param date date of when activity was created
	 * @param time amount of time that was saved during the activity
	 * @param note notes that may have been written
	 */
	public Activity (String activityName, String date, String time, Note note) {
		this.activityName = activityName;
		this.date = date;
		this.time = time;
		this.note = note;
	}
	
	/**
	 * method to get activity name
	 * @return the name of the activity
	 */
	public String getActivityName() {
		return activityName;
	}
	
	/**
	 * method to get note object
	 * @return note object
	 */
	public Note getNote() {
		return note;
	}
	
	/**
	 * method to return date of when activity occurred
	 * @return the date activity happened
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * method that returns how long the activity went for
	 * @return the time the activity took
	 */
	public String getTime() {
		return time;
	}
}
