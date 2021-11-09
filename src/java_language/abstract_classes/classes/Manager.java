package java_language.abstract_classes.classes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Manager extends Employee {
    //When you inherit a class, never forget to write again a constructor!!!
    public Manager(String name, String area, LocalDate dateOfBirth, BigDecimal baseSalary) {
        super(name, area, dateOfBirth, baseSalary);
    }

    public BigDecimal getSalary(BigDecimal extraWorkedHours, BigDecimal extraHourPrice) {
        return this.baseSalary.add(extraWorkedHours.multiply(extraHourPrice));
    }

    public String getInfo(){ return "This is a manager."; }
}
