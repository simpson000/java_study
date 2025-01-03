package Javamid2.generic.ex1;

public class GenericBox <T>{
    private T item;
    public T set(T item){
        this.item = item;
        return item;
    }
    public T getItem(){
        return item;
    }

}
