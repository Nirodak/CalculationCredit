public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double monthPay1 = Math.round(service.setMonthPay(1_000_000,9.99,12));
        double monthPay2 = Math.round(service.setMonthPay(1_000_000,9.99,24));
        double monthPay3 = Math.round(service.setMonthPay(1_000_000,9.99,36));


        System.out.println(
                "Ежемесячный платёж на 1 год " + monthPay1
                        + "\n" + "Ежемесячный платёж на 2 года " + monthPay2
                        + "\n" + "Ежемесячный платёж на 3 года " + monthPay3);


    }
}
