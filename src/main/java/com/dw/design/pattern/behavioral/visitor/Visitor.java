package com.dw.design.pattern.behavioral.visitor;

/**
 * Created by geely
 */
public class Visitor implements IVisitor {

    //访问免费课程，打印所有免费课程名称
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程:"+freeCourse.getName());
    }

    //访问实战课程，打印所有实战课程名称及价格
    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程:"+codingCourse.getName()+" 价格:"+codingCourse.getPrice()+"元");
    }

}
