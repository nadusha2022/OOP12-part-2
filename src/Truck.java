public class Truck extends WheeledTransport implements Enginable{
    public Truck(String modelName, int wheelsCount) {super(modelName, wheelsCount);}


        public void updateTyre () {
            System.out.println("Меняем покрышку");
        }

        @Override
        public void checkEngine () {System.out.println("Проверяем двигатель грузовика");
        }
        public void checkTrailer () {System.out.println("Проверяем прицеп");
        }
    }




