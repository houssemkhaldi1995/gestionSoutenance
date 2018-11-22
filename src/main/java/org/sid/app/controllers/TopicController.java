package org.sid.app.controllers;

import org.sid.app.entities.Topic;
import org.sid.app.services.TopicService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	private final TopicService topicService;

	public TopicController(TopicService topicService) {
		super();
		this.topicService = topicService;
	}

	@PostMapping("/addtopic/{topic}")
	public void add(@PathVariable Topic topic) {
		topicService.add(topic);
	}

	@DeleteMapping("/deletetopic/{topic}")
	public void delete(@PathVariable Topic topic) {
		topicService.delete(topic);
	}

	@GetMapping("/gettopic/{topicId}")
	public Topic findById(@PathVariable Long topicId) {
		return topicService.findById(topicId);
	}

}
