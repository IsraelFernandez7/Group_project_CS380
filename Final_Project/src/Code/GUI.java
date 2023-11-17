package Code;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame activityFrame;
	private JFrame SetupFrame;
	private JFrame recordsFrame;
	private JTextField name = new JTextField(30);
	private boolean menuClosed = false;
	private JLabel menuText = new JLabel("Main Menu");
	private JButton startActivity = new JButton("Start Activity");
   	private JButton Review = new JButton("Review Records");
   	private JButton start = new JButton("Start");
   	private JButton Pause = new JButton("Pause");
   	private JButton addNote = new JButton("Add Note");
   	private JButton Reset = new JButton("Reset");
   	private JLabel activityName;
   	private JLabel activitySetupHeader;
   	private JLabel activityHeader;
   	private JTextArea activityOptional = new JTextArea();
   	private JTextArea activityNotes = new JTextArea();
   	private JLabel timerLabel = new JLabel("00 : 00 : 00");;
	private int time = 0; 
	private Timer timer;
	
	public void recordsFrameOptions() {
		
	}
	public void activitySetupFrameOptions() {
		start.addActionListener(this);
		JPanel mainPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JPanel fieldPanel = new JPanel();
		JPanel textpanePanel = new JPanel();
		SetupFrame = new JFrame();
		SetupFrame.setVisible(true);
		SetupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SetupFrame.setBounds(200, 200, 450, 300);
		SetupFrame.add(mainPanel);
		mainPanel.add(textpanePanel);
		mainPanel.add(fieldPanel);
		mainPanel.add(buttonPanel);
		fieldPanel.add(name);
		buttonPanel.add(start);
		textpanePanel.add(activityOptional);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
	}
	
	public void activityFrameOptions() {
		Pause.addActionListener(this);
		Reset.addActionListener(this);
		JPanel timerPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JPanel textPanel = new JPanel();
		JPanel notesPanel = new JPanel();
		JPanel activityPanel = new JPanel();
		activityFrame = new JFrame();
		activityFrame.setVisible(true);
		activityFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		activityFrame.setBounds(200, 200, 450, 300);
		activityFrame.add(activityPanel);
		activityPanel.add(textPanel);
		activityPanel.add(notesPanel);
		activityPanel.add(timerPanel);
		activityPanel.add(buttonPanel);
		notesPanel.add(activityNotes);
		timerPanel.add(timerLabel);
		buttonPanel.add(Pause);
		buttonPanel.add(addNote);
		buttonPanel.add(Reset);
		activityPanel.setLayout(new BoxLayout(activityPanel, BoxLayout.Y_AXIS));
		start1();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == startActivity) {
			this.dispose();
			activitySetupFrameOptions();
		}
		if(e.getSource()== start) {
			SetupFrame.dispose();
			activityFrameOptions();
		}
		if(e.getSource() == Pause) {
			stop1();
		}
		if(e.getSource() == Reset) {
			reset1();
		}
	}
	public void start1() {
	    	timer = new Timer();
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
	    	timer.cancel();
	        time = 0;
	        //clear time
	        timerLabel.setText("00 : 00 : 00");													//label for the time 
	        start1();
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
		startActivity.addActionListener(this);
		Review.addActionListener(this);
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
	}


}
