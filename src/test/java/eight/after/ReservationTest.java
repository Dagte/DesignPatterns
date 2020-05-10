package eight.after;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ReservationTest {

    @Test
    public void goldCustomerCancellingMoreThan24HoursShouldCancel()
    {
        // Arrange
        Customer customer = createGoldCustomer();
        Date date = getDate(25);
        Reservation reservation = new Reservation(customer, date);

        // Act
        reservation.cancel();

        // Assert
        Assert.assertTrue(reservation.isCanceled);
    }

    @Test(expected = IllegalStateException.class)
    public void goldCustomerCancellingLessThan24HoursBeforeShouldThrowException()
    {
        Customer customer = createGoldCustomer();
        Date date = getDate(23);
        Reservation reservation = new Reservation(customer, date);

        reservation.cancel();
    }


    @Test(expected = IllegalStateException.class)
    public void goldCustomerCancellingAfterStartDateShouldThrowException()
    {
        Customer customer = createGoldCustomer();
        Date date = getDate(-1);
        Reservation reservation = new Reservation(customer, date);

        reservation.cancel();
    }

    @Test
    public void regularCustomerCancellingMoreThan48HoursBeforeShouldCancel()
    {
        // Arrange
        Customer customer = createRegularCustomer();
        Date date = getDate(49);
        Reservation reservation = new Reservation(customer, date);

        //Act
        reservation.cancel();

        // Assert
        Assert.assertTrue(reservation.isCanceled);
    }

    @Test(expected = IllegalStateException.class)
    public void regularCustomerCancellingLessThan48HoursShouldThrowException()
    {
        Customer customer = createRegularCustomer();
        Date date = getDate(47);
        Reservation reservation = new Reservation(customer, date);

        reservation.cancel();
    }

    @Test(expected = IllegalStateException.class)
    public void regularCustomerCancellingAfterStartDateShouldThrowException()
    {
        Customer customer = createRegularCustomer();
        Date date = getDate(-1);
        Reservation reservation = new Reservation(customer, date);

        reservation.cancel();
    }

    private Date getDate(int hour) {
        LocalDate localDate = LocalDate.now().plusDays(hour);
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    private static Customer createGoldCustomer()
    {
        Customer customer = new Customer();
        customer.loyaltyPoints = 200;
        return customer;
    }

    private static Customer createRegularCustomer()
    {
        return new Customer();
    }

}