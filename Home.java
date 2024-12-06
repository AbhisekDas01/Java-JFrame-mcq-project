
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class Home extends JFrame implements ActionListener
{
    //atributes
    JButton stats , practice , suggestive , logout;
    String Name; 
    public int score;

    public Home(String name)
    {
        Name = name;
        setSize(400 , 300);
        setTitle("Home - "+name);
        setLayout(null);
        // setLocation(450,200);
        setLocationRelativeTo(null);

        //set buttons
        stats = new JButton("Know your scores");
        practice = new JButton("Practice Test");
        suggestive = new JButton("Exam rules");
        logout = new JButton("Logout");

        stats.setBounds(100, 50, 200, 40); // x, y, width, height
        practice.setBounds(100, 100, 200, 40);
        suggestive.setBounds(100, 150, 200, 40);
        logout.setBounds(100, 200, 200, 40);

        //add action lisenters
        stats.addActionListener(this);
        practice.addActionListener(this);
        suggestive.addActionListener(this);
        logout.addActionListener(this);
          // Add buttons to the frame
        add(stats);
        add(practice);
        add(suggestive);
        add(logout);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == logout)
        {
            dispose(); //close the window 
            new LoginPage(); // go to login page
        }
        if(e.getSource() == practice)
        {
            setVisible(false);

            new Question(Name , this , score);
        }
        if(e.getSource() == suggestive)
        {
            setVisible(false);

            new ExamRules(this);
        }
        if(e.getSource() == stats)
        {
            setVisible(false);
            
            new ScorePage(this, score , Name);
        }
    }
}
