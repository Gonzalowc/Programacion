package FM;

public class Main {
    public static void main(String[] args) {
        RadioFM f = new RadioFM();

        f.display();
        for (int i = 0; i < 4; i++) {
            f.up();
            f.display();
        }
        for (int i = 0; i < 6; i++) {
            f.down();
            f.display();
        }
    }
}
