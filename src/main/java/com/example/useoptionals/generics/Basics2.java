package com.example.useoptionals.generics;

public class Basics2 {
    public static void main(String[] args) {
        Store store = new Store();

        store.setPrice(13);
        //doing such type casting is not favourable so what could be the other option? YES GENERICS!!
        Integer result = (Integer) store.getItem();
        System.out.println(result);

        store.setPrice("ten");
        String result2 = (String) store.getItem();
        System.out.println(result2);

        store.setPrice(13);   // not possible to spot this error at compile time
        Double result3 = (Double) store.getItem();
        System.out.println(result3);


    }

}

// Used generics here in next example Basics3
class Store{
    public Object item;
    public void setPrice(Object item){
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}
