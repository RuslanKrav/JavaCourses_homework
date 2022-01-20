package com.company.lection8.homework;

public class City {
    private String country;
    private String city;
    private CityCapacity cityCapacity;

    private class CityCapacity {

        private String building;
        private String shop;
        private String gym;

        public void setBuilding(String building) {
            this.building = building;
        }

        public void setShop(String shop) {
            this.shop = shop;
        }

        public void setGym(String gym) {
            this.gym = gym;
        }
    }
}
