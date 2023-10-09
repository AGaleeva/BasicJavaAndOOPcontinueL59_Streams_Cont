package homework59_OV;

import java.util.List;

public class BankAppl {
    public static void main(String[] args) {

        List<BankAccount> accounts = List.of(
                new BankAccount(
                        new Person("John Smith", 20),
                        "DE133123218", 20_000),
                new BankAccount(new Person("Fred Goodman", 40),
                        "DE133112321123", 40),
                new BankAccount(new Person("Anna Fred", 30),
                        "DE133123211232", 15_000),
                new BankAccount(new Person("George Harrison", 50),
                "DE133123211231",
                95
        ));

        List<BankAccount> bankAccountList = accounts
                .stream()
                .filter(ba -> ba.getBalance() < 100)
                .toList();
        System.out.println(bankAccountList);

        double n = 120;
        List<Person> filteredPerson = accounts
                .stream()
                .filter(ba -> ba.getBalance() > 100)
                .map(BankAccount::getPerson)
                .toList();

        System.out.println(filteredPerson);
    }

}
