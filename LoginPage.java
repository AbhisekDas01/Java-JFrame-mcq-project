import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class LoginPage extends JFrame implements ActionListener {    
    JButton loginButton;
    JLabel user, l;
    JTextField userid;

    public LoginPage() {
        setSize(400, 300);
        setTitle("Quiz Test");
        setLayout(null);
        setLocationRelativeTo(null);

        // To close the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l = new JLabel("Login Page:");
        l.setFont(new Font("Verdana", Font.BOLD, 14));
        user = new JLabel("Enter Name:");
        user.setFont(new Font("Verdana", Font.PLAIN, 14));
        userid = new JTextField();
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Verdana", Font.PLAIN, 14));

        // Setting bounds for components
        l.setBounds(150, 10, 100, 30);
        user.setBounds(50, 50, 100, 30);
        userid.setBounds(150, 50, 150, 30);
        loginButton.setBounds(150, 100, 100, 30);
        loginButton.addActionListener(this);
        setVisible(true);

        // Adding components to the frame
        add(l);
        add(user);
        add(userid);
        add(loginButton);
    }

    public void actionPerformed(ActionEvent e) {
        String name = userid.getText();
        if (!name.isEmpty()) {
            setVisible(false); // Close the current window
            // Call for home page with a personalized greeting
            new Home(name);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter your name.");
        }
    }

    //main method
    public static void main(String[] args) {
        
        LoginPage ob = new LoginPage();
    }
}