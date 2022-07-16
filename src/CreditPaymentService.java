public class CreditPaymentService {

    public double setMonthPay(double ammount, double yearPercent, double creditPeriod) {

        double monthpay = ammount * (yearPercent / (100 * 12)) / (1 - Math.pow(1 + (yearPercent / (100 * 12)), -creditPeriod));
        return monthpay;
    }
}



