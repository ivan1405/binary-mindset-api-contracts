# API Contracts

In this project I show how to implement contracts and generate Rest-Assured tests and Wiremock Stubs using the
[Spring Cloud Contract Verifier](https://cloud.spring.io/spring-cloud-contract/2.0.x/multi/multi__spring_cloud_contract_verifier_introduction.html) maven plugin.

### How to

The Spring Cloud Contract Verifier plugin will be triggered on the integration test phase, so to run it execute the following command
```
mvn clean verify
```

Afterwards, you will obtain in the target folder both Rest-Assured tests and Wiremock Stubs.