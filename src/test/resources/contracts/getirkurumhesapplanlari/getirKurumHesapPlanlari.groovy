package contracts.kurumhesapplani

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method("GET")
        url("/api/kurumhesapplani/getirByKamuIdaresiId?kamuIdaresiId=1")
        body ([
        ])
        headers {
            header(
                    'Content-Type', 'application/json'
            )
        }
    }
    response {
        status 200
        body("""
            [{
                 "id":100,
                 "ad":"KurumHesapPlaniAdi1",
                 "kamuIdaresiId":1,
                 "aciklama":"KurumHesapPlaniAciklama1"
            },
            {
                 "id":200,
                 "ad":"KurumHesapPlaniAdi2",
                 "kamuIdaresiId":1,
                 "aciklama":"KurumHesapPlaniAciklama2"
            }
            ]
        """)
        headers {
            header (
                    'Content-Type', value(consumer('application/json'),producer(regex('application/json.*')))
            )
        }
    }
}