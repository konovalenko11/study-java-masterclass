/*
    Create a method called getDurationString with two parameters, first
    parameter minutes and 2nd parameter seconds.
    You should validate that the first parameter minutes is >= 0.
    You should validate that the 2nd parameter seconds is >= 0 and <= 59.
    The method should return "Invalid value" in the method if either of the
    above are not true.

    If the parameters are valid then calculate how many hours minutes and
    seconds equal the minutes and seconds passed to this method and return that
    value as string in format "XXh YYm ZZs" where XX represents a number of
    hours, YY the minutes and ZZ the seconds.

    Create a 2nd method of the same name but with only one parameter seconds.

    Validate that it is >= 0, and return "Invalid value" if it is not true.

    If it is valid, then calculate how many minutes are in the seconds value and
    then call the other overloaded method passing the correct minutes and
    seconds calculated so that it can calculate correctly.

    Call both methods to print values to the console.

    Tips:
        Use int or long for your number data types is probably a good idea.
        1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
        Methods should be static as we have used previously.

    Bonus:
        For the input 61 minutes output should be 01h 01m 00s, but it is ok if
        it is 1h 1m 0s (Tip: use if-else)
        Create a new console project and call it SecondsAndMinutesChallenge
 */
public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(60, 20));
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(0, 20));
        System.out.println(getDurationString(0, 60));
        System.out.println(getDurationString(-10, 60));
        System.out.println(getDurationString(10, -20));
        System.out.println(getDurationString(-20));
        System.out.println(getDurationString(20));
        System.out.println(getDurationString(120));
        System.out.println(getDurationString(900121));
        System.out.println(getDurationString(59));
    }

    public static String getDurationString (long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        final int minutesInHour = 60;

        long resultHours = minutes / minutesInHour;
        long resultMinutes = minutes % minutesInHour;

        return String.format("%02dh %02dm %02ds", resultHours, resultMinutes,
                seconds);
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        final int secondsInMinute = 60;

        long resultMinutes = seconds / secondsInMinute;
        long resultSeconds = seconds % secondsInMinute;

        return getDurationString(resultMinutes, resultSeconds);
    }

}
