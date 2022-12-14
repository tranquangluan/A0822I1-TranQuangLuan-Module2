package ss10_DSA_List.excercise;
import java.util.ArrayList;
import java.util.Arrays;
public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    int size(){
        return this.size;
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }
    void add(int index, E element){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("Error at index = " + index);
        }else {
            if (size==elements.length){
                ensureCapacity();
            }else {
                size++;
                for (int i = index; i < size; i++) {
                    elements[i+1] = elements[i];
                }
                elements[index]= element;
            }
        }
    }
    boolean add(E element){
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
        return true;
    }
    public void remove(int index){
        if (index<0|| index>size){
            throw new IndexOutOfBoundsException("Error at index = " + index);
        }else {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i+1];
            }
            size--;
        }
    }

    public MyList<E> clone(){
        MyList copyArray = new MyList();
        copyArray.elements = Arrays.copyOf(this.elements, this.size);
        copyArray.size = this.size;
        return copyArray;
    }
    boolean contains(E element){
        return indexOf(element)>=0;
    }
    int indexOf(E element){
        if (element == null){
            for (int i = 0; i < size; i++) {
                if (elements[i]==null){
                    return i;
                }
            }
        }else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i]));{
                    return i;
                }
            }
        }
        return -1;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    void ensureCapacity(int minCapacity){
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }
    public E get(int i){
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    void clear(){
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        this.size = 0;
    }
}
