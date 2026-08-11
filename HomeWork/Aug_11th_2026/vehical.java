abstract class Vehicle {

    String vehicleNumber;
    String brand;
    double baseRate;

    Vehicle(String vehicleNumber, String brand, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    abstract double calculateRentalCost(int days);
}


interface Insurable {

    double getInsuranceCost();
}


class Car extends Vehicle implements Insurable {

    Car(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    double calculateRentalCost(int days) {
        return baseRate * days;
    }

    public double getInsuranceCost() {
        return 500;
    }
}


class Bike extends Vehicle {

    Bike(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    double calculateRentalCost(int days) {
        return baseRate * days;
    }
}


class Truck extends Vehicle implements Insurable {

    Truck(String vehicleNumber, String brand, double baseRate) {
        super(vehicleNumber, brand, baseRate);
    }

    double calculateRentalCost(int days) {
        return (baseRate * days) + 1000;
    }

    public double getInsuranceCost() {
        return 1000;
    }
}


class RentalAgency {

    void generateBill(Vehicle vehicle, int days) {

        double rentalCost = vehicle.calculateRentalCost(days);

        System.out.println("Vehicle Number: " + vehicle.vehicleNumber);
        System.out.println("Brand: " + vehicle.brand);
        System.out.println("Rental Cost: " + rentalCost);

        if (vehicle instanceof Insurable) {

            Insurable i = (Insurable) vehicle;

            System.out.println("Insurance Cost: " + i.getInsuranceCost());

            System.out.println("Total Cost: "
                    + (rentalCost + i.getInsuranceCost()));

        } else {

            System.out.println("Insurance: Not Required");
            System.out.println("Total Cost: " + rentalCost);
        }

        System.out.println("-------------------------");
    }
}


public class vehical {

    public static void main(String[] args) {

        Car car = new Car("C101", "BMW", 2000);

        Truck truck = new Truck("T101", "Tata", 3000);

        Bike bike = new Bike("B101", "Yamaha", 1000);

        RentalAgency agency = new RentalAgency();

        System.out.println("CAR");
        agency.generateBill(car, 3);

        System.out.println("TRUCK");
        agency.generateBill(truck, 3);

        System.out.println("BIKE");
        agency.generateBill(bike, 3);
    }
}