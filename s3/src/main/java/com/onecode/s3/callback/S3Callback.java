package com.onecode.s3.callback;

import java.io.Serializable;

/*
* actionCallback is intended to be an intent's action, intent which will be then sent in a
* broadcast message.
*
* extra could be anything (could be null too)
* */
public class S3Callback implements Serializable {

    private String actionCallback;
    private Serializable extra;

    public S3Callback(String actionCallback, Serializable extra) {
        this.actionCallback = actionCallback;
        this.extra = extra;
    }

    public String getActionCallback() {
        return actionCallback;
    }

    public Serializable getExtra() {
        return extra;
    }
}