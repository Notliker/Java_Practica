package Hw6;


public class PrintableTest {
    public static void main(String[] args) {
        Printable[] Shopsandmarkets = {new Markets("\"flea\" market"), new Shop("Levi's shop"), new Markets("Moscow market")};
        for(Printable el : Shopsandmarkets){
            el.print();
        }
    }
}
interface Printable {
    void print();
}
class Markets implements Printable{
    private String title;

    public Markets(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println(this.title);
    }
}
class Shop implements Printable{
    private String title;

    public Shop(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println(this.title);
    }
}