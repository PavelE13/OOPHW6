package Ex3;
/** Применение принципа Inerface Separetely Principle*/

/**Интерфейс Фигура для плоских фигур*/
public interface Shape {
    /**Абстрактное поле площадь*/
    abstract double area();
    /**По принципу ISP необходимо разделить интерфейс для плоских и объемных фигур. Оставляем класс Shape для плоских фигур
     *создаем новый интерфейс VolShape для объемных фигур*/
/*    double area();
    double volume();*/

}
