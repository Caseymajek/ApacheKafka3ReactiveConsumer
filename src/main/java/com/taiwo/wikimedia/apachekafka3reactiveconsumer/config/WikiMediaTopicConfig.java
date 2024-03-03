package com.taiwo.wikimedia.apachekafka3reactiveconsumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class WikiMediaTopicConfig {
    @Bean
    public NewTopic wikimediaStreamTopic(){
        return TopicBuilder.name("wikimedia-stream")
                .build();
    }
}
