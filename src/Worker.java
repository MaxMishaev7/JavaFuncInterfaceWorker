public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    int tasks = (int) (Math.random() * 100);
    private int error;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < tasks; i++) {
            error =  (int) (Math.random() * tasks);
            if (i != error) {
                callback.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError("Task " + i + ": ERROR");
            }
        }
    }
}
