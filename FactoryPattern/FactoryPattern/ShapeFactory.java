public class ShapeFactory {
    public Shape shape;
    public Shape getShape(String input){
        switch (input) {
            case "CIRCLE":
                shape = new Circle();
                break;
            case "SQUARE":
                shape = new Square();
                break;
            case "Rectangle":
                shape = new Rectangle();
                break;
            default:
                shape = null;
                break;
        }
        return shape;

    }
}
