package kata2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Integer[] data = {9, 2, 3, 4, 5, 8, 1, 2, 3, 9, 5, 3, 6, 2, 7, 3, 6, 0, 2, 8, 9, 5};
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa", "Pepe", "Rosa", "María"};


        HistogramGenerator<String> histogramGenerator = new HistogramGenerator<>(data);

        for (Map.Entry<String, Integer> entry : histogramGenerator.getHistogram().entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}