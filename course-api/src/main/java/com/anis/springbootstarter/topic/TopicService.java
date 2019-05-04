package com.anis.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	public void addService(Topic topic) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicRepository.deleteById(id);
	}
}
