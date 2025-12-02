# jobsheet12
Praktikum daspro jobsheet 12 (Fungsi 1) - Nabila Ardianti Lunetta - 18 - SIB 1E

PERCOBAAN 1
1. Tidak, fungsi tanpa parameter hanya berarti tidak menerima input, tetapi boleh mengembalikan nilai (return) atau boleh tidak mengembalikan nilai
2. Bisa, dengan memindahkan isi fungsi Menu() langsung ke main
3. Menggunakan fungsi Menu() membuat program lebih rapi, mudah digunakan jika diperlukan berulang-ulang, mudah diperbaiki, dan lebih terstruktur
4. Saat program dijalankan, komputer akan memulai eksekusi fungsi main() yang di dalamnya terdapat perintah untuk memanggil fungsi Menu(). Ketika perintah ini dijalankan, alur program akan menjalankan fungsi Menu(), lalu seluruh perintah System.out.println() yang ada di dalamnya dieksekusi satu per satu sehingga daftar menu ditampilkan di layar

PERCOBAAN 2
1. parameter digunakan agar fungsi bisa menerima nilai dari luar sehingga dapat memproses data yang berbeda-beda tanpa harus menulis ulang fungsi baru
2. Parameter namaPelanggan digunakan supaya program dapat menampilkan salam yang sesuai dengan nama orang yang sedang dilayani. Sementara itu, parameter isMember dipakai untuk menentukan apakah pelanggan adalah member atau bukan
3. Sama tapi beda kegunaan, Parameter adalah variabel khusus yang dipakai untuk menerima data dari luar fungsi
4. Jika isMember == true, program menampilkan pesan : "Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!". Jika isMember == false, bagian itu tidak ditampilkan, jadi pelanggan dianggap bukan member.
isMember digunakan untuk mengontrol apakah pesan diskon muncul atau tidak
5. Program akan eror
6. 
7. 
8. Ya. dengan parameter, fungsi bisa menampilkan menu untuk siapa saja, bukan hanya satu nama tertentu, dan bisa menyesuaikan apakah pelanggan adalah member atau bukan tanpa harus mengubah isi kode di dalam fungsi

PERCOBAAN 3
1. Suatu fungsi membutuhkan nilai kembalian (return value) ketika fungsi tersebut harus menghasilkan suatu data untuk digunakan kembali oleh bagian program lainnya. Contohmya pada fungsi hitungTotalHarga, karena fungsi tersebut menghasilkan output hargaTotal berupa int yang akan digunakan kembali/dikeluarkan pada fungsi(main).
2. sebuah fungsi tidak perlu mengembalikan nilai ketika tugasnya hanya melakukan aksi. Contohnya pada fungsi Menu() karena isinya hanya menampilkan teks saja

PERCOBAAN 4
1. karena String... adalah Varargs (variable arguments), yaitu parameter yang bisa menerima banyak nilai sekaligus, tanpa harus ditulis sebagai array
2.
3. Dalam 1 fungsi hanya boleh menggunakan 1 tipe data varargs, tetapi boleh menggunakan lebih dari 1 tipe data untuk variabel lain yang bukan berbentuk varargs. contoh : 
static void daftarPengunjung(int angka, String menu, String...namaPengunjung) -> varargs diletakkan di paling belakang
4. Program tetap berjalan, output yang dihasilkan hanya "Daftar Nama Pengunjung :" karena dipanggil tanpa argumen, jadi varargs tidak ada isinya

PERCOBAAN 5
1. Saat program berjalan, eksekusi dimulai dari main(), lalu program meminta input panjang, lebar, dan tinggi, yang masing-masing disimpan ke variabel p, l, dan t. Setelah itu, program memanggil hitungLuas(p, l) untuk menghitung luas persegi panjang dan menampilkan hasilnya. Selanjutnya, program memanggil hitungVolume(t, p, l), yang di dalamnya kembali memanggil hitungLuas(a, b) untuk mendapatkan luas alas sebelum dikalikan dengan tinggi. Hasil volume kemudian dikirim kembali ke main() dan ditampilkan. Setelah semuanya selesai, program menutup Scanner dan berhenti
2. Output :
"Luas persegi panjang adalah 12
Volume balok adalah 60"
Saat program dijalankan, pengguna memasukkan panjang, lebar, dan tinggi. Nilai 4 dan 3 dikirim ke hitungLuas(p, l) dan menghasilkan luas 12, lalu ditampilkan. Setelah itu, hitungVolume(t, p, l) dijalankan, fungsi ini kembali memanggil hitungLuas(p, l) untuk mendapatkan luas alas 12, kemudian mengalikannya dengan tinggi 5 sehingga volume menjadi 60. Nilai tersebut dikembalikan ke main() dan ditampilkan, sehingga output akhirnya adalah luas 12 dan volume 60
3. Ketika program dijalankan, pertama-tama main memanggil fungsi Jumlah(1, 1) yang menghasilkan nilai 2 dan menyimpannya ke variabel temp. Nilai ini kemudian dikirim ke fungsi TampilJumlah(temp, 5). Di dalam fungsi tersebut, program kembali memanggil Jumlah(bil1, bil2) yaitu Jumlah(2, 5) yang menghasilkan nilai 7. Nilai 7 inilah yang dikirim ke fungsi TampilHinggaKei(7), sehingga program mencetak angka 1 hingga 7 secara berurutan ke layar
4. Fungsi perlu parameter ketika fungsi tersebut membutuhkan data dari luar untuk menjalankan perintah di dalam fungsi tersebut.
Fungsi perlu parameter ketika fungsi tersebut membutuhkan data dari luar untuk melakukan tugasnya.
5. Pada Percobaan 5, hitungLuas(p, l) dan hitungVolume(t, p, l) memakai parameter karena perhitungan luas dan volume membutuhkan panjang, lebar, dan tinggi yang diberikan dari main().boleh tanpa parameter jika semua data yang dibutuhkan sudah tersedia di dalam fungsi itu sendiri atau tidak membutuhkan masukan dari luar. Misalnya, fungsi yang hanya menampilkan teks.
6. Di Percobaan 5, hitungLuas() mengembalikan luas yang dipakai oleh main() dan juga dipakai lagi oleh hitungVolume(). Begitu juga hitungVolume() mengembalikan volume agar bisa ditampilkan. tidak perlu return jika tujuannya hanya melakukan aksi tanpa menghasilkan nilai yang perlu digunakan kembali. Contohnya fungsi main() tidak memiliki return value karena hanya menjalankan alur program, membaca input, memanggil fungsi lain, dan menampilkan hasil.