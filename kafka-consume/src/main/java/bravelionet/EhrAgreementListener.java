package bravelionet;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EhrAgreementListener {
    private static final Logger logger = LoggerFactory.getLogger(EhrAgreementListener.class);

/*    @KafkaListener(topics = {"annul"}, groupId = "myContainer2")
    public void annul1(ConsumerRecord<String, String> record) {
        System.out.println("groupId = myContainer2, message = " + record.toString());
    }*/

    @KafkaListener(topics = {"signed"}, groupId = "myContainer2")
    public void signed2(ConsumerRecord<String, String> record) {
        String value = record.value();
        System.out.println("value = " + value);
        System.out.println(" groupId = myContainer2, message = " + record.toString());
    }

}