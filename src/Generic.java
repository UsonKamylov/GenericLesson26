public class Generic <U>{
    private U value;

    public Generic(U value) {
        this.value = value;
    }

    public Generic() {
    }

    public U getValue() {
        return value;
    }

    public void setValue(U value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "value=" + value +
                '}';
    }
}
