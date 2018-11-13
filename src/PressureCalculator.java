import java.util.HashMap;
import java.util.Map;

public class PressureCalculator {

    private Map<String, Double> cache = new HashMap<>(); //to skip recalculations
    private int weight = 1;

    public double W(int row, int pos) {
        if (pos < 0 || pos > row) {
            return 0; //actually need to trigger exception, but in task method without exception
        }

        return pressure(row, pos) - weight;
    }

    private double pressure(int row, int pos) {
        if (pos < 0 || pos > row) {
            return 0;
        }
        String key = row + "_" + pos;
        Double storedValue = cache.get(key);
        if(storedValue != null){
            return storedValue;
        }

        Double result = weight + (pressure(row - 1, pos - 1) + pressure(row - 1, pos)) / 2;

        cache.put(key, result);

        return result;
    }

    public void clearCache(){
        cache.clear();
    }
}
