package OOP.part6.GenericArrayList;

import java.util.Arrays;

public class GenericArrayList<T> {
    private Object[] data ; 
    private int size  = 0 ; 

    public GenericArrayList( int size ){
        data = new Object[size] ; 
    }

    public void add(T val){
        if(isFull()){
            resize() ; 
        }
        data[size++]= val ; 
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2] ; 
        for(int i = 0 ; i < data.length ; i++){
            temp[i] = data[i] ; 
        }
        data = temp ; 
    }

    public T remove(){
        T removed = (T)(data[--size]) ; 
        int temp = size ; 
        for ( int i = temp ; i < data.length ;i++){
            data[i] = null ; 
        }
        return removed ; 
    }


    public int size(){
        return size ; 
    }

    public boolean isFull(){
        return size == data.length ;
    }

    public boolean isEmpty(){
        return size == 0 ; 
    }

    @Override
    public String toString(){
        return Arrays.toString(data) ;
    }

    public static void main(String[] args) {
        GenericArrayList<Integer> list = new GenericArrayList<Integer>(6) ; 
        list.add(3) ; 
        list.add(5);
        list.add(9);

        for ( int i = 0 ; i < 14 ; i++){
            list.add(i * (i+1) * (i+2)) ; 
        }
        System.out.println(list);

        System.out.println("+++++++++++++++++++++++++");

        for ( int i = 0 ;i < 12 ;i++){
            System.out.print(list.remove() + " ");
        }
        System.out.println();
        System.out.println(list.toString());

        System.out.println(list.size());
    }
}