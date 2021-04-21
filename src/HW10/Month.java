package HW10;

public final class  Month {
    private final String name;
    private final int days;
    private final int wordDays;

    public Month(String name, int days, int wordDays) {
        this.name = name;
        this.days = days;
        this.wordDays = wordDays;
    }

    public String getName() {
        return name;
    }


    public int getDays() {
        return days;
    }


    public int getWordDays() {
        return wordDays;
    }




}
