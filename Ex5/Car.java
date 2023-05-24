package Ex5;

/**Метод Car*/
public class Car {
    /**поле типа Engine engine
     */
    private Engine engine;

    /**Конструктор
     * @param engine
     */
    public Car(Engine engine) {
        this.engine = engine;
    }

    /**Метод start() запуска в engine*/
    public void start() {
        this.engine.start();
    }
}
/*    private PetrolEngine engine;
    public Car(PetrolEngine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }*/
