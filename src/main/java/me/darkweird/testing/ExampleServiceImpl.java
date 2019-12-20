package me.darkweird.testing;

import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {
    public int returnsFour() {
        return 4;
    }
}
