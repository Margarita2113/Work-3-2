public class BmiService {
    public int calculate(int weight, double heights) {
        double index = weight / (heights * heights);
        return (int) index;
    }
}

