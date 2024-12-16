package Revision;

import java.util.ArrayList;
import java.util.List;

/**Person
 *name
 * age
 * comments
 *
 * SELECT AGE FROM PERSON WHERE AGE < SELECT MAX(AGE) FROM PERSON;
 *
 */
public class BlockingQueue<T> implements IBlockingQueue<T> {
    List<T> items = new ArrayList<>();
    private int maxValue = 10;
    private int length = 0;

    BlockingQueue(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public synchronized void put(T input) throws InterruptedException {
        if (items.size() == maxValue) {
            wait();
        }
        items.add(input);
        notifyAll();
    }

    @Override
    public synchronized T get() throws InterruptedException {
        if (items.size() == 0) {
            wait();
        }
        T output = items.remove(0);
        notifyAll();
        return output;
    }
}
