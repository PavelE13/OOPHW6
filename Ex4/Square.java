package Ex4;
/**  реализуем класс Square как потомка Shape*/
public class Square extends Rectangle {
    /**Конструктор
     * @param side
     */
    public Square(int side) {
        this.width = side;
        this.height = side;
    }

    /**Перегрузка метода setWidth
     * @param width
     */
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    /**Перегрузка метода setHeight
     * @param height
     */
    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}
/*
public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.width = width;
        super.height = width;
    }
    @Override
    public void setHeight(int height) {
        super.width = height;
        super.height = height;
    }
}*/
