package SuperKeyword;

public class ShapeApp {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        
        System.out.println(shape1.getCorner());

        Rectangle shape2 = new Rectangle();
        System.out.println(shape2.getCorner());
        System.out.println(shape2.getParentCorner());
    }
}
