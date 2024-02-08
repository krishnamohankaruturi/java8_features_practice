package org.example.miscellinious;

 class Address  implements  Cloneable{

    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

     public void setStreet(String street) {
         this.street = street;
     }

     public void setCity(String city) {
         this.city = city;
     }

     public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
     public Object clone() throws CloneNotSupportedException {
         return super.clone();
     }

    @Override
    public String toString() {
        return "{Street: " + street + ", City: " + city + "}";
    }

}
