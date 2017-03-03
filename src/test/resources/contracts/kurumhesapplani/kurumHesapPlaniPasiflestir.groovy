package contracts.kurumhesapplani

org.springframework.cloud.contract.spec.Contract.make {
    label 'kurum_hesap_plani_pasiflestir'
    input {
        triggeredBy("triggerKurumHesapPlaniPasiflestir()")
    }
    outputMessage {
        sentTo 'KurumHesapPlaniTopic'
        body("""
            {
            "kurumHesapPlaniEkleChangeDTO":null,
            "kurumHesapPlaniGuncelleChangeDTO":null,
            "kurumHesapPlaniPasiflestirChangeDTO":
            {
            "kurumHesapPlaniId":1
            }
            }

        """)
    }
}