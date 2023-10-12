package org.lesson6;

import java.util.List;

public class ListAverageNumberComparator {
    public static String compareAverages(List<Double> list1, List<Double> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "The first list has a larger average";
        } else if (average1 < average2) {
            return "The second list has a higher average";
        } else {
            return "The average values are equal";
        }
    }

    public static double calculateAverage(List<Double> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is empty or null");
        }

        double sum = 0.0;
        for (Double num : list) {
            sum += num;
        }
        return sum / list.size();
    }
}
