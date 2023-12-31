package Classes;


import Enums.Skill;

import java.time.LocalDate;

public class Employee extends Person {
    protected double salary;
    protected Department department;
    protected Skill skill;
    protected boolean isWorking = false;

    public Employee(String lastName, String firstName, LocalDate birthDate, double salary, Department department, Skill skill) {
        super(lastName, firstName, birthDate);
        this.salary = salary;
        this.department = department;
        this.skill = skill;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                ", department=" + department +
                ", skill=" + skill +
                ", isWorking=" + isWorking +
                '}';
    }
}
