package lesson_3;

//Задание 3.
public class Park {
    public Park(String parkName) {
        this.parkName = parkName;
    }

    private String parkName;
    private Attraction attraction;

    public Attraction getAttraction() {
        return attraction;
    }

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    @Override
    public String toString() {
        return "Park{" +
                "parkName='" + parkName + '\'' +
                ", attraction=" + attraction +
                '}';
    }

    public class Attraction {
        private String name;
        private String timeWork;
        private int price;

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", timeWork='" + timeWork + '\'' +
                    ", price=" + price +
                    '}';
        }

        public Attraction(String name, String timeWork, int price) {
            this.name = name;
            this.timeWork = timeWork;
            this.price = price;
            Park.this.setAttraction(this);

        }

    }


}
