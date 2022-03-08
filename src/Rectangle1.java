/*
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/
public class Rectangle1 {
    public int top;
    public int left;
    public int width;
    public int height;

    public Rectangle1 (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle1 (int top, int left) {
        this.top = top;
        this.left = left;
    }
    public Rectangle1 (int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public Rectangle1 (Rectangle anotherRectangle) {
        this.top = anotherRectangle.top;
        this.left = anotherRectangle.left;
        this.width = anotherRectangle.width;
        this.height = anotherRectangle.height;
    }
}
