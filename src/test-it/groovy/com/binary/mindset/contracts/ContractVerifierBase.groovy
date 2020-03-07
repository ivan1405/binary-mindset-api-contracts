package com.binary.mindset.contracts

import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = Application.class)
@AutoConfigureMessageVerifier
@AutoConfigureMockMvc
class ContractVerifierBase extends Specification {

    @Autowired
    private MockMvc mockMvc;

    def setup() {
        RestAssuredMockMvc.mockMvc(mockMvc)
    }
}
