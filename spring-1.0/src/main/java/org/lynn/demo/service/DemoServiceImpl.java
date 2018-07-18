package org.lynn.demo.service;

import org.lynn.duplicate.annotation.Service;

/**
 * Class Name : org.lynn.service
 * Description :
 * @author : cailinfeng
 * Date : 2018/6/26 15:43
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public void sayHello(String name) {
        System.out.println("hello , " + name);
    }
}
