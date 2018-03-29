import java.util.Arrays;

public class DataFormatter {
    public int[] formatStringToInts(String processString) {
        try {
            return Arrays.stream(processString.substring(1, processString.length() - 1).split(" "))
                    .map(String::trim).mapToInt(Integer::parseInt).toArray();
        } catch(NumberFormatException e) {
            e.printStackTrace();
            int[] ret = new int[6];
            return ret;
        }
    }
}
