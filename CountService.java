package pl.kj.firstapp;

import org.springframework.stereotype.Component;

@Component
public class CountService {

    public int count(String word){
        return word.length();
    }
}
