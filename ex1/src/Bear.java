public class Bear extends Animal {
    private boolean isAsleep = false;

    Bear(int weight, Season season) {
        super(weight, season, Color.BROWN);
    }

    @Override
    public String toString() {
        if (getCurrentSeason() == Season.WINTER)
            return "Bear. I am sleeping. " + super.toString();
        else
            return "Bear. " + super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (getCurrentSeason()) {

            case WINTER:
                weight = (int) (weight - (weight * 0.3));
                isAsleep = true;
                break;

            case SPRING:
                weight = (int) (weight + (weight * 0.35));
                isAsleep = false;
                break;

            case SUMMER:
                weight = weight - (weight / 3);
                isAsleep = false;
                break;

            case FALL:
                weight = (int) (weight + (weight * 0.25));
                isAsleep = false;
                break;

        }
    }
}
