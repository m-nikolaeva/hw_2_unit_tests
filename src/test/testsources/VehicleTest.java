import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleTest {

    //    проверка того, что экземпляр объекта Car является
    //    экземпляром транспортного средства; (instanceof)
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }

    //    проверка того, объект Car создается с 4-мя колесами
    @Test
    public void testСarWithFourWheels(){
        Car car = new Car("Dodge", "Ram", 2010);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    //    проверка того, объект Car развивает скорость 60
    //    в режиме тестового вождения (testDrive())
    @Test
    public void testСarTestDrive(){
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        int speed = car.getSpeed();
        assertThat(speed).isEqualTo(60);
    }

    //    проверить, что в режиме парковки (сначала testDrive, потом park,
    //    т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    public void testСarPark(){
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        car.park();
        int speed = car.getSpeed();
        assertThat(speed).isEqualTo(0);
    }

    //    проверка того, что экземпляр объекта Motorcycle также является
    //    экземпляром транспортного средства; (instanceof)
    @Test
    public void testMotorcycleIsInstanceOfVehicle() {
        Motorcycle motorcycle = new Motorcycle("BMW", "S 1000 RR ", 2022);
        assertTrue(motorcycle instanceof Vehicle);
    }

    //    проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    public void testMotorcycleWithFourWheels(){
        Motorcycle motorcycle = new Motorcycle("BMW", "S 1000 RR ", 2022);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    //    проверка того, объект Motorcycle развивает скорость 75
    //    в режиме тестового вождения (testDrive())
    @Test
    public void testMotorcycleTestDrive(){
        Motorcycle motorcycle = new Motorcycle("BMW", "S 1000 RR ", 2022);
        motorcycle.testDrive();
        int speed = motorcycle.getSpeed();
        assertThat(speed).isEqualTo(75);
    }

    //    проверить, что в режиме парковки (сначала testDrive, потом park
    //    т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    public void testMotorcyclePark(){
        Motorcycle motorcycle = new Motorcycle("BMW", "S 1000 RR ", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        int speed = motorcycle.getSpeed();
        assertThat(speed).isEqualTo(0);
    }
}