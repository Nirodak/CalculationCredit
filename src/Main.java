public class Main {

    public static void main (String[] args) {

        CreditPaymentService service = new CreditPaymentService();


        long amount = 1000000;
        double year = 1;
        double creditPeriod = year*12;
        double yearPercent = 9.99;

        double monthpercent = service.SetMonthPercent(yearPercent);
        double annuity = service.AnnuityFactor(yearPercent, creditPeriod);
        double monthpay = Math.round(service.SetMonthPay(amount,yearPercent,creditPeriod));


        System.out.println(annuity);
        System.out.println(monthpay);
        System.out.println(monthpercent);


    }
}
