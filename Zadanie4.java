public class Zadanie4 {
    static int ID = 0;

    public Zadanie4(){
        ID = ID+1;
    }

    public void viv() {
        System.out.println(ID);
    }

    public static void main(String[] args) {
        Zadanie4 a = new Zadanie4();
        a.viv();
        Zadanie4 b = new Zadanie4();
        b.viv();
        Zadanie4 c = new Zadanie4();
        c.viv();
    }
}
