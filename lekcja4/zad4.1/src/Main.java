public class Main {
    public static void main(String[] args) {
        TestCircleAndCylinder.main(new String[0]);
    }
    public static class Circle {
        private double radius;
        private String color;

        public Circle() {
            this.radius = 1.0;
            this.color = "blue";
        }

        public Circle(double radius) {
            this.radius = radius;
            this.color = "blue";
        }

        public double getRadius() {
            return this.radius;
        }

        public double getArea() {
            return Math.PI * Math.pow(this.radius, 2);
        }

        public String toString() {
            return "Circle[radius=" + this.radius + ",color=" + this.color + "]";
        }
    }

    public static class Cylinder extends Circle {
        private double height;

        public Cylinder() {
            super();
            this.height = 1.0;
        }

        public Cylinder(double radius) {
            super(radius);
            this.height = 1.0;
        }

        public Cylinder(double radius, double height) {
            super(radius);
            this.height = height;
        }

        public double getHeight() {
            return this.height;
        }

        public double getVolume() {
            return super.getArea() * this.height;
        }
    }

    public class TestCircleAndCylinder {
        public static void main(String[] args) {
            Circle circle1 = new Circle();
            System.out.println(circle1.toString());
            System.out.println("Radius of circle1: " + circle1.getRadius());
            System.out.println("Area of circle1: " + circle1.getArea());

            Circle circle2 = new Circle(2.5);
            System.out.println(circle2.toString());
            System.out.println("Radius of circle2: " + circle2.getRadius());
            System.out.println("Area of circle2: " + circle2.getArea());

            Cylinder cylinder1 = new Cylinder();
            System.out.println("Volume of cylinder1: " + cylinder1.getVolume());

            Cylinder cylinder2 = new Cylinder(3.0);
            System.out.println("Volume of cylinder2: " + cylinder2.getVolume());

            Cylinder cylinder3 = new Cylinder(3.0, 5.0);
            System.out.println("Volume of cylinder3: " + cylinder3.getVolume());
        }
    }

}
