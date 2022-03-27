package model;

public class Customer {

        private String registrationNumber;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    private int phoneNumber;
        private int cardNumber;  // в случае, если клиент уже регистрировался на сайте
        private boolean clientSelectsProduct;

        // не хватает механизма регистрации, дополнить

        Customer(String registrationNumber, int phoneNumber, int cardNumber) {
            this.registrationNumber = registrationNumber;
            this.cardNumber = cardNumber;
            this.phoneNumber = phoneNumber;
        }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
