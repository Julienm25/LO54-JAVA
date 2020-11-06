package fr.utbm.dvdstore.core.controller;

import fr.utbm.dvdstore.core.entity.Course;
import fr.utbm.dvdstore.core.service.CourseService;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class DefaultCourseController {
    
    public void registerCourseFromConsoleInput(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Code Course ?");
        String Code = sc.nextLine();
           
        System.out.println("Title Course ?");
        String Title = sc.nextLine();
        
        
        Course f = new Course();
        f.setCode(Code);
        f.setTitle(Title);
        
        CourseService fs = new CourseService();
        fs.registerCourse(f);
    }
}
