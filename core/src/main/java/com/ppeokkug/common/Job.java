package com.ppeokkug.common;

import java.io.Serializable;

public interface Job {
    JobFeedback run(String parameter);
}
