package contracts.surecmuhasebesihata

/**
 * Created by yagiz.salor on 17.02.2017.
 */
org.springframework.cloud.contract.spec.Contract.make {
    label 'surec_muhasebesi_hata_produce_et'
    input {
        triggeredBy("triggerSurecMuhasebesiHataProduceEt()")
    }
    outputMessage {
        sentTo 'SurecMuhasebesiHataTopic'
        body("""
            {
              "surecMuhasebeKaydiListDTO": {
                "surecMuhasebeKaydiDTOList": [
                  {
                    "muhasebeIslemTipi": "Muhasebe İşlem Tipi",
                    "donemSonuAdimAdi": "OTOMATIK_BUTCE_EMANETI_TEMINAT_GELIR_KAYDET",
                    "muhasebeKaydiTarihi": null,
                    "iliskiliKayitTuru": "BUTCE",
                    "iliskiliKayitNo": 1,
                    "kurumHesapPlaniId": 1,
                    "muhasebeKaydiDetaySet": [
                      {
                        "borcTutari": {
                          "amount": 0,
                          "formattedAmount": "0,00 TL"
                        },
                        "alacakTutari": {
                          "amount": 10000,
                          "formattedAmount": "100,00 TL"
                        },
                        "kurumHesapKodu": null,
                        "tertip": "Tertip",
                        "kurumKoduId": 1
                      }
                    ],
                    "muhasebeBirimiVKN": 1,
                    "harcamaBirimiVKN": 1
                  }
                ]
              },
              "muhasebeKaydiTarihi": null,
              "iliskiliKayitTuru": "ALACAK_DOSYASI",
              "iliskiliKayitNo": 1,
              "hataMesajlari": "Hata mesajlari"
            }
        """)
    }
}
