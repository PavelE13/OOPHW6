package Ex2;

public abstract class Vehicle {
    /**по принципу OCP класс переписан на универсальный метод с организацией абстрактного
     класса Ex2.Vehicle и создания на его основе потомков Ex2.Car и Ex2.Bus*/
    /**защтщенное целое поле  maxSpeed*/
    protected int maxSpeed;
    /**защтщенное сттроковое поле  type*/
    protected String type;

    /**Конструктор
     * @param maxSpeed
     * @param type
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    /**Геттер getMaxSpeed()
     * @return
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    /**Геттер getType()
     * @return
     */
    public String getType() {
        return this.type;
    }
    /**абстрактный метод типа double calculateAllowedSpeed()
     * @return
     */
    public abstract double calculateAllowedSpeed();
}
