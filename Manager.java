package Example.Inheritance;

public class Manager extends employers {
public String department;
public int experience;
public Manager(String name, String surname, int age, int salary, String department, int experience) {
        super(name, surname, age, salary);
        this.department=department;
        this.experience=experience;
    }
    public void show(){
        System.out.println("Department: "+department);
        System.out.println("Experience: "+experience+" years");
    }
}
