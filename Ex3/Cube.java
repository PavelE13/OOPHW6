package Ex3;
/** Применение принципа Inerface Separetely Principle
 * реализуем класс Cube с имплементацией интерфейсов Shape, VolShape*/

public class Cube implements Shape, VolShape {
    /**поле edge*/
    private int edge;
    /**Конструктор
     * @param edge
     */
    public Cube(int edge) {

        this.edge = edge;
    }
    /**Переопределяем площадь
     * @return
     */
    @Override
    public double area() {

        return 6 * edge * edge;
    }
    /**Переопределяем площадь
     * @return
     */
    @Override
    public double volume() {

        return edge * edge * edge;
    }
}