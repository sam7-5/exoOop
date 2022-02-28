public class FigTree extends Tree {

    FigTree(int height, Season season) {
        super(height, season, Color.YELLOW);
    }

    @Override
    public String toString() {

        // maybe implement giveFruits in the super class is cleaner ...
        return "Fig tree. " + ((giveFruits) ? "I give fruit. " : "") + super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        Season newSeason = super.getCurrentSeason();

        switch (newSeason) {

            case WINTER:
                height += 20;
                presenceOfLeaves = false;
                giveFruits = false;
                break;

            case SPRING:
                height += 30;
                presenceOfLeaves = true;
                leavesColor = Color.GREEN;
                giveFruits = false;
                break;

            case SUMMER:
                height += 30;
                // there are leaves because we come from spring
                giveFruits = true;
                break;

            case FALL:
                height += 20;
                leavesColor = Color.YELLOW;
                giveFruits = false;
                break;
        }
    }
}