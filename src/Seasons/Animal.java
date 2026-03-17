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

    public void setWeight(double weight) {
        this.weight = (int) Math.round(weight);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public Season changeSeason(){
        if(season == WINTER)
            season = SPRING;
        if(season == SPRING)
            season = SUMMER;
        if(season == SUMMER)
            season = FALL;
        if(season == FALL)
            season = WINTER;
    }


    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.weight, other.weight);
    }


}
