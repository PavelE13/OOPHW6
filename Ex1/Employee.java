package Ex1;

public class Employee {
    /** строковое поле name*/
    private String name;
    /** поле типа Date dob*/
    private Date dob;
    /** поле baseSalary*/
    private int baseSalary;

    /**Конструктор
     * @param name
     * @param dob
     * @param baseSalary
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }
    /**по принципу SRP метод getEmpInfo() выделен отдельный класс printout*/
    /**Старый код*/
    /*public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();

    }*/
    /**по принципу SRP метод сalculateNetSalary() выделен отдельный класс Ex1.CalculateNetSalary*/
    /**Старый код*/
    /*public int calculateNetSalary(int baseSalary) {
        tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }*/
}