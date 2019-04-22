package com.example.film;

import java.util.ArrayList;

public class FilmData {
    public static String[][] data = new String[][]{
            {"Aku juga Punya Warna", "Slice of Life", "https://4.bp.blogspot.com/-gynp6dDtkY8/T6CgrbwJAsI/AAAAAAAAAU4/jpCph1eYggo/s1600/poster+film.jpg", "Seorang anak yang dilahirkan memiliki keterbelakangan mental yang mengisi hari-harinya dirumah dengan bermain saja. Robi ingin memiliki teman untuk bermain bersamanya. Dia sangat kesepian tidak ada yang mau berteman dengannya karena keterbelakangan mentalnya. Ibu Robi yang sangat sibuk dengan pekerjaannya juga mengabaikan Robi. Robi ingin mendapatkan kasih sayang oleh orang - orang terdekatnya dengan mengambarkan isi hatinya lewat buku gambar dan crayon miliknya.\n" +
                    "\n" +
                    "Produksi : Kinne Komunikasi UPN Veteran Jatim\n" +
                    "Director : Gita Qirani\n" +
                    " Tahun Rilis : 2011\n"},
            {"Beda Warna", "Slice of Life, Romantis", "https://1.bp.blogspot.com/-qLaAWM9LVzE/T6CifhkriAI/AAAAAAAAAVA/pzKhQYKLm6Y/s1600/POSTER+KEL.2.JPG", "Ada dua orang sahabat yang memiliki kegemaran yang sama yaitu minum kopi. Evan dan Andi menyukai minum kopi, hanya saja mereka berdua memiliki selera rasa kopi yang berbeda satu sama lain. Andi lebih menyukai kopi hitam, sedangkan Evan lebih suka kopi susu. Saat Andi mengajak Evan untuk pergi mengopi bersama Evan membuat Andi marah. Kopi hitam yang dibelikan Andi untuk Evan sama sekali tidak disentuh oleh Evan. Dari itulah Andi salah paham dengan perlakuan Evan. Di waktu yang berbeda Evan mengajak Andi untuk pergi mengopi bersama dan disitulah Evan menjelaskan kenapa dia tidak meminum kopi hitam pemberian Andi waktu itu.\n" +
                    "\n" +
                    "Produksi : Kinne Komunikasi UPN Veteran Jatim\n" +
                    "Director : Evan Raharyaers\n" +
                    "Tahun Rilis : 2011\n" +
                    "\n"},
            {"Terlalu Tampan", "Komedi, Romantis", "https://www.sinopsisfilmterbaru.com/wp-content/uploads/2019/01/terlalu-768x960.jpg", "Selama belasan tahun, Mas Kulin yang terlahir terlalu tampan enggan untuk masuk sekolah regular dan memilih untuk menghabiskan 100 persen hidupnya di rumah. Namun, hal tersebut justru membuat keluarganya, yakni Pak Archewe (Marcelino Lefrandt), Bu Suk (Iis Dahlia), dan Mas Okis (Tarra Budiman) khawatir. Mereka pun sepakat menyusun sebuah skenario yang akhirnya berhasil membuat Mas Kulin setuju untuk menghabiskan tahun terakhir masa SMA-nya di sekolah khusus pria, SMA Horridson. Ketampanan Mas Kulin yang akhirnya terekspos ke dunia luar mengakibatkan hari-harinya berjalan tidak biasa.\n" +
                    "\n" +
                    "Produser : Nurita Anandia W.\n" +
                    "Sutradara : Sabrina Rochelle Kalangie\n" +
                    "Tahun Rilis : 2019\n" +
                    "\n"},
            {"Poconggg juga Pocong", "Komedi, Romantis", "https://filmbor.com/wp-content/uploads/2015/06/Poster-Poconggg-Juga-Pocong.jpg", "Poconggg tidak seperti pocong-pocong kebanyakan. Poconggg dianggap sebagai pocong penakut, tidak mampu menakuti manusia, dan takut dengan sesama hantu. Anjaw, pocong senior, dan empat anggota geng pocong sering mengintimidasi Poconggg. Kunti, kuntilanak paling cantik dan gaul, satu-satunya hantu yang membantu Poconggg beradaptasi dan akhirnya menjadi sahabatnya.Sheila, perempuan yang paling Poconggg sayang. Dunia yang berbeda membuat segalanya tidak mudah. Untungnya, Poconggg tidak sendirian, ada Kunti yang senantiasa membantunya. Poconggg galau melihat Adit, senior Sheila di kampus yang melakukan pendekatan ke Sheila.\n" +
                    "\n" +
                    "\n" +
                    "Produser : Ody Mulya Hidayat\n" +
                    "Sutradara : Chiska Doppert\n" +
                    " Tahun Rilis : 2011\n"},
            {"Pengabdi Setan", "Horor, Misteri", "https://sinopsisfilmbioskopterbaru.com/wp-content/uploads/2017/08/poster-pengabdi-setan.jpg", "Pengabdi Setan (2017) mengisahkan tentang sebuah keluarga di mana sang ibu sakit aneh selama 3 tahun hingga akhirnya meninggal dunia. Sang bapak pun mendapatkan tugas bekerja di luar kota. Dia pergi meninggalkan anak-anak di rumah. Namun, keanehan pun terjadi. Arwah sang ibu mulai terasa berada di rumah. Kondis makin menyeramkan saat mereka akhirnya menyadari sang ibu datang bukan untuk menjenguk mereka, tapi untuk membawa mereka pergi ke dunianya.\n" +
                    "\n" +
                    "Produser : Sunil Samtani, Gope T. Samtani, Priya N.K. \n" +
                    "Sutradara : Joko Anwar\n" +
                    "Tahun Rilis : 2017\n"},
            {"Keluarga Cemara", "Slice of Life", "https://id.bookmyshow.com/blog-hiburan/wp-content/uploads/2018/12/Keluarga-Cemara.jpg", "Sebuah keluarga inti yang tinggal di Jakarta harus menghadapi kenyataan bahwa harta benda mereka ludes akibat ditipu salah satu anggota keluarga besar mereka. Pindah ke desa di Kabupaten Bogor, Abah dan keluarga harus beradaptasi dengan segala ketidaknyamanan yang tak pernah dialami sebelumnya. Permasalahan datang silih berganti, tetapi keluarga ini tetap bertahan dalam keadaan gegar budaya.\n" +
                    "\n" +
                    "Produser : Yandy Laurens\n" +
                    "Produser : Anggia Kharisma, Ginatri S. Noer\n" +
                    "Tahun Rilis : 2018\n"}
    };

    public static ArrayList<Film> getListData(){
        Film film = null;
        ArrayList<Film> list = new ArrayList<>();
        for (String[] aData : data) {
            film = new Film();
            film.setName(aData[0]);
            film.setRemarks(aData[1]);
            film.setPhoto(aData[2]);
            film.setDeskrip(aData[3]);

            list.add(film);
        }

        return list;
    }
}
