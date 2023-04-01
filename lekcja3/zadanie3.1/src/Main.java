public class Main {
    public static void main(String[] args) {
        TestCircle.main(new String[0]);
    }
    public static class Circle {
        private double radius;
        private int color;

        public Circle() {
            this.radius = 1.0;
            this.color = 0xFFFFFF;
        }

        public Circle(double radius) {
            this.radius = radius;
            this.color = 0;
        }

        public Circle(double radius, int color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return this.radius;
        }

        public void setRadius(double newRadius) {
            this.radius = newRadius;
        }

        public double getArea() {
            return Math.PI * Math.pow(this.radius, 2);
        }

        public double getColor(){
            return this.color;
        }

        public void setColor(int newColor) {
            this.color = newColor;
        }

        @Override
        public String toString() {
            String colorHex = Integer.toHexString(color).toUpperCase();
            return "Promien: " + this.radius + ", Kolor: #" + colorHex;
        }

        public String getHexColor() {
            String hex = Integer.toHexString((int) (color * 255));
            if (hex.length() < 2) {
                hex = "0" + hex;
            }
            return "#" + hex + hex + hex;
        }

    }

    public static class TestCircle {
        public static void main(String[] args) {
            Circle circle1 = new Circle();
            Circle circle2 = new Circle(2.5);
            Circle circle3 = new Circle(3, 35);
            Circle circle4 = new Circle();
            circle4.setRadius(5);
            circle4.setColor(1111111);

            System.out.println(circle1);
            System.out.println("Area of circle1: " + circle1.getArea());
            System.out.println(circle2);
            System.out.println("Area of circle2: " + circle2.getArea());
            System.out.println(circle3);
            System.out.println("Area of circle3: " + circle3.getArea());
            System.out.println(circle4);
            System.out.println("Area of circle4: " + circle4.getArea());
        }
    }
}
