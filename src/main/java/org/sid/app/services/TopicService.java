package org.sid.app.services;

import java.util.Optional;

import org.sid.app.dao.TopicRepository;
import org.sid.app.entities.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private final TopicRepository topicRepository;

	public TopicService(TopicRepository topicRepository) {
		super();
		this.topicRepository = topicRepository;
	}

	public void add(Topic topic) {
		topicRepository.save(topic);
	}

	public void delete(Topic topic) {
		topicRepository.delete(topic);
	}

	public Topic findById(Long topicId) {
		Optional<Topic> topic = topicRepository.findById(topicId);
		if (topic.isPresent()) {
			return topic.get();
		}
		return null;
	}
}
