public class BmiService {
    public float calculate(float weight, float height) {
        float total = weight / (height * height);
        return total;
    }
}