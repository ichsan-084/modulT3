import java.util.Scanner;

public class T2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int pilihan;
            do {
                System.out.println("Pilih bentuk geometri untuk menghitung luas ruang:");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Trapesium");
                System.out.println("6. Belah Ketupat");
                System.out.println("0. Keluar");
                System.out.print("Masukkan pilihan Anda: ");
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        hitungLuasPersegi();
                        break;
                    case 2:
                        hitungLuasPersegiPanjang();
                        break;
                    case 3:
                        hitungLuasSegitiga();
                        break;
                    case 4:
                        hitungLuasLingkaran();
                        break;
                    case 5:
                        hitungLuasTrapesium();
                        break;
                    case 6:
                        hitungLuasBelahKetupat();
                        break;
                    case 0:
                        System.out.println("Terima kasih, program selesai.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } while (pilihan != 0);
        }

        public static void hitungLuasPersegi() {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan panjang sisi persegi: ");
            double sisi = input.nextDouble();
            double luas = sisi * sisi;
            System.out.println("Luas persegi adalah: " + luas);
        }

        public static void hitungLuasPersegiPanjang() {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan panjang persegi panjang: ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan lebar persegi panjang: ");
            double lebar = input.nextDouble();
            double luas = panjang * lebar;
            System.out.println("Luas persegi panjang adalah: " + luas);
        }

        public static void hitungLuasSegitiga() {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan panjang alas segitiga: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = input.nextDouble();
            double luas = 0.5 * alas * tinggi;
            System.out.println("Luas segitiga adalah: " + luas);
        }

        public static void hitungLuasLingkaran() {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = input.nextDouble();
            double luas = Math.PI * jariJari * jariJari;
            System.out.println("Luas lingkaran adalah: " + luas);
        }

        public static void hitungLuasTrapesium() {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan panjang sisi sejajar pertama: ");
            double sisi1 = input.nextDouble();
            System.out.print("Masukkan panjang sisi sejajar kedua: ");
            double sisi2 = input.nextDouble();
            System.out.print("Masukkan tinggi trapesium: ");
            double tinggi = input.nextDouble();
            double luas = 0.5 * (sisi1 + sisi2) * tinggi;
            System.out.println("Luas trapesium adalah: " + luas);
        }

        public static void hitungLuasBelahKetupat() {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan panjang diagonal pertama: ");
            double diagonal1 = input.nextDouble();
            System.out.print("Masukkan panjang diagonal kedua: ");
            double diagonal2 = input.nextDouble();
            double luas = 0.5 * diagonal1 * diagonal2;
            System.out.println("Luas belah ketupat adalah: " + luas);
        }
    }
