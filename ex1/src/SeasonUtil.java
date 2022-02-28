import java.util.ArrayList;
import java.util.Arrays;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();

    public static void sortSeasonable(Comparable[] seasonables) {
        Arrays.sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {
        String result = "";
        for (Seasonable seasonable : seasonables) {
            result += seasonable.toString();
            result += "\n";
        }
        return result;
    }
}
