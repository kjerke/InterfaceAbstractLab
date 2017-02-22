/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author kevinjerke
 */
public class College {
    private String name;
    private List<Course> courseCatalog;
    
    
    public College(String name) {
        setName(name);
        courseCatalog = new ArrayList<>();
    }

    
    public void addCourseCatalog(Course course) {
        courseCatalog.add(course);
    }
    public void produceCatalogReport(ReportService reportService) {
        String reportData = name + " Course Catalog\n---------------------------------------------------\n";
        
        for(Course c : courseCatalog) {
            reportData += "Course No.: " + c.getCourseNumber() 
                    + ", Name: " + c.getCourseName()
                    + ", Credits: " + c.getCredits() + "\n";
            
                    // Can't do this because ot polymorphic
                    // + ", Prereqs: " + c.getPrerequisites() + "\n";
        }
        
        reportService.addData(reportData);
        reportService.outputReport();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("college name is mandatory");
        }
        this.name = name;
    }

    public List<Course> getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(List<Course> courseCatalog) {
        this.courseCatalog = courseCatalog;
    }
    
    
}
