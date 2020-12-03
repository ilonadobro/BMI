public class Main {
        public static void main(String[] args) {
            BmiService service = new BmiService();
            float weight = 60.7F;
            float height = 1.71F;
            float total = service.calculate(weight, height);
            System.out.println(total);
        }
    }