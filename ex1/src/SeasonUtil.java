import java.util.ArrayList;
import java.util.Arrays;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();

    public static void sortSeasonable(Comparable[] seasonables) {
        Arrays.sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {
        StringBuilder tout = null;
        for (Seasonable seasonable : seasonables) {
            tout.append(seasonable.toString());
            tout.append('\n');
        }
        return tout.toString();
    }
}
