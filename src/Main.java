public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 61;
        double height = 170;
        int index = service.calculate(mass, height);
        System.out.println("Ваш ИМТ: " + index);
    }
}
