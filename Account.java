package com.company.lection8.homework;

public class Account {
    private String firstName;
    private String lastName;
    private String bank;
    private Operations op;
    public Account(String firstName, String lastName, String bank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bank = bank;
    }

    private class Operations {

        private String cashWithdraw;
        private String payments;
        private String inCash;

        public void setCashWithdraw(String cashWithdraw) {
            this.cashWithdraw = cashWithdraw;
        }

        public void setPayments(String payments) {
            this.payments = payments;
        }

        public void setInCash(String income) {
            this.inCash = income;
        }
    }
}
