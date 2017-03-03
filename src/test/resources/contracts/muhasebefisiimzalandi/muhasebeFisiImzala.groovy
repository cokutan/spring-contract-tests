package contracts

org.springframework.cloud.contract.spec.Contract.make {
    label 'muhasebe_fisi_imzalandi'
    input {
        triggeredBy("triggerMuhasebeFisiImzalandi()")
    }
    outputMessage {
        sentTo 'MuhasebeFisiImzalandiTopic'
        body("""
            {
              "islemTipi": "İşlem Tipi",
              "iliskiliKayitTuru":"ALACAK_DOSYASI",
              "iliskiliKayitId":1
            }
        """)
    }
}
