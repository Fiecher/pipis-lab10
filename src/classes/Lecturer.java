package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecturer extends ResearchAssociate {

    private List<Course> courses;

    public Lecturer(int ssNo, String name, String fieldOfStudy) {
        super(ssNo, name, fieldOfStudy);
        this.courses = new ArrayList<>();
    }

    public Course[] getCourses() {
        return this.courses.toArray(new Course[0]);
    }

    public void setCourses(Course[] courses) {
        this.courses = new ArrayList<>(Arrays.asList(courses));
    }

    public void addCourse(Course course) {
        if (course != null && !this.courses.contains(course)) {
            this.courses.add(course);
            System.out.println("Преподаватель " + this.getName() + " назначен на курс " + course.getName());
        }
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }
}