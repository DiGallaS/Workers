package Workers;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
