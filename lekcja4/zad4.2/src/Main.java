public class Main {
    public static void main(String[] args) {
        AutoShop shop = new AutoShop();
        shop.run();
    }

    public interface Purchase {
        String getPurchaseInfo();
    }

    public static class Car implements Purchase {
        int speed;
        double regularPrice;
        String color;

        public Car(double regularPrice, String color, int speed) {
            this.regularPrice = regularPrice;
            this.color = color;
            this.speed = speed;
        }

        public double getRegularPrice() {
            return this.regularPrice;
        }

        @Override
        public String getPurchaseInfo() {
            return "";
        }
    }

    public static class Sedan extends Car {
        int length;

        public Sedan(double regularPrice, String color, int speed, int length) {
            super(regularPrice, color, speed);
            this.length = length;
        }

        public double getSalePrice() {
            if (this.length > 20) {
                return super.getRegularPrice() * 0.95;
            } else {
                return super.getRegularPrice() * 0.9;
            }
        }

        @Override
        public String getPurchaseInfo() {
            return "SEDAN: " + "Regular price: " + super.getRegularPrice() + ", Sale price: " + this.getSalePrice();
        }
    }

    public static class Ford extends Car {
        int year;
        int manufacturerDiscount;

        public Ford(double regularPrice, String color, int speed, int year, int manufacturerDiscount) {
            super(regularPrice, color, speed);
            this.year = year;
            this.manufacturerDiscount = manufacturerDiscount;
        }

        public double getSalePrice() {
            return super.getRegularPrice() - this.manufacturerDiscount;
        }

        @Override
        public String getPurchaseInfo() {
            return "FORD: " + "Regular price: " + super.getRegularPrice() + ", Sale price: " + this.getSalePrice();
        }
    }

    public static class Truck extends Car {
        int weight;

        public Truck(double regularPrice, String color, int speed, int weight) {
            super(regularPrice, color, speed);
            this.weight = weight;
        }

        public double getSalePrice() {
            if (this.weight > 2000) {
                return super.getRegularPrice() * 0.9;
            } else {
                return super.getRegularPrice();
            }
        }

        @Override
        public String getPurchaseInfo() {
            return "TRUCK: " + "Regular price: " + super.getRegularPrice() + ", Sale price: " + this.getSalePrice();
        }
    }

    public static class AutoShop {
        public void run() {
            Sedan sedan = new Sedan(20000, "red", 160, 10);
            Ford ford1 = new Ford(4452, "black", 156, 2005, 5000);
            Ford ford2 = new Ford(5000, "pink", 155, 1998, 5);
            Truck truck = new Truck(500000, "gold", 200, 5000);

            System.out.println(sedan.getPurchaseInfo());
            System.out.println(ford1.getPurchaseInfo());
            System.out.println(ford2.getPurchaseInfo());
            System.out.println(truck.getPurchaseInfo());
        }
    }
}
