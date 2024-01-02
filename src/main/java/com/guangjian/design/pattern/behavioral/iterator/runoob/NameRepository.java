package com.guangjian.design.pattern.behavioral.iterator.runoob;

/**
 * 实现容器接口
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2023/12/21 14:06
 */
public class NameRepository implements Container {

    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        // 返回一个迭代器
        return new NameIterator();
    }

    // 定义一个迭代器，实现迭代器接口的方法
    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
