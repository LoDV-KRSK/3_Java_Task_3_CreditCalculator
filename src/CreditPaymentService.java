public class CreditPaymentService {
    public float calculate(int amount, float interestRate, float creditTerm) {
        float percent = interestRate / 12;
        float formula = (float) Math.pow((1 + percent / 100), (creditTerm * 12));
        float formula2 = (int) (((percent / 100 * (amount * formula))) / (formula - 1));
        return formula2;
    }
}