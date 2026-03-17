public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    private Season season;
    protected Color color;
    // TODO: Add auxiliary fields and functions.

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    public void setWeight(double weight) {
        this.weight = (int) Math.round(weight);
    }

    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public void changeSeason() {
        switch (season) {
            case WINTER:
                season = Season.SPRING;
                break;
            case SPRING:
                season = Season.SUMMER;
                break;
            case SUMMER:
                season = Season.FALL;
                break;
            case FALL:
                season = Season.WINTER;
                break;
        }
    }


    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.weight, o.weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", color=" + color +
                ", currentSeason=" + season +
                '}';
    }

}
