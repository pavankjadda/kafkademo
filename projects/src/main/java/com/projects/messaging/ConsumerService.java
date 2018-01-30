package com.projects.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import com.projects.domain.Project;

@Service
public class ConsumerService
{

	private final Logger log = LoggerFactory.getLogger(ConsumerService.class);

	@StreamListener(ConsumerChannel.CHANNEL)
	public void consume(Project project)
	{
		log.info("Received Project Info: {}.", project.toString());
	}
}
