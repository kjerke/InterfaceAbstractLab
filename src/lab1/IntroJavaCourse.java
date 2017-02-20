package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourses {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private String REQUIRED_MSG = " Are Required";

    public IntroJavaCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites " + REQUIRED_MSG);
            System.exit(0);
        this.prerequisites = prerequisites;
    }

    }   
}
