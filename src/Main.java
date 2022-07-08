public class Main {

    public static void main (String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int amount = 10_000_000;
        double yearPercent = 9.99;
        double year1 = 1;
        double creditPeriod1 = year1*12;
        double year2 = 2;
        double creditPeriod2 = year2*12;
        double year3= 3;
        double creditPeriod3 = year3*12;



        double monthpercent = service.SetMonthPercent(yearPercent);
        //1 год
        double annuity1 = service.AnnuityFactor(yearPercent, creditPeriod1);
        double monthpay1 = Math.round(service.SetMonthPay(amount,yearPercent,creditPeriod1));
        //2 года
        double annuity2 = service.AnnuityFactor(yearPercent, creditPeriod2);
        double monthpay2 = Math.round(service.SetMonthPay(amount,yearPercent,creditPeriod2));
        //3 года
        double annuity3 = service.AnnuityFactor(yearPercent, creditPeriod3);
        double monthpay3 = Math.round(service.SetMonthPay(amount,yearPercent,creditPeriod3));

        System.out.println(
                "Ежемесячный платёж на 1 год " + monthpay1
                        + "\n" + "Ежемесячный платёж на 2 года " + monthpay2
                        + "\n" + "Ежемесячный платёж на 3 года " + monthpay3);

//       Использовались для дебагинга и сверки значений
//        System.out.println("Ануитивное значение " + annuity1);
//        System.out.println("Ежемесячный платёж " + monthpercent);


    }
}
