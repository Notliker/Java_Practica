package Hw19;
import java.math.BigInteger;
import java.util.Scanner;


public class InnChecker {

    public static void main(String[] args) throws InnNotValidException {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter INN");
            BigInteger inn =  new BigInteger(sc.nextLine());
            checkInn(inn);
            break;
        }
        System.out.println("INN correct!");
    }

    public static boolean checkInn(BigInteger inn) throws InnNotValidException {
        int i = 0;
        BigInteger cInn = new BigInteger(inn.toByteArray());
        while (!cInn.equals(new BigInteger("0"))){
            i++;
            cInn = new BigInteger(cInn.divide(new BigInteger("10")).toByteArray());
        }
        if(i != 10 && i != 12) throw new InnNotValidException(inn);
        return true;
    }}