package com.efimchick.ifmo.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class SortedByAbsoluteValueIntegerSet implements Set<Integer> {
    private final Set<Integer> sortedIntegerSet = new TreeSet<>(new AbsoluteValueIntegerComparator());

    @Override
    public int size() {
        return sortedIntegerSet.size();
    }

    @Override
    public boolean isEmpty() {
        return sortedIntegerSet.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return sortedIntegerSet.contains(o);
    }

    @Override
    public Iterator iterator() {
        return sortedIntegerSet.iterator();
    }

    @Override
    public Object[] toArray() {
        return sortedIntegerSet.toArray();
    }

    @Override
    public boolean add(Integer o) {
        return sortedIntegerSet.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return sortedIntegerSet.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        return sortedIntegerSet.addAll(c);
    }

    @Override
    public void clear() {
        sortedIntegerSet.clear();
    }

    @Override
    public boolean removeAll(Collection c) {
        return sortedIntegerSet.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return sortedIntegerSet.retainAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return sortedIntegerSet.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return sortedIntegerSet.toArray(a);
    }
}