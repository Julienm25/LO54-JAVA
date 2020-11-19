package fr.utbm.dvdstore.core;

import fr.utbm.dvdstore.core.controller.DefaultCourseController;

/**
 *
 * @author
 */
public class App1 {

    public static void main(String[] args) {
        DefaultCourseController dfc = new DefaultCourseController();
        dfc.registerCourseFromConsoleInput();
    }
}
