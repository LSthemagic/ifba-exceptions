package entities.exceptions;

public class AlreadyExistsExecption extends RuntimeException{
    public AlreadyExistsExecption(String msg){
        super(msg);
    }
}
