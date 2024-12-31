
public class EmployeeTest{
  public static void main(String[] args){
    Employee e = new Employee("John", 1000, 2000, 1, 1);
    System.out.println(e.getName());
    System.out.println(e.getSalary());

    Manager m = new Manager("Jane", 2000, 2000, 1, 1);
    System.out.println(m.getName());
    System.out.println(m.getSalary());
    m.setBonus(100000);
    System.out.println("after adding bonus");
    System.out.println(m.getSalary());

    // declare employee string and call in a loop
    Employee[] staff = new Employee[3];
    Employee e1 = new Employee("Employee1", 1000, 2000, 1, 1);
    Employee e2 = new Employee("Employee2", 1001, 2001, 1, 1);
    Manager m1 = new Manager("Manager1", 3000, 2000, 1, 1);
    m1.setBonus(100000);
    staff[0] = e1;
    staff[1] = e2;
    staff[2] = m1;
    for(Employee s : staff)
      System.out.println("Salary of " + s.getName() + " is " + s.getSalary());
  }
}