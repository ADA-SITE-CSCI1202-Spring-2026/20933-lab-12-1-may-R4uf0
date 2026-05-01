@FunctionalInterface
interface DiscountCalculator {
    // TODO 1
    double calculate(double price);
}

public class DiscountDemo {
    public static void main(String[] args) {
        // TODO 2 — 10% discount
        DiscountCalculator tenPercent = price -> price * 0.90;

        // TODO 3 — 25% discount
        DiscountCalculator twentyFivePercent = price -> price * 0.75;

        double price = 100;

        // TODO 4
        System.out.println("After 10% discount: " + tenPercent.calculate(price));

        // TODO 5
        System.out.println("After 25% discount: " + twentyFivePercent.calculate(price));
    }
}