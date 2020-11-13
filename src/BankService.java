public class BankService {
    int cashback(int expenseStandartsumm, int standartPercent,
                 int expenseIncreasedsumm, int increasedPercent,
                 int expenseSpecialsumm, int specialPercent) {
        int correct = 100_00;
        int cashbackStandart = expenseStandartsumm / correct * correct * standartPercent / 100;
        int cashbackIncreased = expenseIncreasedsumm / correct * correct * increasedPercent / 100;
        int cashbackSpecial = expenseSpecialsumm / correct * correct * specialPercent / 100;
        int cashbackAll = cashbackStandart + cashbackIncreased + cashbackSpecial;

        int limit = 3000;
        if (cashbackAll > limit) {
        }
        return limit;
    }

    int deposit(int cash, int percent) {
        int deposit = cash * percent / 100;
        return deposit;
    }
}



