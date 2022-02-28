public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(0,null,null);
    }

    @Override
    public String toString() {
        // maybe implement giveFruits in the super class is cleaner ...
        return "Olive Tree. " + ((giveFruits) ? "I give fruit. " : "") + super.toString();

    }
    @Override
    public void changeSeason() {

        super.changeSeason();
        Season newSeason = super.getCurrentSeason();

        switch (newSeason) {

            case WINTER:
                height += 5;
                //presenceOfLeaves = false;
                break;

            case SPRING:

            case SUMMER:
                height += 10;
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
