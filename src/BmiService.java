public class BmiService {
        public int calculate (int m, double heightM) {
            double index = m / (heightM * heightM);
            return (int) index;
        }
}
