package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Faculty {

    private String name;
    private List<Institute> institutes;

    public Faculty(String name) {
        this.name = name;
        this.institutes = new ArrayList<>();
    }

    public Faculty(String name, Institute[] initialInstitutes) {
        this.name = name;
        this.institutes = new ArrayList<>(Arrays.asList(initialInstitutes));
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Institute[] getInstitutes() {
        return this.institutes.toArray(new Institute[0]);
    }

    public void setInstitutes(Institute[] institutes) {
        this.institutes = new ArrayList<>(Arrays.asList(institutes));
    }

    public void addInstitute(Institute institute) {
        if (institute != null && !this.institutes.contains(institute)) {
            this.institutes.add(institute);
            System.out.println("Институт " + institute.getName() + " добавлен на факультет " + this.name);
        }
    }

    public void removeInstitute(Institute institute) {
        this.institutes.remove(institute);
    }
}