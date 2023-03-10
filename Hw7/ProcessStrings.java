package Hw7;


public class ProcessStrings implements Stringable {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public ProcessStrings(String str) {
        this.str = str;
    }
    public int counter() {
        return str.length();
    }
    public String oddNums() {
        String st = "";
        int i = 0;
        char ch;
        while(i < str.length()) {
            ch = str.charAt(i);
            st += ch;
            i += 2;
        }
        return st;
    }
    public String inversion() {
        String st = "";
        char ch;
        int i = str.length() - 1;
        while(i >= 0) {
            ch = str.charAt(i);
            st += ch;
            i--;
        }
        return st;
    }

    @Override
    public String toString() {
        String res = "Original string: " + str + '\n' +
                "Count of symbol: " + counter() + '\n' +
                "Odd symbol: " + oddNums() + '\n' +
                "In reverse: " + inversion();
        return res;
    }
}