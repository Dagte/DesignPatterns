package eight.before;

import java.util.Date;

public class Reservation {

    public Date from;
    public Customer customer;
    public boolean isCanceled;

    public Reservation(Customer customer, Date date)
    {
        this.from = date;
        this.customer = customer;
    }

    public void cancel()
    {
        Date now = new Date();
        validate(now);
        long elapsedHours = getElapsedHours(now);

        if (isGoldCustomer())
        {
            checkCancellation(elapsedHours, 24);
        }
        else
        {
            checkCancellation(elapsedHours, 48);
        }
        isCanceled = true;
    }

    private void checkCancellation(long elapsedHours, int i) {
        if (elapsedHours < i) {
            throw new IllegalStateException("It's too late to cancel.");
        }
    }

    private void validate(Date now) {
        if (now.after(from)) {
            throw new IllegalStateException("It's too late to cancel.");
        }
    }

    private long getElapsedHours(Date now) {
        //milliseconds
        long different = now.getTime() - from.getTime();
        long hoursInMilli = 60 * 60 * 1000 * 24;
        return different / hoursInMilli;
    }

    private boolean isGoldCustomer() {
        return customer.loyaltyPoints > 100;
    }
}
