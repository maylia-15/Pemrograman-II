public class App {
    private InputHandler input = new InputHandler();
    private StudentRepository repo = new StudentRepository();
    private AddStudent addStudent = new AddStudent(new PaymentCalculator());

    public void start() {
        while (true) {
            showMenu();
            int choice = input.nextInt();
            handle(choice);
        }
    }

    private void showMenu() {
        System.out.println("=== Perhitungan UKT ===");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan UKT");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }

    private void handle(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Masukan Nama Mahasiswa: ");
                String name = input.nextLine();

                System.out.print("Masukan NIM Mahasiswa: ");
                int id = input.nextInt();

                System.out.print("Masukan Jumlah SKS: ");
                int totalSKS = input.nextInt();

                Student s = addStudent.create(name, id, totalSKS);
                repo.add(s);
                System.out.println("Data berhasil ditambahkan!\n");
                break;

            case 2:
                if (repo.isEmpty()){
                    System.out.println("Belum ada data mahasiswa\n");
                } else {
                    System.out.println("---- Daftar Mahasiswa ----");
                    for (Student student : repo.getAll()) {
                        student.showInfo();
                        System.out.println("--------------------------");
                    }
                }
                break;

            case 0:
                System.out.println("Terima kasih!");
                System.exit(0);
                break;

            default:
                System.out.println("Pilihan Tidak Valid");
        }
    }
}
