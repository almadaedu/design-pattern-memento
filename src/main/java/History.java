
import java.util.ArrayList;
import java.util.List;
class History {
    private final List<EditorMemento> mementos = new ArrayList<>();

    public void push(EditorMemento memento) {
        mementos.add(memento);
    }

    public EditorMemento pop() {
        int lastIndex = mementos.size() - 1;
        EditorMemento lastMemento = mementos.get(lastIndex);
        mementos.remove(lastIndex);
        return lastMemento;
    }
}