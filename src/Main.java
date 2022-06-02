public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 80;
        double height = 179;
        int index = service.calculate(mass, height);
        System.out.println("Ваш ИМТ: " + index);
    }
}
