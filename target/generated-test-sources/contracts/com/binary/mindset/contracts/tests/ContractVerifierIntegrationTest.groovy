package com.binary.mindset.contracts.tests

import com.binary.mindset.contracts.ContractVerifierBase
import com.jayway.jsonpath.DocumentContext
import com.jayway.jsonpath.JsonPath
import spock.lang.Specification
import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification
import io.restassured.response.ResponseOptions

import static org.springframework.cloud.contract.verifier.assertion.SpringCloudContractAssertions.assertThat
import static org.springframework.cloud.contract.verifier.util.ContractVerifierUtil.*
import static com.toomuchcoding.jsonassert.JsonAssertion.assertThatJson
import static io.restassured.module.mockmvc.RestAssuredMockMvc.*

@SuppressWarnings("rawtypes")
class ContractVerifierIntegrationTest extends ContractVerifierBase {

	def validate_get_projects_should_return_200_code_and_list_of_projects() throws Exception {
		given:
			MockMvcRequestSpecification request = given()


		when:
			ResponseOptions response = given().spec(request)
					.get("/tasklist-management/api/projects")

		then:
			response.statusCode() == 200
			response.header("Content-Type") ==~ java.util.regex.Pattern.compile('application/json.*')

		and:
			DocumentContext parsedJson = JsonPath.parse(response.body.asString())
			assertThatJson(parsedJson).array().contains("['projectId']").isEqualTo(1)
			assertThatJson(parsedJson).array().contains("['title']").isEqualTo("My awesome project 1")
			assertThatJson(parsedJson).array().contains("['description']").isEqualTo("This is the first project created with the best api")
	}

}
