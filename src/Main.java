public class Main {
    public static void main(String[] args) {
        System.out.println("It`s a new work!");
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listnErr = System.out::println;
        Worker worker = new Worker(listener, listnErr);
        worker.start();
    }
}