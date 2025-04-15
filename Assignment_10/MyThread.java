public class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName + " started running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
              //sleep for 5ms
                Thread.sleep(500);  
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }
}
