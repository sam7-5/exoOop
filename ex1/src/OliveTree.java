public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
        giveFruits = true;
    }

    @Override
    public String toString() {
        // maybe implement giveFruits in the super class is cleaner ...
        return "Olive tree. " + ((giveFruits) ? "I give fruit. " : "") + super.toString();

    }
    @Override
    public void changeSeason() {

        super.changeSeason();
        Season newSeason = super.getCurrentSeason();

        switch (newSeason) {

            case WINTER:
                height += 5;
                giveFruits = false;
                break;

            case SPRING:
                height += 10;
                giveFruits = false;
                break;

            case SUMMER:
                height += 10;
                giveFruits = false;
                break;

            case FALL:
                height += 5;
                giveFruits = true;
                break;
        }
    }
}
