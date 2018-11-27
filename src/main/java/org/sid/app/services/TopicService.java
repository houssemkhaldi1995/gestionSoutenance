package org.sid.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.sid.app.dao.TopicRepository;
import org.sid.app.dto.TopicDto;
import org.sid.app.entities.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private final TopicRepository topicRepository;

	public TopicService(TopicRepository topicRepository) {
		super();
		this.topicRepository = topicRepository;
	}

	public TopicDto add(Topic topic) {
		return mapToDto(topicRepository.save(topic));
	}

	public void deleteById(Long topicId) {
		topicRepository.deleteById(topicId);
	}

	public TopicDto findById(Long topicId) {
		return topicRepository.findById(topicId).map(TopicService::mapToDto).orElse(null);
	}

	public List<TopicDto> findAll() {
		return topicRepository.findAll().stream().map(TopicService::mapToDto).collect(Collectors.toList());
	}

	public static TopicDto mapToDto(Topic topic) {
		if (topic != null) {
			return new TopicDto(topic.getTopicId(), topic.getTitle(), topic.getDomain(), topic.getDuration(),
					CompanyService.mapToDto(topic.getCompany()));
		}
		return null;
	}
}
