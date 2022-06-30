package Example.Inheritance;

public class employers {
    public String name;
    public String surname;
    public int age;
    public int salary;

    public employers(String name, String surname, int age, int salary) {
    this.name=name;
    this.surname=surname;
    this.age=age;
    this.salary=salary;
    }
    public void info(){
        System.out.println("Infos... ");
        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
        System.out.println("Age: "+age );
        System.out.println("Salary: "+salary+" AZN");
    }
}