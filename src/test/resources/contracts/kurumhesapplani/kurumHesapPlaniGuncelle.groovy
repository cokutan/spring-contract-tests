package contracts.kurumhesapplani

org.springframework.cloud.contract.spec.Contract.make {
    label 'kurum_hesap_plani_guncelle'
    input {
        triggeredBy("triggerKurumHesapPlaniGuncelle()")
    }
    outputMessage {
        sentTo 'KurumHesapPlaniTopic'
        body("""
            {"kurumHesapPlaniEkleChangeDTO":null,
            "kurumHesapPlaniGuncelleChangeDTO":{"kurumHesapPlaniId":1,
            "ad":"Ad_Guncelle"
            },
            "kurumHesapPlaniPasiflestirChangeDTO":null}

        """)
    }
}