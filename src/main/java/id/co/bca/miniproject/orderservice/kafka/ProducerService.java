package id.co.bca.miniproject.orderservice.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public final class ProducerService {
    private static final Logger logger = LoggerFactory.getLogger(ProducerService.class);

    @Autowired
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private NewTopic newTopic;

    @Autowired
    private NewTopic productTopic;

    public ProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(newTopic.name(), message);
    }

    public void sendStock(String message) {
        kafkaTemplate.send(productTopic.name(), message);
    }

}
