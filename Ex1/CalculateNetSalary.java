package Ex1;

/**код в соответствии с Single Responsibility Principle */
public class CalculateNetSalary {
    /** защищенное целое поле tax*/
    protected int tax;
    /** Метод вычисления з.п.
     * @param baseSalary
     * @return
     */
    public int calculateNetSalary(int baseSalary) {
        tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
