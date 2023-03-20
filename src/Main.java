public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.71;
        int massKg = 65;
        int index = service.calculate(massKg, heightM);
        System.out.println(index);

    }
}