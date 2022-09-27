package Q3;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    Employee(String name, double grossSalary, double tax){
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    // public double NetSalary(){
        
    // }

    public String toString(){
        return this.name + ", " + String.valueOf(this.grossSalary-this.tax);
    }

    public void increaseSalary(double percentage) {
        this.grossSalary = this.grossSalary*(1+percentage/100);
    }

}
