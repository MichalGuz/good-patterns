package prototype_tasks;

public class Prototype <T> implements Cloneable{
    @Override
    public T clone(){
        return (T)super.clone();
    }
}
