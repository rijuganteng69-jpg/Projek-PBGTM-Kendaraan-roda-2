public class Honda extends Motor {
     public int sillinder;
     public String Warna;
     
     
     public Honda(String Merk, String TipeKendaraan,String jenis,int sillinder, String Warna){
         super(Merk, TipeKendaraan, jenis);
         this.sillinder = sillinder;
         this.Warna= Warna;
     }
    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("JUMLAH Sillinder=" + sillinder);
        System.out.println("Warna kendaraan=" + Warna);
    }
}
