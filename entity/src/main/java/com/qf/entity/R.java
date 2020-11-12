package com.qf.entity;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class R<T> {

    private Integer code = STATUS.SUCCESS;

    private String msg;

    private T data;

    public static interface STATUS {
        int SUCCESS = 200;
        int FAILED = 500;
    }

}
