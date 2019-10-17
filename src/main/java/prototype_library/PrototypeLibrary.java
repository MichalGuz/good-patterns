package prototype_library;

public class PrototypeLibrary <T> implements Cloneable {
    @Override
    public T clone() throws CloneNotSupportedException{
        return (T)super.clone();
    }

}
