package kata2;

import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator {

    private final int[] data;

    public HistogramGenerator(int [] data) {
        this.data = data;
    }

    public Map<Integer, Integer> getHistogram() {
        Map<Integer, Integer> histogram = new HashMap<>();

        for (int num : data) {
            histogram.put(num, histogram.containsKey(num) ? histogram.get(num) + 1 : 1);
        }

        return histogram;
    }
}
