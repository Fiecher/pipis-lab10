package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResearchAssociate extends Employee {

    protected String fieldOfStudy;
    protected List<Project> projects;

    public ResearchAssociate(int ssNo, String name, String fieldOfStudy) {
        this.ssNo = ssNo;
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.projects = new ArrayList<>();
    }

    public String getFieldOfStudy() { return this.fieldOfStudy; }
    public void setFieldOfStudy(String fieldOfStudy) { this.fieldOfStudy = fieldOfStudy; }

    public Project[] getProjects() {
        return this.projects.toArray(new Project[0]);
    }

    public void setProjects(Project[] projects) {
        this.projects = new ArrayList<>(Arrays.asList(projects));
    }

    public void startProject(Project project) {
        if (project != null && !this.projects.contains(project)) {
            this.projects.add(project);
            System.out.println("Сотрудник " + this.name + " начал работу над проектом " + project.getName());
        }
    }

    public void finishProject(Project project) {
        this.projects.remove(project);
        System.out.println("Сотрудник " + this.name + " завершил работу над проектом " + project.getName());
    }
}