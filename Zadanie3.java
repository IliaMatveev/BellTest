public class Zadanie3 {

        public Zadanie3(String s){
            System.out.println(s);
        }

        public Zadanie3(){
            System.out.println("111");
        }

        public static void main(String[] args) {
            Zadanie3 msg = new Zadanie3("Cообщение полученное при создании объекта");
            Zadanie3 msg2 = new Zadanie3();
        }
}
