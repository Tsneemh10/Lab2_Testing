public class EvenOrOdd {
    private int num;

    public void insertNum(int num) {
        this.num = num;
    }
    public String EO(int num) {
        return (num % 2 == 0 ) ? "Even":"Odd";
    }

    public static void main(String[] args) {

    }
}
