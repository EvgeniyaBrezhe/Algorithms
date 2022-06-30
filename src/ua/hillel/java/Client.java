package ua.hillel.java;

public class Client {
    String firstName;
    String lastName;
    int age;
    int amountOfMoney;
    boolean isReadyToLoan;

    public void buyCar(int price, int loanTermYears) {
        System.out.println("Dear Customer!");
        if (age < 18) {
            System.out.println(
                    "Unfortunately, we can not sell you a car. " + "Please, come in " + (18 - age)
                            + " year(s).");
        } else if (amountOfMoney >= price) {
            System.out.println("Congratulations with new car!");
        } else if (isReadyToLoan) {
            int amountToLoan = price - amountOfMoney;
            int monthlyPayment = amountToLoan / (loanTermYears * 12);
            System.out.println(
                    "You have signed a loan for " + loanTermYears + " years. Your monthly payment will be "
                            + monthlyPayment + "$ per month.");
            System.out.println("Congratulations with new car!");
        } else {
            System.out.println("We have nothing to offer you at the moment. See you later!");
        }
        System.out.println();
    }
}

