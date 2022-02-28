public abstract class Animal implements Seasonable, Comparable {
    protected int weight;
    protected Season season;
    protected Color color;

    Animal(int weight, Season season, Color color) {
        this.weight = weight;
        this.season = season;
        this.color = color;
    }

    @Override
    public String toString() {
        return "My weight is: " + this.weight + "and my color is: " + this.color;
    }

    @Override
    public void changeSeason() {
        this.season = season.next();
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {

        Animal temp = (Animal) o;
        if (this.weight - temp.weight == 0)
            return 0;
        else if (this.weight - temp.weight < 0)
            return -1;
        else
            return 1;
        // 0 -> equal, 1-> this greater, negative number -> this smaller

    }
}
