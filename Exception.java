package org.example.exceptionsrestapi.Handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Exception<E> {
    private String Hostname;

    private String Path;

    private Date createTime;

    private E message;
}
