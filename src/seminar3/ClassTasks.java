package seminar3;

public class ClassTasks {

    public static void main(String[] args) {
        Point p = new Point(34, 56);
        Circle c = new Circle(46, 34, 7);
        Square s = new Square(46, 34, 8);
        p.display();
        c.display();
        s.display();
    }
    /**
     * Задание 1: Объявите классы Circle и Square – наследников базового (Point).
     * Реализуйте readonly свойство, вычисляющее площадь каждой фигуры, а также функцию display()
     * для вывода информации о фигуре на экран.
     *
     * (3 балла)
     */

    public static class Point {

        protected double x;

        public double getX() {
            return x;
        }

        protected double y;

        public double getY() {
            return y;
        }

        protected double area;

        public double getArea() {
            return area;
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
            area = 0.0;
        }

        public void display() {
            System.out.println("S = " + area + ", X = " + x +  ", Y = " + y);
        }
    }

    public static class Circle extends Point {
        private double radius;

        public double getRadius() {
            return radius;
        }

        public Circle(double x, double y, double radius) {
            super(x, y);
            area = Math.PI * radius * radius;
        }
    }

    public static class Square extends Point {

        public Square(double x, double y, double sideLength) {
            super(x, y);
            area = sideLength * sideLength;
        }
    }

}
