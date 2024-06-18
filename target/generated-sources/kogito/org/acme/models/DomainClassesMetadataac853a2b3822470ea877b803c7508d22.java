package org.acme.models;
public class DomainClassesMetadataac853a2b3822470ea877b803c7508d22 {

    public static final org.drools.model.DomainClassMetadata java_util_Date_Metadata_INSTANCE = new java_util_Date_Metadata();
    private static class java_util_Date_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return java.util.Date.class;
        }

        @Override
        public int getPropertiesSize() {
            return 14;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "date": return 1;
                case "day": return 2;
                case "hours": return 3;
                case "minutes": return 4;
                case "month": return 5;
                case "seconds": return 6;
                case "time": return 7;
                case "timezoneOffset": return 8;
                case "year": return 9;
                case "clone": return 10;
                case "toGMTString": return 11;
                case "toInstant": return 12;
                case "toLocaleString": return 13;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class java.util.Date");
        }
    }
    public static final org.drools.model.DomainClassMetadata org_acme_models_Driver_Metadata_INSTANCE = new org_acme_models_Driver_Metadata();
    private static class org_acme_models_Driver_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.acme.models.Driver.class;
        }

        @Override
        public int getPropertiesSize() {
            return 10;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "age": return 1;
                case "city": return 2;
                case "id": return 3;
                case "licenseExpiration": return 4;
                case "name": return 5;
                case "points": return 6;
                case "state": return 7;
                case "validLicense": return 8;
                case "builder": return 9;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.acme.models.Driver");
        }
    }
}