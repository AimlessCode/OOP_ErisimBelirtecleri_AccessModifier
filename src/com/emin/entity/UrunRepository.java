package com.emin.entity;

import java.util.ArrayList;
import java.util.List;

public class UrunRepository {

    private List<Urun> urunListesi = new ArrayList<>();

    public void UrunEkleme(String ad, double fiyat) {

        Urun urun = new Urun();
        urun.save(ad,fiyat);
        urun.yazdir();


    }

    protected Urun findById(String id){

        Urun urun= new Urun();
        urun.save("pc 1500",36500);
        return urun;

    }

}
