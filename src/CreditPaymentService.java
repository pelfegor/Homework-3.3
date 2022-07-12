public class CreditPaymentService {
    public int MonthlyPaymentCalculator(int x, int y, double z) {

        double bet = z / 100 / 12;
        y = y * 12;
        double result = x * (bet + bet/(Math.pow((1+bet),y) - 1));

        return (int) result;
    }

}
