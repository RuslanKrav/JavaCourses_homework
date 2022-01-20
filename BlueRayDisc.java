package com.company.lection8.homework;

public class BlueRayDisc {
    private BlueRay blueRay;

    private class BlueRay {

        private String catalog;
        private String subcatalog;
        private String record;

        public void setCatalog(String catalog) {
            this.catalog = catalog;
        }

        public void setSubcatalog(String subcatalog) {
            this.subcatalog = subcatalog;
        }

        public void setRecord(String record) {
            this.record = record;
        }
    }
}
