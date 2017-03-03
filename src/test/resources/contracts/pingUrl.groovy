package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method("GET")
        url("/api/ping")
    }
    response {
        status 200
        body("""
            {
            }
        """)
    }
}