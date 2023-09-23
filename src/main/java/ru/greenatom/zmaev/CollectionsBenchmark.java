package ru.greenatom.zmaev;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class CollectionsBenchmark {

    @Param({"1000000"})
    private int iterations;

    private ArrayList<Integer> arrayList;
    private LinkedList<Integer> linkedList;
    private TreeSet<Integer> treeSet;
    private HashSet<Integer> hashSet;

    @Setup
    public void setup() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        treeSet = new TreeSet<>();
        hashSet = new HashSet<>();

        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
            linkedList.add(i);
            treeSet.add(i);
            hashSet.add(i);
        }
    }

    @Benchmark
    public void arrayListInsertLast() {
        arrayList.add(0);
    }

    @Benchmark
    public void arrayListGetMiddle() {
        arrayList.contains(iterations / 2);
    }

    @Benchmark
    public void arrayListRemoveMiddle() {
        arrayList.remove(Integer.valueOf(iterations / 2));
    }

    @Benchmark
    public void linkedListInsertLast() {
        linkedList.addLast(0);
    }

    @Benchmark
    public void linkedListGetMiddle() {
        linkedList.get(iterations / 2);
    }

    @Benchmark
    public void linkedListRemoveMiddle() {
        linkedList.remove(iterations / 2);
    }

    @Benchmark
    public void treeSetInsertLast() {
        treeSet.add(0);
    }

    @Benchmark
    public void treeSetRemoveMiddle() {
        treeSet.remove(iterations / 2);
    }

    @Benchmark
    public void treeSetGetMiddle() {
        treeSet.contains(iterations / 2);
    }

    @Benchmark
    public void hashSetInsertLast() {
        hashSet.add(0);
    }

    @Benchmark
    public void hashSetRemoveMiddle() {
        hashSet.remove(iterations / 2);
    }

    @Benchmark
    public void hashSetGetMiddle() {
        hashSet.contains(iterations / 2);
    }

}
