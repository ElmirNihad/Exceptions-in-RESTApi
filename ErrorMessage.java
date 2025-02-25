package org.example.exceptionsrestapi.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    private MessageType type;

    private String ofstatic;

    public String PrepareErrorMessage() {
        StringBuilder builder = new StringBuilder();
        builder.append(type.getMessage());
        if(ofstatic != null) {
            builder.append(" : " + ofstatic);
        }
        return builder.toString();
    }
}
