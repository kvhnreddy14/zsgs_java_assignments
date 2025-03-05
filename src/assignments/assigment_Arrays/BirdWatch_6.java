package assignments.assigment_Arrays;

class BirdWatcher {

    private int[] birdsPerDay;


    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }


    public int[] getLastWeek() {
        return this.birdsPerDay;
    }


    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }


    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }


    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }


    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < limit; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }


    public int getBusyDays() {
        int busyDays = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
public class BirdWatch_6 {
    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1, 8};
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);
    }
}
