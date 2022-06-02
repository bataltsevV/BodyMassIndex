public class BmiService {
    public int calculate (int mass, double height){
        int index = (int) (mass / ((height * height) / 10_000));
        double reminder = mass % ((height * height) / 10_000) / ((height * height) / 10_000);
        if (reminder >= 0.5) {
            index = index + 1;
        }
       return index;
    }
}