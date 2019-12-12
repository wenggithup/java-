package com.weng.demo.Demo11.homework;

import java.util.Collection;
import java.util.Iterator;

public class case3 implements Collection {
    Object obj[]=new Object[50];
    @Override
    public int size() {
            return obj.length;
    }

    @Override
    public boolean isEmpty() {
        if(obj==null){
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
       for(int i=0;i<obj.length;i++){
           if(obj[i].equals(o)){
               return true;
           }
       }
       return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
