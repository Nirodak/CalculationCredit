public class CreditPaymentService {

    //**Ставка кредитования за месяц
    public double SetMonthPercent(double yearPercent) {
        double interest;
        return interest = yearPercent / (100 * 12);
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
//    public double calculate (double amount, double creditPeriod, double percent) {
//
////        return summCredit*(percent/((Math.pow(1-(1+percent),-timeOfCredit-1))));
////        return summCredit*(percent*(1+percent)^timeOfCredit/((1+percent)^timeOfCredit-1));
//
//
//        return amount*(percent*(1+percent)/((Math.pow(1-(1+percent),timeOfCredit-1))));
//
//    }

