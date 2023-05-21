package Ex2;

public class SpeedCalculation {
    /**по принципу OCP метод calculateAllowedSpeed() переписан на универсальный метод с организацией абстрактного
     класса Ex2.Vehicle и создания на его основе потомков Ex2.Car и Ex2.Bus*/
        public double calculateAllowedSpeed(Vehicle vehicle) {
/*            if (vehicle.getType().equalsIgnoreCase("Ex2.Car")) {
                return vehicle.getMaxSpeed() * 0.8;
            } else if (vehicle.getType().equalsIgnoreCase("Ex2.Bus")) {
                return vehicle.getMaxSpeed() * 0.6;
            }

            return 0.0;
        }*/
            return vehicle.calculateAllowedSpeed();
        }
    }

