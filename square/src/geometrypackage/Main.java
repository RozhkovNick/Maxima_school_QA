package geometrypackage;

public class Main {

    private static Shape[] generateShapes(){
        Shape[] shapes = new Shape[25]; // 25

        for(int i = 0; i < (shapes.length / 5); ++i){
            shapes[i] = (Shape) new Circle(5.5 + i);
        }
        for(int i = (shapes.length / 5); i < 2 * (shapes.length / 5); ++i){
            shapes[i] = new Sqare(6.2 + i);
        }
        for(int i = 2 * (shapes.length / 5); i < 3*(shapes.length/5); ++i){
            shapes[i] = new Rectangle(3.3 + i, 4.4 + i);
        }
        for(int i = 3 * (shapes.length / 5); i < 4*(shapes.length/5); ++i){
            shapes[i] = new triangle(3.3 + i, 4.4 + i);
        }
        for(int i = 4 * (shapes.length / 5); i < shapes.length; ++i){
            shapes[i] = new Men(3.3 + i, 4.4 + i);
        }
        // TODO: Add 1 shape and 1 non shape

        return shapes;
    }

    public static void main(String[] args) {

        double comulativeArea = 0;
        for(Shape shape: generateShapes()){
            comulativeArea += shape.getArea();
        }
        System.out.println(comulativeArea);


    }
}
