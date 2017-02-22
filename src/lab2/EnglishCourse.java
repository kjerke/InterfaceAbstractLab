/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author kevinjerke
 */
public class EnglishCourse implements Course {
     private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public EnglishCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() < 7 || courseNumber.length() > 7) {
            throw new IllegalArgumentException("course number must be digits in format ddd-ddd");
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < 0 || credits > 4) {
            throw new IllegalArgumentException("credits must be in range 0 to 4");
        }
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.isEmpty()) {
            this.prerequisites = "None";
        }
        this.prerequisites = prerequisites;
    }

   
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("courseName is mandatory");
        }
        this.courseName = courseName;
    }
}
