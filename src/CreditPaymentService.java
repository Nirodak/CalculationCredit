public class CreditPaymentService {

    //**Ставка кредитования за месяц
    public double SetMonthPercent(double yearPercent) {
        double percent;
        return percent = yearPercent / (100 * 12);
    }
    public double AnnuityFactor (double yearPercent, double creditPeriod) {
        double x = Math.pow(1+this.SetMonthPercent(yearPercent), -creditPeriod);
        return this.SetMonthPercent(yearPercent) / (1-x);

    }
    public double SetMonthPay (double ammount, double yearPercent, double creditPeriod) {

        double monthpay = ammount * this.AnnuityFactor(yearPercent, creditPeriod);
        return monthpay;
    }
}
//

