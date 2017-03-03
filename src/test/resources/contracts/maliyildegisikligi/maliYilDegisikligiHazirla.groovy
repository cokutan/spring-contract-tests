package contracts

org.springframework.cloud.contract.spec.Contract.make {
    label 'mali_yil_degisikligi_hazirla'
    input {
        triggeredBy("triggerMaliYilDegisikligiHazirla()")
    }
    outputMessage {
        sentTo 'MaliYilDegisikligiTopic'
        body("""
            {
              "kurumHesapPlaniId": 1,
              "maliYil": 2017,
              "islemTuru": "AC"
            }
        """)
    }
    
}

