package org.rhapsodyman.springcucumber;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;

//@Ignore
@ContextConfiguration(classes = Config.class)
public class JsonPlaceholderStepDefinitions {

	private String sampleUrl = "http://jsonplaceholder.typicode.com/todos/1";

	@Autowired
	RestTemplate restTemplate;

	@Given("^I make a get request$")
	public void the_bag_is_empty() {

		ResponseEntity<Todo> response = restTemplate.getForEntity(sampleUrl, Todo.class);
		Assert.assertNotNull("Assert that response is not null", response);

		System.out.println("Status [" + response.getStatusCode() + "]");
		System.out.println("Todo title is [" + response.getBody().getTitle() + "]");
	}
}
