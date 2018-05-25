package epic.core;

public abstract class Epic extends Object {
    public Epic() {
        super();
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
