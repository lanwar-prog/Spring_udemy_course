package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(Book book){
        System.out.println("We take the book from UniLibrary " + book.getName());
    }

//    public String  returnBook(){
//        System.out.println("We return the book from UniLibrary");
//        return "ok";
//    }

    public void getMagazine(){
        System.out.println("We take the magazine from UniLibrary ");
    }
}
