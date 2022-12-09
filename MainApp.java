public class MainApp {
    public static void main(String [] args) {
        TransportasiAir TransportasiAir = new TransportasiAir(16, 20000);
        TransportasiAir.informasi();

        System.out.println();

        Sampan Sampan = new Sampan(50, 3000, 40);
        Sampan.informasi();
        Sampan.berlayar();
        Sampan.berlabuh();
        Sampan.berlabuh(5);
        System.out.println();

        Kapal kapal = new Kapal(20, 10000, "diesel");
        kapal.informasi();
        kapal.berlayar();   
        kapal.berlayar(70);
        kapal.berlabuh();
    }
}