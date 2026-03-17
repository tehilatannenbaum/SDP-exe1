public class Caribou extends Animal {

    Caribou(int weight, Season season) {

        super(weight, season,Color.BROWN);
    }

    @Override
    public String toString() {
        switch (season) {
            case WINTER:
                return "Caribou: I am migrating south. My weight is: " + weight +
                        " and my color is: " + color;
            case SUMMER:
                return "Caribou: I am migrating north. My weight is: " + weight +
                        " and my color is: " + color;
            default:
                return "Caribou: My weight is: " + weight +
                        " and my color is: " + color;
        }
    }

    @Override
    public void changeSeason() {
            super.changeSeason();  // move to the next season first

            switch (season) {
                case WINTER:
                    color = Color.WHITE;
                    break;
                case SPRING:
                    color = Color.BROWN;
                    break;
                case SUMMER:
                    break;
                case FALL:
                    break;
            }
        }

    @Override
    public int compareTo(Object o) {
        return super.compareTo((Animal) o);
    }
}

