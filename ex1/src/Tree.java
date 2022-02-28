public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    Tree(int height, Season season, Color leavesColor) {
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public void changeSeason() {
        this.season = season.next();
    }

    @Override
    public int compareTo(Object o) {
        // naive implementation, maybe exception
        Tree temp = (Tree) o;

        // 0 -> equal, 1-> this greater, negative number -> this smaller
        return this.height - temp.height;
    }

    @Override
    public String toString() {
        return "My height is: " + this.height + "and my color is: " + this.leavesColor;
    }
}