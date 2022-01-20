package com.company.lection8.homework;

public class Mobile {
    private String phoneBrand;
    private String phoneModel;
    private PhoneSpecifications phoneSpecifications;

    private class PhoneSpecifications {

        private String model;
        private long battery;
        private double screen;

        public void setModel(String model) {
            this.model = model;
        }

        public void setBattery(long battery) {
            this.battery = battery;
        }

        public void setScreen(double screen) {
            this.screen = screen;
        }
    }
}
