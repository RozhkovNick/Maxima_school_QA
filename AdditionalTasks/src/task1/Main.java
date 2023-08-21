package task1;

//        Функция square, принимающуа 1 аргумент — сторону квадрата, и
//        возвращающая 3 значения: периметр квадрата, площадь квадрата и диагональ квадрата.
public class Main {
    public static void main(String[] args) {
        double side = 5.0;
        Tuple<Double, Double, Double> result = square(side);
        System.out.println("Периметр квадрата: " + result.first);
        System.out.println("Площадь квадрата: " + result.second);
        System.out.println("Диагональ квадрата: " + result.third);
    }

    public static Tuple<Double, Double, Double> square(double side) {
        double perimeter = 4 * side;
        double area = side * side;
        double diagonal = Math.sqrt(2) * side;
        return new Tuple<>(perimeter, area, diagonal);
    }
}
