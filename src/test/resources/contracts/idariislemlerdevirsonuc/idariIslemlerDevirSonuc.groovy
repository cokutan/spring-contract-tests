package contracts

org.springframework.cloud.contract.spec.Contract.make {
    label 'idari_islemler_devir_sonuc'
    input {
        triggeredBy("triggerIdariIslemlerDevirSonuc()")
    }
    outputMessage {
        sentTo 'IdariIslemlerDevirSonucTopic'
        body("""
            {
              "iliskiliKayitId": 1,
              "idariIslemlerDevirDurumu":"TAMAMLANDI"
            }
        """)
    }
}
