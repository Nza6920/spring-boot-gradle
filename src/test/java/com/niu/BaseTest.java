package com.niu;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * <功能简述>
 *
 * @version 1.0 [2022/03/22 14:48]
 * @author [nza]
 * @createTime [2022/03/22 14:48]
 */
@SpringBootTest
public class BaseTest {

    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
}
