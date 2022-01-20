package com.company.lection8.homework;

public class Europa {
    private Countries countries;

    private class Countries {

        private String countryName;
        private double countryTerritory;

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public void setCountryTerritory(double countryTerritory) {
            this.countryTerritory = countryTerritory;
        }
    }
}
