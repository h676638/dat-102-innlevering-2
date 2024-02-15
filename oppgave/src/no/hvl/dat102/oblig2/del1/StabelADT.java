package no.hvl.dat102.oblig2.del1;

public interface StabelADT<T> {
    public void push(T newEntry);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public void clear();
}