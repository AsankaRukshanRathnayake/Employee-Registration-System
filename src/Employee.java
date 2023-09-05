import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Employee {
    private JPanel Main;
    private JButton saveButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton searchButton;
    private JTable table1;
    private JTextField textField4;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee");
        frame.setContentPane(new Employee().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    Connection con;
    PreparedStatement pst;

    public void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/abccompany","root","");
            System.out.println("Success");
        }catch (ClassNotFoundException ex){

        }catch (SQLException e){

        }
    }

    public Employee() {
    saveButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
