public class Bear extends Animal {

    Bear(int weight, Season season) {

        super(weight, season, Color.BROWN);
    }

    @Override
    public String toString() {
        return "Bear. My weight is: "
                + weight +
                " and my color is: BROWN";
    }


    @Override
    public void changeSeason() {
        super.changeSeason();

        switch (season) {
            case WINTER:
                setWeight(weight * 0.8);
                break;
            case SPRING:
                setWeight(weight * 0.75);
                break;
            case SUMMER:
                setWeight(weight * (4.0 / 3.0));
                break;
            case FALL:
                setWeight(weight * 1.25);
                break;
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}