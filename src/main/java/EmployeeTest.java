
public class EmployeeTest{
  public static void main(String[] args){
    Employee e = new Employee("John", 1000, 2000, 1, 1);
    System.out.println(e.getName());
    System.out.println(e.getSalary());

    Manager m = new Manager("Jane", 2000, 2000, 1, 1);
    System.out.println(m.getName());
    System.out.println(m.getSalary());
  }
}