package ch.fhnw.swa.spring.kafka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {
    @NonNull
    private String msg;
    @NonNull
    private String name;
}