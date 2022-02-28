public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
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
                //presenceOfLeaves = false;
                break;

            case SPRING:
                height += 10;
                giveFruits = false;
                break;

            case SUMMER:
                height += 10;
                giveFruits = false;
                //presenceOfLeaves = true;
                //leavesColor = Color.GREEN;
                break;
            //there are leaves because we come from spring

            case FALL:
                height += 5;
                giveFruits = true;
                break;
        }
    }
}
