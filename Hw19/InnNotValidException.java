package Hw19;
import java.math.BigInteger;


public class InnNotValidException extends Exception {

    private final BigInteger innNum;

    public InnNotValidException(BigInteger inn){
        super("INN "+ inn + " is not valid!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}
