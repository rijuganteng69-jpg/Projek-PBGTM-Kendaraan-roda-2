public class Motor {

    protected String Merk, TipeKendaraan, jenis;
    protected int JUMCC;

    public Motor(String Merk, String TipeKendaraan,String jenis){
      this.Merk=Merk; 
      this.TipeKendaraan=TipeKendaraan;
      this.jenis=jenis;
    
              
    }
    public void showinfo() {
        System.out.println("MEREK = " + Merk);
        System.out.println(" TYPE KENDARAAN= " + TipeKendaraan);
        System.out.println(" JENIS KENDARAAN= " + jenis);
      
    }
}
