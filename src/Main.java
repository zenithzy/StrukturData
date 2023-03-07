import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transportasi> listTransportasi = new ArrayList<>();
        Transportasi<Motor, Mobil> pertamax = new Transportasi<>();
        Transportasi<Motor, Mobil> pertalite = new Transportasi<>();

        Motor yamaha = new Motor();
        yamaha.setNamaKendaraan("Yamaha nmax");
        Mobil honda = new Mobil();
        honda.setNamaKendaraan("Honda Jazz");
        pertamax.setTransportasi(yamaha, honda);
        listTransportasi.add(pertamax);

        Motor suzuki = new Motor();
        suzuki.setNamaKendaraan("Suzuki gsxr");
        Mobil toyota = new Mobil();
        toyota.setNamaKendaraan("Toyota Yaris");
        pertalite.setTransportasi(suzuki, toyota);
        listTransportasi.add(pertalite);

        System.out.println("Jenis Kendaraan");
        for(Transportasi<Motor,Mobil> transportasi: listTransportasi){
            Motor motor = transportasi.getD();
            Mobil mobil = transportasi.getE();

            System.out.println(motor.jenis());
            System.out.println(mobil.jenis());
        }


    }
}
