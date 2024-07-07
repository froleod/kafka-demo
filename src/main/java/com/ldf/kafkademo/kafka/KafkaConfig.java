package com.ldf.kafkademo.kafka;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {
//    @Bean
//    public KafkaTemplate<String, String> kafkaTemplate() {
//        KafkaTemplate<String, String> kafkaTemplate = new KafkaTemplate<>(consumerFactory());
//        kafkaTemplate.setConsumerFactory(consumerFactory());
//        return kafkaTemplate;
//    }
//
//    @Bean
//    public ConsumerFactory<String, String> consumerFactory() {
//        Map<String, Object> config = new HashMap<>();
//        config.put("bootstrap.servers", "localhost:9092");
//        config.put("group.id", "myConsumer");
//        config.put("key.deserializer", StringDeserializer.class);
//        config.put("value.deserializer", StringDeserializer.class);
//        return new DefaultKafkaConsumerFactory<>(config);
//    }
}

