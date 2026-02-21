import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Project extends JFrame implements  ActionListener{
    Project() {
        setSize(1540, 850);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(350, 00, 200, 200);
		add(image);

        JMenuBar mb = new JMenuBar();

        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);

        JMenuItem studnetInfo = new JMenuItem("New Student Information");
        studnetInfo.setBackground(Color.WHITE);
        studnetInfo.addActionListener(this);
        newInformation.add(studnetInfo);

        //Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);

        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        JMenuItem studnetdetails = new JMenuItem("View Student Details");
        studnetdetails.setBackground(Color.WHITE);
        studnetdetails.addActionListener(this);
        details.add(studnetdetails);

        //Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);  
        mb.add(leave);

        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);

        JMenuItem studnetleave = new JMenuItem("Student Leave");
        studnetleave.setBackground(Color.WHITE);
        studnetleave.addActionListener(this);
        leave.add(studnetleave);

        //leave Details
        JMenu leavedetails = new JMenu("Leave Details");
        leavedetails.setForeground(Color.RED);
        mb.add(leavedetails);

        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leavedetails.add(facultyleavedetails);

        JMenuItem studnetleavedetails = new JMenuItem("Student Leave Details");
        studnetleavedetails.setBackground(Color.WHITE);
        studnetleavedetails.addActionListener(this);
        leavedetails.add(studnetleavedetails);

        //Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);

        JMenuItem examinationdetailsdetails = new JMenuItem("Examination Results");
        examinationdetailsdetails.setBackground(Color.WHITE);
        examinationdetailsdetails.addActionListener(this);
        exam.add(examinationdetailsdetails);

        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);

        //UpdateInfo
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);

        JMenuItem updatefacultyInfo = new JMenuItem("Update Faculty Details");
        updatefacultyInfo.setBackground(Color.WHITE);
        updatefacultyInfo.addActionListener(this);
        updateInfo.add(updatefacultyInfo);

        JMenuItem updatestudentInfo = new JMenuItem("Update Student Details");
        updatestudentInfo.setBackground(Color.WHITE);
        updatestudentInfo.addActionListener(this);
        updateInfo.add(updatestudentInfo);

         //Fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);
 
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);

        JMenuItem feeform= new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);

         //Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        mb.add(utility);

        JMenuItem notepad = new JMenuItem("NotePad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);

         //About
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLUE);
        mb.add(about);

        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);

         //Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);

        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);



        setJMenuBar(mb);

        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if(msg.equals("Exit")) {
            setVisible(false);
        }
        else if(msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(msg.equals("NotePad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(msg.equals("New Student Information")) {
            new AddStudent();  
        }
        else if(msg.equals("New Faculty Information")) {
            new AddTeacher();
        }
        else if(msg.equals("View Faculty Details")) {
            new TeacherDetails();
        }
        else if(msg.equals("View Student Details")){
            new StudentDetails();
        }
        else if(msg.equals("Faculty Leave")) {
            new TeacherLeave();
        }
        else if(msg.equals("Student Leave")){
            new StudentLeave();
        }
        else if(msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        }
        else if(msg.equals("Student Leave Details")){
            new StudentLeaveDetails();
        }
        else if(msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        }
        else if(msg.equals("Update Student Details")){
            new UpdateStudent();
        }
        else if(msg.equals("Enter Marks")){
            new EnterMarks();
        }
        else if(msg.equals("Examination Results")){
            new ExaminationDetails();
        }
        else if(msg.equals("Fee Structure")){
            new FeeStructure();
        }
        else if(msg.equals("About")){
            new About();
        }
        else if(msg.equals("Student Fee Form")){
            new StudentFeeForm();
        }

    }

    public static void main(String [] args) {
        new Project();
    }

}