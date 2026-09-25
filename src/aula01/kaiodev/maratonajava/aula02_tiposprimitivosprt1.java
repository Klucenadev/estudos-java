package aula01.kaiodev.maratonajava;


public class aula02_tiposprimitivosprt1 {
    static void main(String[] args) {

        //casting é quando você força o java a colocar um valor long no int. NÂO FAÇA ISSO!!
        int intforlong = (int) 10000000000L;
        long longforint = (int) 127.0;
        //temos alguns tipos primitivos: int,float,duble,char,byte,short,boolean e long.
        int age = 19;
        long numerogrande = 100000;
        double salariodouble = 1550;
        float salariofloat = 2500;
        short idadeshrot = 19;
        byte idadebyte = 19;
        boolean verdadeiro = true;
        boolean falso = false;

        //cuidado ao colocar numero no char pois você pode estar ultilizando a tabela ASCII.
        char caratere = 'K';
        char caractere1 = 65;

        //String não é uma variavel é uma classe
        String nome = "Kaio";

        // O + é usado para concatenar
        System.out.println("sua idade é " + age + " anos");
        System.out.println(verdadeiro);
        System.out.println("tabela ASCII: " + caractere1);
        System.out.println("oi meu nome é " + nome);
    }
}