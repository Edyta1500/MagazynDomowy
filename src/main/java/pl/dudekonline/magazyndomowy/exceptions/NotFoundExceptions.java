package pl.dudekonline.magazyndomowy.exceptions;

public class NotFoundExceptions extends RuntimeException{
    public  NotFoundExceptions(){
        super("Object does not exist");
    }
}
