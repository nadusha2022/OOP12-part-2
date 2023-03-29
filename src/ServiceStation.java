public class ServiceStation {

    public void check(Car car) {
        checkWheelable(car);
        checkEngine(car);
    }

    public void check(Bicycle bicycle) {
        checkWheelable(bicycle);
    }

    public void check(Truck truck) {
        checkWheelable(truck);
        truck.checkEngine();
        truck.checkTrailer();

    }

    public void checkWheelable(WheeledTransport WheeledTransport) {
        System.out.println("Обслуживаем " + WheeledTransport.getModelName());
        for (int i = 0; i < WheeledTransport.getWheelsCount(); i++) {
            WheeledTransport.updateTyre();
        }
    }

    public void checkEngine (Enginable enginable) {
        enginable.checkEngine();
    }

    public void checkTrailerable(Trailerable trailerable) {
        trailerable.checkTrailer();
    }
}
