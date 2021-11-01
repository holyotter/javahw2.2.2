public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 65;             // Масса указывается в кг
        double h = 1.75;         // Рост указывается в м
        double index = service.calculate(m, h);
        System.out.println(index);
    }
}
