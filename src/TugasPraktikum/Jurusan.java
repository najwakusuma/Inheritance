/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author user
 */
public class Jurusan extends Sekolah{
    int jurusan = 0;
    int guru = 0;
    
    void cetakJurusan(int jmljurusan){
        jurusan = jmljurusan;
        System.out.println("Jumlah Jurusan : " + jurusan);
    }
    void cetakGuru(int jmlGuru){
        guru = jmlGuru;
        System.out.println("Jumlah Guru : " + guru);
    }
}
