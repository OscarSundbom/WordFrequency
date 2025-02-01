package com.wordfrequency;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class WordFrequencyService {
    public Map<String, Long> countWordFrequency(String text) {
        return getArraylistOfWords(text)
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));
    }

    private static Map<String, Long> getArraylistOfWords(String text) {
        return Arrays.stream(text.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));
    }

}