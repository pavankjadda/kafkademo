package com.chargecodes.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ConsumerChannel
{

	String CHANNEL = "subscribableChannel";

	@Input(ConsumerChannel.CHANNEL)
	SubscribableChannel subscribableChannel();
}