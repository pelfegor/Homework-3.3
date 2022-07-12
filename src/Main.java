public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPayment;
        monthlyPayment = service.MonthlyPaymentCalculator(1000000, 1, 9.99);
        System.out.println(monthlyPayment);
        System.out.println();

        monthlyPayment = service.MonthlyPaymentCalculator(1000000, 2, 9.99);
        System.out.println(monthlyPayment);
        System.out.println();

        monthlyPayment = service.MonthlyPaymentCalculator(1000000, 3, 9.99);
        System.out.println(monthlyPayment);
        System.out.println();
    }
}
