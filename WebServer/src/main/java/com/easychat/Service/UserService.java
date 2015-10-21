package com.easychat.Service;

import com.easychat.model.User;

import java.util.Map;

/**
 * Created by yonah on 15-10-18.
 */
public interface UserService {
    User addUser(Map data);
    boolean hasUser(Long id);
    User getUser(Long id);
}
