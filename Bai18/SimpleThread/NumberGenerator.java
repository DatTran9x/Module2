package Bai18.SimpleThread;

public class NumberGenerator implements Runnable {
    private Thread myThread;

    public NumberGenerator() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my thread created" + myThread);
    }

    public Thread getMyThread() {
        return myThread;
    }

    public void max(){
        myThread.setPriority(Thread.MAX_PRIORITY);
    }

    public void min(){
        myThread.setPriority(Thread.MIN_PRIORITY);
    }

    @Override
    synchronized public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int hashCode(){
        return myThread.hashCode();
    }
}
