package car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPrivateModel("3");

        BMW bmw = new BMW();
        bmw.setM(false);
        bmw.setPrivateModel("3");


        //Car car = new Car();
        //car.privateModel;
        car.pcgDefaultModel = "";
        car.protectedModel = "";
        car.publicModel = "";
    }
}
