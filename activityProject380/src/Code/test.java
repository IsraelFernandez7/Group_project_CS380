package Code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test {
	
	   @Test
	    public void testMakeTimeString() {
	        timer timeFormatter = new timer();
	        assertEquals("01 : 30 : 45", timeFormatter.makeTimeString(1, 30, 45));
	        assertEquals("00 : 15 : 05", timeFormatter.makeTimeString(0, 15, 5));
	        // Add more test cases as needed
	    }
	   
	   
	   @Test
	    public void testAddNote() {
	        // Test case 2: Adding a note to an existing note
	        Note existingNoteObj = new Note("Existing note");
	        existingNoteObj.addNote("Additional note");
	        assertEquals("Existing note Additional note", existingNoteObj.getNote());
	    }
	   @Test
	    public void testGetActivityName() {
	        // Test case 1: Testing getActivityName method
	        Activity activity = new Activity(null, null, null, null);
	        activity.setActivityName("Running");
	        assertEquals("Running", activity.getActivityName());
	        
	        // Test case 2: Testing getActivityName method with an empty name
	        Activity emptyNameActivity = new Activity(null, null, null, null);
	        emptyNameActivity.setActivityName("");
	        assertEquals("", emptyNameActivity.getActivityName());
	    }

	    @Test
	    public void testSetActivityName() {
	        // Test case 1: Testing setActivityName method
	        Activity activity = new Activity(null, null, null, null);
	        activity.setActivityName("Walking");
	        assertEquals("Walking", activity.getActivityName());
	    }

	}
	

