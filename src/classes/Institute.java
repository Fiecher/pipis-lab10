package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Institute {

    private String name;
    private String address;
    private List<ResearchAssociate> employees;

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ResearchAssociate[] getEmployees() {
        return this.employees.toArray(new ResearchAssociate[0]);
    }

    public void setEmployees(ResearchAssociate[] employees) {
        this.employees = new ArrayList<>(Arrays.asList(employees));
    }

    public void hire(ResearchAssociate employee) {
        if (employee != null && !this.employees.contains(employee)) {
            this.employees.add(employee);
            System.out.println("Сотрудник " + employee.getName() + " принят на работу на кафедру " + this.name);
        }
    }

    public void fire(ResearchAssociate employee) {
        this.employees.remove(employee);
    }


    public String getAddress() { return this.address; }
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
}