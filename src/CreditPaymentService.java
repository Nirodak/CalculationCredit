public class CreditPaymentService {

    public double setMonthPay(double amount, double yearPercent, double creditPeriod) {

        return amount * (yearPercent / (100 * 12)) / (1 - Math.pow(1 + (yearPercent / (100 * 12)), -creditPeriod));
    }
}



