package Ex3;
/** Применение принципа Inerface Separetely Principle
 *  реализуем класс Circle с имплементацией интерфейсов Shape*/
public class Circle implements Shape {
    /**поле radius*/
    private double radius;

    /**Конструктор
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**Переопределяем площадь
     * @return
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
    /**Нет необходимости в этом исключении по объему для плоских фмгур*/
/*    @Override
    public double volume() {
        throw new UnsupportedOperationException();
    }*/
}
