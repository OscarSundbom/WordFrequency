package com.wordfrequency;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordFrequencyServiceTest {

    private final WordFrequencyService wordFrequencyService;

    public WordFrequencyServiceTest() {
        wordFrequencyService = new WordFrequencyService();
    }


    @Test
    void countWordFrequency() {
        String testString = "Uh, känn igen, tror vi\n" +
                "Stannar kvar, längst fram, ni vet fan först\n" +
                "Håll det äkta, slumpmässiga bastards\n" +
                "Sjukt uppe fast dom buffar, stor i orden\n" +
                "Sen ungar, hela klungan bor i skogen\n" +
                "Jo det kunde spårat, for innan trubbel tråla'\n" +
                "Blästa ut'n nedför älven i nå gummibåtar\n" +
                "Tung du är, trorusjälv, hä vardagslangen\n" +
                "Döp nån gata på Haga till David Sandberg\n" +
                "Eller Marc UÅ, hela Mästern visste\n" +
                "Sätter tricken, lovar alla har sett vår sticker\n" +
                "Uppströms från Fabriken till Buddhagrottan, tung\n" +
                "Hookar ofta kompisdeal när hoodie plockas\n" +
                "Lapplabama, bakåtlutat och myggvana\n" +
                "Ids int smäll'an, ryggtavlan får stigmata\n" +
                "Teen har blod, öl, tung skate och en massa guld\n" +
                "Rapplar runt, klart tung hä pass en Skurk";
        Map<String, Long> response = wordFrequencyService.countWordFrequency(testString);
        assertEquals(response.get("tung"), Long.valueOf(4));
        assertEquals("tung", response.entrySet().stream().findFirst().get().getKey());
    }
}