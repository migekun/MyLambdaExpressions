package info.manavas.funcprogramming;

import java.util.List;

public interface InstructorFactory {

    Instructor get(String name, int yearsOfExperience, String title, String gender, boolean onLineCourse, List<String> courses);
}
