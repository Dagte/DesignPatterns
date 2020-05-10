package homework.one.before;

public class One {

    /**
     *
     How can we rewrite this method better?
     You can write your solution under after package
     **/

    // class

    // method signature
    // access modifier
    // return type -
    // name of the method
    // method inputs/ arguments

    public boolean postLetter(Address address){

        if(address.country.isEmpty() || address.town.isEmpty()
                || address.postcode.isEmpty())
            throw new RuntimeException("Country, town, " +
                    "post code can not be empty");

        // validate country
        // validate town
        // validate postcode
        // validate streetAddress

        return true;
    }

    public static void main(String[] args) {
        One one = new One();
        Address address = new Address();
        address.postcode = "19000";
        address.country = "Estonia";
        address.town = "Tallinn";

        one.postLetter(address);

    }
}
