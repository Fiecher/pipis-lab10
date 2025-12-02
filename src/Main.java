import classes.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        Institute toizi = new Institute("ТОиЗИ", "297");
        Institute is = new Institute("ИС", "387");
        Institute tst = new Institute("ЦТ", "311п");
        Institute itu = new Institute("ИТУ", "312п");

        fkn.setInstitutes(new Institute[]{toizi, is, tst, itu});

        Institute piit = new Institute("ПиИТ", "380");
        fkn.addInstitute(piit);

        ResearchAssociate emp1 = new ResearchAssociate(1234, "Сирота Александр Анатольевич", "Защита информации");
        Lecturer emp2 = new Lecturer(1235, "Митрофанова Елена Юрьевна", "Моделирование систем");
        ResearchAssociate emp3 = new ResearchAssociate(1236, "Гаршина Вероника Викторовна", "Интеллектуальные системы");

        Project projA = new Project();
        projA.setName("Разработка ИСУЗ");
        projA.setStart(new Date());

        Course courseDB = new Course();
        courseDB.setName("Базы данных");

        toizi.setEmployees(new ResearchAssociate[]{emp1, emp3});
        toizi.hire(emp2);
        emp1.startProject(projA);
        emp2.addCourse(courseDB);
        System.out.println("------------------------------------------");

        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры на факультете " + fkn.getName() + ": \n");
        for (Institute fknInstitute : fkn_institutes) {
            System.out.println(fknInstitute.getName());
        }
        System.out.println("\n");

        ResearchAssociate[] toizi_employees = toizi.getEmployees();
        System.out.println("Сотрудники кафедры " + toizi.getName() + " (включая нанятых): \n");
        for (ResearchAssociate employee : toizi_employees) {
            System.out.println(employee.getName());
        }

        System.out.println("\nПроекты сотрудника " + emp1.getName() + ":");
        if (emp1.getProjects().length > 0) {
            System.out.println(" - " + emp1.getProjects()[0].getName());
        }

        System.out.println("Курсы, которые ведет " + emp2.getName() + ":");
        if (emp2.getCourses().length > 0) {
            System.out.println(" - " + emp2.getCourses()[0].getName());
        }
    }
}