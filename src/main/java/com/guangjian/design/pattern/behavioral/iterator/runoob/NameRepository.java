package com.guangjian.design.pattern.behavioral.iterator.runoob;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2023/12/21 14:06
 */
public class NameRepository implements Container {

    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
