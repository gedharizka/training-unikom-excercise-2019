# Soal praktek

1. Buatlah project dengan springboot untuk membuat aplikasi dengan tema e-commerce (Toko online)
2. Ketentuan minimal system yang harus di handle
    - Master data toko
    - Master data produk
    - Transaksi Penjualan (Flow transaksi bebas)
    - Master pelanggan

# Soal teori

1. Apa fungsi Hibernate ORM dan jelaskan mengapa?
    Jawab
    Fungsi Hibernate ORM adalah memetakan objek-objek kedalam kedalam database, objek yang dibuat dalam program dengan database sehingga dalam implementasinya tidak perlu lagi menggunakan query SQL dalam memanipulasi data di database karena objek yang dibuat dimapping sehingga ORM yang akan mengeksekusi ke dalam database.
2. Jelaskan menurut pendapat anda dari beberapa fungsi annotation di hibernate seperti berikut:
    - ```@Entity```
        Berfungsi mendeklarasikan bahwa class ini merupakan sebuah entity yang akan di mapping oleh hibernate.
    - ```@Table```
        Berfungsi untuk mendeklarasikan nama tabel.
    - ```@Column```
        Berfungsi untuk mendeklarasikan definisi sebuah kolom
    - ```@OneToOne```
        Relasi antara satu variabel dalam kelas pertama dihubungkan dengan variabel dalam kelas ke dua.
    - ```@ManyToOne```
        Relasi antara beberapa variabel(lebih dari satu) dalam kelas pertama dihubungkan dengan satu variabel dalam kelas kedua
    - ```@OneToMany```
        Relasi antara satu variabel kelas pertama berhubungan dengan beberapa variabel(lebih dari satu) dari kelas ke dua
    - ```@JoinColumn```
        Berfungsi untuk menggabungkan kolom
    - ```@JoinTable```
        Berfungsi untuk menghubungkan tabel
    - ```@GeneratedValue```
        Berfungsi untuk membuat isi(value) pada kolom
3. Jelaskan menurut pendapat anda mengenai Dependency injection di springframework?
Jawab
Depedency injection membuat ketergantungan antar class tidaklah tinggi, sehingga dapat mengubah class tanpa perlu rasa khawatir class tersebut merusak kelas lainnya. dalam springframework Depedency injection dikonfigurasikan dengan XML.

4. Jelaskan menurut pendapat anda mengenai container / context di spring framework?
Jawab
Container bertanggung jawab untuk membuat instance, mengkonfigurasi dan merakit objek/bean. Container mendapatkan instruksi tentang objek apa yang akan dipakai, dikonfigurasikan, dan berkumpul dengan membaca metadata konfigurasi. Metadata konfigurasi direpresentasikan dalam XML, anotasi Java, atau kode Java
5. Jelaskan menurut pendapat anda fungsi dari beberapa fitur annotation di spring frameork seperti berikut:
    - ```@ComponentScan```
        berfungsi untuk memberitahu Spring paket untuk memindai komponen yang beranotari(annotation)
    - ```@Autowired```
        annotasi ini berfungsi memungkinkan Spring untuk menyelesaikan dan menyuntikan objek kolaborasi(bean collaboration) ke dalam objek(bean)
    - ```@Bean```
        Untuk membuat objek/kelas di spring menjadi bean
    - ```@Component```
        Digunakan untuk menunjukan kelas sebagai komponen, kerangka kerja spring akan mendeteksi secara otomatis kelas-kelas untuk injeksi depedensi ketika konfigurasi berbasis anotasi dan pemindahan classpath yang digunakan
    - ```@Repository```
        kelas beranotasi pada layer persistensi yang akan bertindak sebagai repositori basis data
    - ```@Service```
        kelas beranotasi pada layer service
    - ```@Controller```
        berfungsi sebagai spesialisasi kelas @Component dan memungkindan kelas implementasi untuk secara otomatis terdeteksi melalui pemindaian classpath
    - ```@RestController```
        berfungsi untuk penanganan kelas controller secara tomatis membuat serialisasi objek yang di kembalikan ke HttpReponse
    - ```@RequestMapping```
        berfungsi untuk mengkonfigurasi pemetaan permintaan web
    - ```@GetMapping```
        berfungsi untuk menangani jenis metode permintaan GET
    - ```@PostMapping```
        berfungsi untuk menangani jenis metode permintaan POST
    - ```@PutMapping```
        berfungsi untuk menangani jenis metode permintaan PUT
    - ```@DeleteMapping```
        berfungsi untuk menangani jenis metode permintaan Delet

## Cara mengerjakan

- Fork repository ini, kemudian setelah di fork, clone ke local komputer anda.
- Setelah selesai silahkan di push ke repository masing-masing.
- Selamat mengerjakan :) & good luck
