public class Kawasaki extends Motor {
    
    
    public int roda;
     public int speed;
     
     
     public Kawasaki (String Merk, String TipeKendaraan,String jenis,int roda, int speed){
         super(Merk, TipeKendaraan, jenis);
         this.roda = roda;
         this.speed= speed;
     }
    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("JUMLAH RODA=" + roda);
        System.out.println("JUMLAH SPEED=" + speed);
    }
}
