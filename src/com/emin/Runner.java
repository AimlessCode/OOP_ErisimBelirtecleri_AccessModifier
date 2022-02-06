package com.emin;

import com.emin.entity.SatisRepository;
import com.emin.entity.UrunRepository;

public class Runner {
    public static void main(String[] args) {
        /**
         * Erişim Belirteçleri,
         * Tanım: Herhangi Bri bileşenin(Class, Method, Değişken) erişiminin
         * kontrol edilmesi amacıyla kullanılır. Güvenli kodlamada önemlidir.
         * daha bir çok alanda kullanılır.
         * Türleri:
         * - Private: En kapalı türüdür, sadece sınıf içine açıktır.
         * - Protected: Bunundugu düzey- paket içine açıktır.
         * - Public: Tüm Erişimleri açıktır . en geniş kapsamlı kullanımıdır.
         * - *Default, bazı dökümantasyonlarda görebilirsiniz . erişim belirteci
         * kullanılmadığı zaman ifade edilir . Özelikle default diye bir erişimi belirteci yoktur.
         *
         */


        UrunRepository repository = new UrunRepository();
        repository.UrunEkleme("Leptop" ,2500);
        SatisRepository satisRepository =new SatisRepository();
        satisRepository.satisYap("emin","a00456",5);

    }


}
