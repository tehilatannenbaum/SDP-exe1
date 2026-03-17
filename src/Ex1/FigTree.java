public class FigTree extends Tree {

    FigTree(int height, Season season) {
        super(height, season, Color.YELLOW);
    }

    @Override
    public String toString() {
        switch (season) {
            case WINTER:
                return "Fig tree. My height is: " + height + " and I have no leaves";
            case SUMMER:
                return "Fig tree. I give fruit. My height is: " + height + " and my color is: " + leavesColor;
            default:
                return "Fig tree. My height is: " + height + " and my color is: " + leavesColor;
        }
    }
    @Override
    public void changeSeason() {
        super.changeSeason();  // first move to the next season

        switch (season) {
            case WINTER:
                height += 20;
                break;
            case SPRING:
                height += 30;
                leavesColor = Color.GREEN;
                break;
            case SUMMER:
                height += 30;
                leavesColor = Color.GREEN;
                break;
            case FALL:
                height += 20;
                leavesColor = Color.YELLOW;
                break;
        }
}

    @Override
    public int compareTo(Object o) {
        return super.compareTo((Tree) o);
    }
}
