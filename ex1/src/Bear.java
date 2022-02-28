public class Bear extends Animal {
    private boolean isAsleep=false;
    Bear(int weight, Season season) {
        super(weight, season, Color.BROWN);
    }

    @Override
    public String toString() {
        // TODO: Implement.
        return null;
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (getCurrentSeason()) {

            case WINTER:
                weight = (int) (weight - (((double)20.0 / 100) * weight));
                isAsleep=true;
                break;

            case SPRING:
                weight = (int) (weight - (((double)20.0 / 100) * weight));
                isAsleep=false;
                break;

            case SUMMER:
                weight = (int) (weight - (((double)250.0 / 100) * weight));
                isAsleep=false;
                break;

            case FALL:
                weight = (int) (weight - (((double)220.0 / 100) * weight));
                isAsleep=false;
                break;

        }
    }
}
