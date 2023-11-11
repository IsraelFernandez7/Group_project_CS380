package Code;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel menuText = new JLabel("Main Menu");
	private JButton startActivity = new JButton("Start Activity");
   	private JButton Review = new JButton("Review Records");
   	private JButton start;
   	private JButton Pause;
   	private JButton addNote;
   	private JButton Reset;
   	private JLabel activityName;
   	private JLabel activitySetupHeader;
   	private JLabel activityHeader;
   	private JTextArea activityOptional;
   	private JTextArea activityNotes;
   	private JLabel timerLabel = new JLabel();
	private int time = 0; 
	private Timer timer = new Timer();
	
	

	    public void start1() {
	        timer.scheduleAtFixedRate(new TimerTask() {
	            @Override
	            public void run() {
	                action();
	            }
	        }, 0, 1000);
	    }

	    public void stop1() {																//function to stop the timer
	    	//stop timer
	        timer.cancel();
	    }

	    public void reset1() {
	    	//stop timer
	    	timer.cancel();
	        time = 0;
	        //clear time
	        timerLabel.setText("00 : 00 : 00");													//label for the time 
	    }

	    public void action() {																//function to start the timer
	        //increment by 1
	    	time = time + 1;
	    	//calling timer conversion
	        int[] timing = timeConversion(time);
	        //setting up the string for the timer
	        String timeString = makeTimeString(timing[0], timing[1], timing[2]);
	        timerLabel.setText(timeString);														//label for the time
	    }

	    public int[] timeConversion(int seconds) {											//function to convet seconds to minutes then minutes to hours
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

	    public String makeTimeString(int hours, int minutes, int seconds) {					//making the timer to the string
	        String timeString = "";
	        //hours
	        timeString += String.format("%02d", hours);
	        timeString += " : ";
	        //minutes
	        timeString += String.format("%02d", minutes);
	        timeString += " : ";
	        //seconds
	        timeString += String.format("%02d", seconds);
	        return timeString;
	    }
	

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		JPanel TextPanel = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		add(contentPane);
		contentPane.add(TextPanel);
		TextPanel.add(menuText);
		contentPane.add(startActivity);
		contentPane.add(Review);

		setContentPane(contentPane);
	}

}
