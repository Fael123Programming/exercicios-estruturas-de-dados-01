package java_language.abstract_classes.classes;

import java.math.BigDecimal;
import java.time.LocalDate;

//An abstract class is a class used only for inheritance purposes: it grabs some important data
//inside itself and cannot be instantiated but only construct reference variables for its children.

public abstract class Employee { //No objects of this class for you!!!
    private String name, area;
    private LocalDate dateOfBirth;
    protected BigDecimal baseSalary;

    public Employee(String name, String area, LocalDate dateOfBirth, BigDecimal baseSalary){
        this.name = name;
        this.area = area;
        this.dateOfBirth = dateOfBirth;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract BigDecimal getSalary(BigDecimal bg1, BigDecimal bg2);
    //To calculate a salary we need two parameters but what they are depends on the concrete class we are using.

    public abstract String getInfo();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
