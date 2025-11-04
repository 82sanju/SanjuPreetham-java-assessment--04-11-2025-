class Circle extends Shapes {
    //implements the shape interface for circle
    private double radius;

    public Circle(double radius) {
        super("Circle");
        ///radius
        this.radius = radius;
        
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}



