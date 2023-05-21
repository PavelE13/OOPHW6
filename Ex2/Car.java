package Ex2;

public class Car extends Vehicle {
    /**Конструктор
     * @param maxSpeed
     * @param type
     */
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    /**перегрузка абстрактного метода calculateAllowedSpeed()
     * @return
     */
    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed * 0.8;
    }
}