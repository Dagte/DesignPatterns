package six.after;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.List;

public class MethodWithTooManyArguments {

    public static void main(String[] args) {
        ReservationQuery query = new ReservationQuery();
        query.dateFrom = new Date();
        query.personCount = 3;
        List<Reservation> reservaltions =
                getUpcomingReservationsThirdRefactoring(query);
    }


    public List<Reservation> getUpcomingReservations(Date dateFrom,
                                                     Date dateTo,
                                                     User user,
                                                     int locationId,
                                                     LocationType locationType)
    {
        // validations...
        Date now = new Date();
        if (dateFrom.after(dateTo))
            throw new IllegalArgumentException("dateFrom can not be ....");
        if (dateTo.before(now))
            throw new IllegalArgumentException("dateTo can not be ....");

        // do other validations...

        // get reservations from system...

        throw new NotImplementedException();
    }




    public List<Reservation> getUpcomingReservationsFirstRefactoring
    (DateRange dateRange, User user, int locationId, LocationType locationType){
        throw new NotImplementedException();
    }




    public List<Reservation> getUpcomingReservationsSecondRefactoring
            (DateRange dateRange, User user, Location location){
        throw new NotImplementedException();
    }



    public static List<Reservation> getUpcomingReservationsThirdRefactoring(ReservationQuery query){
        throw new NotImplementedException();
    }
}

class DateRange{
    Date dateFrom;
    Date dateTo;
}


class Location{
    int locationId;
    LocationType locationType;
}


class ReservationQuery{
    Date dateFrom;
    Date dateTo;
    User user;
    int locationId;
    LocationType locationType;
    int personCount;
    int locationStars;
}



class LocationType
{

}

class Reservation{


}

class User{

}
