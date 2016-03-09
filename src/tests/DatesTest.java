package tests;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class DatesTest implements Utils {

    public static void main(String[] args) {
        new DatesTest();
    }

    {
        LocalDate localdate;
        LocalTime localtime;
        LocalDateTime localdatetime;

        localdate = LocalDate.now();
        print(localdate);
        localtime = LocalTime.now();
        print(localtime);
        localdatetime = LocalDateTime.now();
        print(localdatetime);
        separator();

        LocalDate date1 = LocalDate.of(2016, Month.MARCH, 8);
        LocalDate date2 = LocalDate.of(2016, 3, 8);
        print(date1);
        print(date1.equals(date2));
        separator();

        LocalTime time1 = LocalTime.of(15, 22);
        LocalTime time2 = LocalTime.of(15, 22, 20);
        LocalTime time3 = LocalTime.of(15, 22, 20, 100000000);
        print(time1);
        print(time2);
        print(time3);
        separator();

        LocalDateTime datetime1 = LocalDateTime.of(2016, Month.MARCH, 8, 15, 22, 20);
        print(datetime1);
        LocalDateTime datetime2 = LocalDateTime.of(date2, time2);
        print(datetime2);
        print(datetime1.equals(datetime2));
        separator();

        LocalDate date = LocalDate.of(2016, Month.NOVEMBER, 1);
        print(date);
        print(date.plusDays(1));
        print(date.plusWeeks(1));
        print(date.plusMonths(1));
        print(date.plusYears(1));
        separator();

        date = LocalDate.of(2016, Month.NOVEMBER, 30);
        print(date);
        print(date.minusDays(1));
        print(date.minusWeeks(1));
        print(date.minusMonths(1));
        print(date.minusYears(1));
        separator();

        LocalTime time = LocalTime.of(10, 20, 30);
        print(time);
        print(time.plusHours(1));
        print(time.plusMinutes(1));
        print(time.plusSeconds(1));
        print(time.plusNanos(1));
        separator();

        time = LocalTime.of(10, 20, 30);
        print(time);
        print(time.minusHours(1));
        print(time.minusMinutes(1));
        print(time.minusSeconds(1));
        print(time.minusNanos(1));
        separator();

        print(LocalDateTime.now().isBefore(LocalDateTime.now()));
        print(LocalDateTime.now().isAfter(LocalDateTime.now()));
        separator();

        print(LocalDate.now().toEpochDay() + " days since 1970");
        print(LocalDateTime.now().toEpochSecond(ZoneOffset.MIN) + " seconds since 1970");
        separator();

        Period oneMonth = Period.ofMonths(1);
        LocalDate startDate = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2015, Month.DECEMBER, 31);
        date = startDate;
        while (date.isBefore(endDate)) {
            print(date = date.plus(oneMonth));
        }
        separator();

        Duration oneSecond = Duration.ofSeconds(1);
        LocalTime startTime = LocalTime.of(10, 10, 10);
        LocalTime endTime = LocalTime.of(10, 10, 20);
        time = startTime;
        while (time.isBefore(endTime)) {
            print(time);
            time = time.plus(oneSecond);
        }
        separator();

        LocalDateTime datetime = LocalDateTime.now();
        print(localdatetime.getDayOfWeek());
        print(localdatetime.getMonth());
        print(localdatetime.getMinute());
        separator();

        print(datetime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        print(datetime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        print(datetime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        print(datetime.format(DateTimeFormatter.ISO_DATE_TIME));
        print(datetime.format(DateTimeFormatter.BASIC_ISO_DATE));
        print(datetime.format(DateTimeFormatter.ISO_DATE));
        print(datetime.format(DateTimeFormatter.ISO_TIME));
        print(datetime.format(DateTimeFormatter.ISO_WEEK_DATE));
        separator();

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter longFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter fullFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        datetime = LocalDateTime.now();
        print(datetime.format(shortFormat));
        print(datetime.format(mediumFormat));
        print(datetime.format(longFormat));
        print(datetime.format(fullFormat));
        separator();

        date = LocalDate.now();
        print(date.format(shortFormat));
        print(shortFormat.format(date));
        print(date.format(mediumFormat));
        print(mediumFormat.format(date));
        print(date.format(longFormat));
        print(longFormat.format(date));
        print(date.format(fullFormat));
        print(fullFormat.format(date));
        separator();

        print(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(LocalDateTime.now()));
        print(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(LocalDateTime.now()));
        separator();

        DateTimeFormatter dateTimeFormatter;
        datetime = LocalDateTime.now();

        dateTimeFormatter = DateTimeFormatter.ofPattern("MMM");
        print(dateTimeFormatter.format(datetime));
        dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM, YYYY");
        print(dateTimeFormatter.format(datetime));
        dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm:ss am");
        print(dateTimeFormatter.format(datetime));
        separator();

        String myDate = "2016, marzo, 04, 5:54:14";
        DateTimeFormatter myDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy, MMMM, dd, h:mm:ss");
        TemporalAccessor temporalAccessor = myDateTimeFormatter.parse(myDate);
        print(temporalAccessor);

        LocalDate myLocalDate = LocalDate.parse("2016, marzo, 04", DateTimeFormatter.ofPattern("yyyy, MMMM, dd"));
        print(myLocalDate);
        LocalTime myLocalTime = LocalTime.parse("05:54");
        print(myLocalTime);
        separator();


    }

}
