package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("We take the book from UniLibrary");
    }

    public String  returnBook(){
        System.out.println("We return the book from UniLibrary");
        return "ok";
    }

    public void getMagazine(){
        System.out.println("We take the magazine from UniLibrary");
    }
}
