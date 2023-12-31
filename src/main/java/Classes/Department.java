package Classes;

import Enums.Skill;


public class Department {
    private int id;
    private String name;
    private Employee manager;
    private static int count;

    public Department(String name) {
        this.id = count++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        if (!manager.getSkill().equals(Skill.MANAGER)) throw new RuntimeException("Employee not manager!");
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manager='" + manager.getLastName() + " " + manager.getFirstName() + '\'' +
                '}';
    }
}
