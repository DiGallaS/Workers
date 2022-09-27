package Workers;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
