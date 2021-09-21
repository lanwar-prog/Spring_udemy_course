package org.example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();
        context.close();
    }
}
