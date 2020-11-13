public class Main {
    public static void main(String[] args) {
        BankService resultCashback = new BankService();
        int cashback = resultCashback.cashback(
                10_000,
                1,
                15_000,
                5,
                128_000,
                30
        );
        System.out.println(cashback);

        BankService resultDeposit = new BankService();
        int depisit = resultDeposit.deposit(8000,3);
        System.out.println(depisit);
    }
}
