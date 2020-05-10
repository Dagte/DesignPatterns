package six.before;

import java.util.Date;
import java.util.List;

public class MethodWithTooManyArguments {
    /**
     *  Problem :
     *  Get user reservations from
     *  between begin date and end date and
     *  Location
     *
     *  Let's add number of people
     */

    public static List<Reservation> getUpcomingReservations(Date dateFrom,
                                                            Date dateTo,
                                                     User user, int locationId,
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
        return ReservationService.getReservations();
    }


    public static void main(String[] args) {

        Date from = new Date();
        Date to = new Date();
        User user = new User();
        LocationType locationType = new LocationType();
        // I would like to add #ofPeople
        List<Reservation> reservations =
                getUpcomingReservations(from, to, user, 2, locationType);

    }

}

