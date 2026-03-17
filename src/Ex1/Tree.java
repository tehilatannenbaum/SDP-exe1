public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    public int getHeight() {
        return height;
    }

    public Color getleavesColor() {
        return leavesColor;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    public void setHeight(double height) {
        this.height = (int) Math.round(height);
    }

    public void setLeavesColor(Color leavesColor) {
        this.leavesColor = leavesColor;
    }



   // @Override
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


  //  @Override
    public int compareTo(Tree o) {
        return Integer.compare(this.height, o.getHeight());
    }

    @Override
    public String toString() {
        return "Tree{" +
                "weight=" + height +
                ", leavesColor=" + leavesColor +
                ", currentSeason=" + season +
                '}';
    }

}
