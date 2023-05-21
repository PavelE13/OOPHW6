package Ex2;

/**Создаем потомка класса Vehicle класс Bus*/
public class Bus extends Vehicle {
    /**Конструктор
     * @param maxSpeed
     * @param type
     */

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    /**перегрузка абстрактного метода calculateAllowedSpeed()
     * @return
     */
    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed * 0.6;
    }
}