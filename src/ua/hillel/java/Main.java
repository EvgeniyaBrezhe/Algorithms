package ua.hillel.java;

public class Main {

    public static void main(String[] args) {
        Client firstClient = new Client();
        firstClient.firstName = "First name 1";
        firstClient.lastName = "Last Name 1";
        firstClient.age = 17;
        firstClient.amountOfMoney = 10_000;
        firstClient.isReadyToLoan = false;

        Client secondClient = new Client();
        secondClient.firstName = "First name 2";
        secondClient.lastName = "Last Name 2";
        secondClient.age = 19;
        secondClient.amountOfMoney = 20_000;
        secondClient.isReadyToLoan = false;

        Client thirdClient = new Client();
        thirdClient.firstName = "First name 3";
        thirdClient.lastName = "Last Name 3";
        thirdClient.age = 20;
        thirdClient.amountOfMoney = 15_000;
        thirdClient.isReadyToLoan = true;

        Client forthClient = new Client();
        forthClient.firstName = "First name 4";
        forthClient.lastName = "Last Name 4";
        forthClient.age = 20;
        forthClient.amountOfMoney = 15_000;
        forthClient.isReadyToLoan = false;

        Car firstCar = new Car();
        firstCar.name = "renault";
        firstCar.color = "white";
        firstCar.count = 1;
        firstCar.price = 20_000;

        Loan defaultLoan = new Loan();
        defaultLoan.loanTermYears = 3;

        firstClient.buyCar(firstCar.price, defaultLoan.loanTermYears);
        secondClient.buyCar(firstCar.price, defaultLoan.loanTermYears);
        thirdClient.buyCar(firstCar.price, defaultLoan.loanTermYears);
        forthClient.buyCar(firstCar.price, defaultLoan.loanTermYears);
    }
}
