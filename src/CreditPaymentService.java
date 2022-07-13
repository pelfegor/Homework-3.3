public class CreditPaymentService {
    public int MonthlyPaymentCalculator(int creditAmount, int year, double percent) {

        double monthlyPercent = percent / 100 / 12;
        year = year * 12;
        double result = creditAmount * (monthlyPercent + monthlyPercent/(Math.pow((1+monthlyPercent),year) - 1));

        return (int) result;
    }

}
