public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;  // вес в кг
        double height = 1.87; // рост в метрах

        int calc = service.calculate(weight, height);
        int index = (int)calc;

        System.out.println("\nВаш индекс массы тела составляет: ");
        System.out.println(index);

        System.out.println("\nВаш индекс массы тела составляет: ");
        System.out.println(service.calculate(100, 1.66));

        System.out.println("\nВаш индекс массы тела составляет: ");
        System.out.println(service.calculate(70, 1.88));

        System.out.println("\nВаш индекс массы тела составляет: ");
        System.out.println(service.calculate(66, 1.75));
    }
}
