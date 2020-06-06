package com.springcloud.commonapi.config;

import org.springframework.beans.factory.annotation.Autowired;

public interface TokenHelper {
    public TokenModel create(Integer id);

    public boolean check(TokenModel model);

    public TokenModel get(String authStr);

    public boolean delete(Integer id);

}
