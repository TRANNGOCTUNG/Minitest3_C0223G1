package model;

import java.util.LinkedList;
import java.util.List;

public interface CRUD <E> {
    void add(List<E> list);
    void display(List<E> list);
    void remove(List<E> list,int index);
    void edit(List<E> list,int index);
}
