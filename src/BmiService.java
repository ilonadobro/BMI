public class BmiService {
        public int calculate (int massKg, double heightM) {
            double index = massKg / (heightM * heightM);
            return (int) index;
        }
}
