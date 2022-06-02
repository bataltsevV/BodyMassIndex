public class BmiService {
    public int calculate (int mass, double height){
        return (int) (mass / ((height / 100) * (height / 100)));
    }
}
