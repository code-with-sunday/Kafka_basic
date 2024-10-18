package sunday.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "sunday",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Listening received: " + data + " 😃");
    }
}
