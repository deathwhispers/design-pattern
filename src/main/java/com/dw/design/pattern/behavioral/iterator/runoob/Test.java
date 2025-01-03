package com.dw.design.pattern.behavioral.iterator.runoob;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2023/12/21 14:06
 */
public class Test {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
