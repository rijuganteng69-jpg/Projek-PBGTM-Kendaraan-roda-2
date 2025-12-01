public class main {

    public static void printMotor(Motor m) {
        m.showinfo(); 
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {

        Motor Honda = new Honda("Honda","CBR250RR","Manual",2,"Merah burgundi");
        Motor Yamaha = new Yamaha("Yamaha","R6","Manual",17,189);
        Motor Kawasaki = new Kawasaki("Kawasaki", "H2R","Manual", 2,6);

       
        ArrayList<Motor> daftar = new ArrayList<>();
        daftar.add(Honda);
        daftar.add(Yamaha);
        daftar.add(Kawasaki);

       
        for (Motor m : daftar) {
            printMotor(m);

         

        }
    }
}
