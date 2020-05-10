package eight.after;

import java.util.Date;

class Reservation {
    public Date from;
    public Customer customer;
    public boolean isCanceled;

    public Reservation(Customer customer, Date date) {
        this.from = date;
        this.customer = customer;
    }

    public void cancelBefore() {
        if (customer.loyaltyPoints > 100) {
            // Gold customers can cancel up to 24 hours before
            Date now = new Date();
            // If reservation already started throw exception
            if (now.after(from)) {
                throw new IllegalStateException("It's too late to cancel.");
            }
            //milliseconds
            long different = now.getTime() - from.getTime();
            long hoursInMilli = 60 * 60 * 1000 * 24;
            long elapsedHours = different / hoursInMilli;

            if (elapsedHours < 24) {
                throw new IllegalStateException("It's too late to cancel.");
            }

            isCanceled = true;
        } else {
            // Regular customers can cancel up to 48 hours before
            Date now = new Date();
            // If reservation already started throw exception
            if (now.after(from)) {
                throw new IllegalStateException("It's too late to cancel.");
            }
            //milliseconds
            long different = now.getTime() - from.getTime();
            long hoursInMilli = 60 * 60 * 1000 * 24;
            long elapsedHours = different / hoursInMilli;


            if (elapsedHours < 48) {
                throw new IllegalStateException("It's too late to cancel.");
            }

            isCanceled = true;
        }

    }

    public void cancel() {
        Date now = new Date();
        validateReservationStarted(now);
        long elapsedHours = getElapsedHours(now);
        if (isEligibleToCancel(elapsedHours)) {
            throw new IllegalStateException("It's too late to cancel.");
        }
        isCanceled = true;
    }

    private boolean isEligibleToCancel(long elapsedHours) {
        return (isGoldCustomer() && isLessThan(elapsedHours, 24))
                || (!isGoldCustomer() && isLessThan(elapsedHours, 48));
    }

    private void validateReservationStarted(Date now) {
        if (now.after(from)) {
            throw new IllegalStateException("It's too late to cancel.");
        }
    }

    private boolean isLessThan(long elapsedHours, int maxHours) {
        return elapsedHours < maxHours;
    }

    private long getElapsedHours(Date now) {
        //calculate elapsed hours
        long different = from.getTime() - now.getTime();
        long hoursInMilli = 60 * 60 * 1000 * 24;
        return different / hoursInMilli;
    }

    private boolean isGoldCustomer() {
        return customer.loyaltyPoints > 100;
    }
}
