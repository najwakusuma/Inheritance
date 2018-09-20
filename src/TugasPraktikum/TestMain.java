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
public class TestMain {
    public static void main(String[] args){
        Jurusan myjurusan = new Jurusan();
        System.out.println("--------------------------------------------------");
        myjurusan.cetakSekolah("SMK TELKOM MALANG");
        myjurusan.cetakJurusan(2);
        myjurusan.cetakGuru(60);
        System.out.println("--------------------------------------------------");
        
    }
}
