package minggu5;

public class MainLatihan20 {
    public static void main(String[] args) {
        int uts[] = {78, 85, 90, 76, 92, 88, 80, 82};
        int uas[] = {82, 88, 87, 79, 95, 85, 83, 84};

        Latihan20 data = new Latihan20(uts, uas);
        System.out.println("Nilai UTS:");
        for(int i=0; i<uts.length; i++){
            System.out.print(uts[i]+", ");
        }
        System.out.println();
        System.out.println("Nilai UAS:");
        for(int i=0; i<uas.length; i++){
            System.out.print(uas[i]+", ");
        }
        System.out.println();
        System.out.println("Nilai UTS tertinggi: "+data.cariMax(uts, 0, uts.length-1));
        System.out.println("Nilai UTS terendah: "+data.cariMin(uts, 0, uts.length-1));
        System.out.println("Rata-rata nilai UAS: "+data.hitungRataUAS());
    }
}
