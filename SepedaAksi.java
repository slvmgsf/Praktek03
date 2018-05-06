package praktek03;
public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();

        s.setMerk("Hornet");
        s.setWarna("Hitam");
        s.setHarga(100000);
        //gak bisa s.setJenisMotor();
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Merknya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Merknya \t: ");
        System.out.println(s.getHarga());
        
        SepedaMotor sm = new SepedaMotor();
        sm.setMerk("Lanaya");
        sm.setWarna("Hitam");
        sm.setHarga(150000);
        sm.setJenisMotor("Aki");
        sm.cetakInfo();
        System.out.println("Jenis :"+sm.getJenisMotor());
        sm.throttle();
    }
}
