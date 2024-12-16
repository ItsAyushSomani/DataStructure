package Revision;

public interface IBlockingQueue<T> {
    public void put(T x) throws InterruptedException;

    public T get() throws InterruptedException;
}
