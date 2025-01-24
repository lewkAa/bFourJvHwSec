public class BmiService {
    public int calculate(double weight, double height) {
        double result =  (weight / (height * height));
        return (int) result;
    }


}
