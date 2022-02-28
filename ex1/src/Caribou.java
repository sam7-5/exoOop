public class Caribou extends Animal {
    private Direction migratingDirection;

    Caribou(int weight, Season season) {
        super(weight, season, Color.BROWN);//most seasons the animal is brown
    }

    @Override
    public String toString() {
        if (getCurrentSeason() == Season.WINTER)
            return "Caribou: I am migrating south. " + super.toString();
        else if (getCurrentSeason() == Season.SUMMER)
            return "Caribou: I am migrating north. " + super.toString();
        else
            return "Caribou: " + super.toString();

    }

    @Override
    public void changeSeason() {
        super.changeSeason();

        switch (getCurrentSeason()) {

            case WINTER:
                color = Color.WHITE;
                migratingDirection = Direction.SOUTH;
                break;

            case SPRING:
                color = Color.BROWN;
                break;

            case SUMMER:
                migratingDirection = Direction.NORTH;
                break;
        }
    }
}
