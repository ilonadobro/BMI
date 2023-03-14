public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.71;
        int m = 65;
        int index = service.calculate(m, heightM);
        System.out.println(index);

    }
}