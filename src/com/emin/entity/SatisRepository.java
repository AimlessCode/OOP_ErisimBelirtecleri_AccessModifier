package com.emin.entity;

public class SatisRepository {
    /**
     * bir müşteriye ürün satışı yapmak için müşteri bilgileri alınır.
     * ürünü özel id numarası alınır ve satışı yapılan adet alınır.
     * UrunRepostory den id sini verdigi ürünün kendisini isteyecek.
     *
     * @param musteri
     * @param urunId
     * @param adet
     */

    public void satisYap(String musteri,String urunId,int adet){
        UrunRepository repository =new UrunRepository();
        /**
         * Repository ye ürün id sini vererek ürün nesnesini talep ettim.
         */

        Urun.urun =repository.findById(urunId);
        System.out.println("Satış yapıldı : "+ musteri);
        Urun.urun.yazdir();
    }

}
