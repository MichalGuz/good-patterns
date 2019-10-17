package prototype_library;

public class PrototypeLibrary <T> implements Cloneable {
    @Override
    public T clone() {
        return (T)super.clone();
    }

}
