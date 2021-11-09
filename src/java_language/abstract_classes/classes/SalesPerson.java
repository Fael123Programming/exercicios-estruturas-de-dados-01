package java_language.abstract_classes.classes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SalesPerson extends Employee {
    public SalesPerson(String name, String area, LocalDate dateOfBirth, BigDecimal baseSalary){
        super(name, area, dateOfBirth, baseSalary);
    }

    public BigDecimal getSalary(BigDecimal sales, BigDecimal commissionPerSale){
        return this.baseSalary.add(commissionPerSale.multiply(sales));
    }

    public String getInfo(){ return "This is a salesperson."; }
}
