package Ex4;

 /**  реализуем класс Rectangle как потомка Shape*/
public class Rectangle extends Shape {
     /**Конструктор
      * @param width
      * @param height
      */
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

/*public class Rectangle {
    private int width;
    private int height;
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int area() {
        return this.width * this.height;
    }
}*/
