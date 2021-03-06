package pl.openthejar.misc;

import java.util.Calendar;
import java.util.Date;

/**
 * Klasa dodajaca usprawnienia w porownywaniu dat
 */
public class DateUtils {

    /**
     * Sprawdza czy w dwoch datach dzien jest ten sam
     * @param date1 Pierwsza data
     * @param date2 Druga data
     * @return Czy dzien jest ten sam
     */
    private static boolean isSameDay(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return isSameDay(cal1, cal2);
    }

    /**
     * Sprawdza czy w dwoch kalendarzach dzien jest ten sam
     * @param cal1 Pierwszy kalendarz
     * @param cal2 Drugi kalendarz
     * @return Czy dzien jest ten sam
     */
    private static boolean isSameDay(Calendar cal1, Calendar cal2) {
        if (cal1 == null || cal2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        return (cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) &&
                cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR));
    }

    /**
     * Sprawdza czy data wskazuje na dzisiejsza
     * @param date Data do sprawdzenia
     * @return Czy data jest dzisiejsza
     */
    public static boolean isToday(Date date) {
        return isSameDay(date, Calendar.getInstance().getTime());
    }

    /**
     * Sprawdza czy w dwoch datach miesiac jest ten sam
     * @param date1 Pierwsza data
     * @param date2 Druga data
     * @return Czy miesiac jest ten sam
     */
    private static boolean isSameMonth(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return isSameMonth(cal1, cal2);
    }

    /**
     * Sprawdza czy w dwoch kalendarzach miesiac jest ten sam
     * @param cal1 Pierwszy kalendarz
     * @param cal2 Drugi kalendarz
     * @return Czy miesiac jest ten sam
     */
    private static boolean isSameMonth(Calendar cal1, Calendar cal2) {
        if (cal1 == null || cal2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        return (cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) &&
                cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH));
    }

    /**
     * Sprawdza czy data wskazuje na aktualny miesiac
     * @param date Data do sprawdzenia
     * @return Czy data ma aktualny miesiac
     */
    public static boolean isThisMonth(Date date) {
        return isSameMonth(date, Calendar.getInstance().getTime());
    }
}
