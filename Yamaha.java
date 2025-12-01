public class Yamaha extends Motor {
    
   public int isiTangki;
     public int berat;
     
     
     public Yamaha(String Merk, String TipeKendaraan,String jenis,int isiTangki, int berat){
         super(Merk, TipeKendaraan, jenis);
         this.isiTangki = (int) isiTangki;
         this.berat= berat;
     }
    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("JUMLAH ISITANGKI=" + isiTangki);
        System.out.println("Bobot Kendaraan=" + berat);
    }
    public int getisitangki(){
        return isiTangki;
    }

  
}
