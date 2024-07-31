package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int value;
    int max;
    int min;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
        this.value = random.nextInt(min, max + 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return (value != 100);
            }

            @Override
            public Integer next() {
                return random.nextInt(min, max + 1);
            }
        };
    }
}
