package Ex1;

/**код в соответствии с SRP, LSP */
public class Printout {
    // За подготовку к выводу иформации овечает отдельный класс, это уменьшает объем работы при изенении формата вывода, добавления на вывод доп. инфо
    /** Метод формирования вывода getEmpInfo (геттер)
     * @param name
     * @param dob
     * @return
     */
    public String getEmpInfo(String name, Date dob) {

        return "name - " + name + " , dob - " + dob.toString();
    }
}
