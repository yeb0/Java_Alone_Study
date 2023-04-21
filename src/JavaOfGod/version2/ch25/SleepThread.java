package JavaOfGod.version2.ch25;

public class SleepThread extends Thread {
    long sleepTime;
    public SleepThread(long sleepTime) {
        this.sleepTime = sleepTime;
    }
    public void run() {
        try {
            System.out.println("Sleeping get name ? " + getName());
            Thread.sleep(sleepTime);
            System.out.println("Sleeping get name ? " + getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
