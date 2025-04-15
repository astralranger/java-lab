// Name: Parth Ubhe
// PRN: 23070126086
// Batch: B1

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started.");
        
        
        //creating the objects from the MyThread.java class
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        
        
        //starting those threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread ended.");
    }
}
