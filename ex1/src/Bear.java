public class Bear extends Animal {

    Bear(int weight, Season season) {
        super(weight,season,Color.BROWN);
    }

    @Override
    public String toString() {
        // TODO: Implement.
        return null;
    }
    @Override
    public void changeSeason() {
        season.next();
    }
}
