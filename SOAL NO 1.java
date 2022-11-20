public class Main {
    public static void main(String[] args) {
        int [] nilai = {13,23,12,1,98,10,45,19,89,-4,33,67,53,86,9};

        System.out.println( "\n__________________");
        System.out.println( "| NOVITA RAHMAYANTI |");
        System.out.println( "------------------\n");

        for ( int i =0; i< nilai.length; i++){
            if (i % 2 == 0) {
                System.out.println("Angka " + nilai[i] + " Adalah Genap");

            }
            else {
                System.out.println("Angka " + nilai[i] + " Adalah Ganjil");
            }
        }


    }
}