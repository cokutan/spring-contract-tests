package contracts.kurumhesapplani

    org.springframework.cloud.contract.spec.Contract.make {
        label 'kurum_hesap_plani_ekle'
        input {
            triggeredBy("triggerKurumHesapPlaniEkle()")
        }
        outputMessage {
            sentTo 'KurumHesapPlaniTopic'
            body("""
            {
              "kurumHesapPlaniEkleChangeDTO":
    {
        "kurumHesapPlaniId": 1,
        "ad": "Ekle Ad",
        "kamuIdaresiId": 1,
        "butceTuru": "GENEL"
    },
    "kurumHesapPlaniGuncelleChangeDTO": null,
    "kurumHesapPlaniPasiflestirChangeDTO": null
                }
              ]
            }
        """)
        }
    }