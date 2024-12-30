import java.time.*;

public class Manager extends Employee {

  private String name;
  private double salary;
  private LocalDate hireDay;
  private double bonus;

  public Manager(String name, double salary, int year, int month, int day) {
    super(name, salary, year, month, day); // Call Employee's constructor
    this.bonus = 0;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }
}