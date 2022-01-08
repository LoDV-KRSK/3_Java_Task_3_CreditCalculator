public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int payment12 = (int) service.calculate(1_000_000, 9.99F, 1);
        System.out.println("Ежемесячный платеж: " + payment12);

        int payment24 = (int) service.calculate(1_000_000, 9.99F, 2);
        System.out.println("Ежемесячный платеж: " + payment24);

        int payment36 = (int) service.calculate(1_000_000, 9.99F, 3);
        System.out.println("Ежемесячный платеж: " + payment36);
    }
}