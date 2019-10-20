package prototype_bank;

public class PrototypeBank <T> implements Cloneable {
    @Override
    public T clone() throws CloneNotSupportedException {
        return (T)super.clone();
    }
}
