package fr.utbm.dvdstore.core.repository;

import fr.utbm.dvdstore.core.entity.Course;

/**
 *
 * @author 
 */
public class ConsoleCourseDao {

    public void save(Course f) {
        System.out.println(f.toString());
    }
}
