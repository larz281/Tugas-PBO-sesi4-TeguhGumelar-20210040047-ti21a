//Teguh Gumelar
//20210040047
//TI21A
//PBO sesi 4

public class Tekken {
    public static void main(String[] args) {
        Player Yoshimitsu = new Yoshimitsu();
       Player Panda = new Panda();
         Yoshimitsu.print();
        Panda.print();
        Yoshimitsu.diSerang(Panda);
        Yoshimitsu.print();
        Panda.diSerang(Yoshimitsu.getSerangan());
        Panda.print();
        
    }
}

