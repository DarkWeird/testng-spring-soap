package me.darkweird.testing.impl;

import me.darkweird.testing.service.ExampleService;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

    public int returnsFour() {
        return 4;
    }
}
