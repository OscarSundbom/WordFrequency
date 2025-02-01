package com.wordfrequency;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WordFrequencyController {
    private final WordFrequencyService wordFrequencyService;


    public WordFrequencyController(WordFrequencyService wordFrequencyService) {
        this.wordFrequencyService = wordFrequencyService;
    }

    @Cacheable(value = "wordFrequencuies", key = "#text.hashCode()")
    @PostMapping("/count")
    public Map<String, Long> countWords(@RequestBody String text) {
        return wordFrequencyService.countWordFrequency(text);
    }

}
