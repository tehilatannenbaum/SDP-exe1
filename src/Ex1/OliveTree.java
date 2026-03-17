public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        super(height, season, Color.GREEN);
    }

    @Override
    public String toString() {
        if (season == Season.FALL) {
            return "Olive tree. I give fruit. My height is: " + height + " and my color is: " + leavesColor;
        }
            return "Olive tree. My height is: " + height + " and my color is: " + leavesColor;
    }

    @Override
    public void changeSeason() {
        super.changeSeason();  // first move to the next season

        switch (season) {
            case WINTER:
                height += 5;
                break;
            case SPRING:
                height += 10;
                break;
            case SUMMER:
                height += 10;
                break;
            case FALL:
                height += 5;
                break;
        }
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
