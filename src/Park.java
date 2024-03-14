import java.util.ArrayList;
import java.util.List;

public class Park {
//    3.Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
//    времени их работы и стоимости.
    private String name;
    private List<Attraction> attractionList;

    public Park(String name) {
        this.name = name;
    }

    public class Attraction{
        private String name;
        private String openingHours;
        private int price;

        public Attraction(String name, String openingHours, int price) {
            this.name = name;
            this.openingHours = openingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction { " +
                    "park name = '" + Park.this.name + '\'' +
                    "| attraction name = '" + name + '\'' +
                    ", openingHours = '" + openingHours + '\'' +
                    ", price = " + price +
                    '}';
        }
    }

    public void addAttraction(Attraction attraction){
        if (attractionList == null)
            attractionList = new ArrayList<>();
        attractionList.add(attraction);
    }

    public List<Attraction> getAttractionList() {
        return attractionList;
    }
}
