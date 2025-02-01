# WordFrequency

## Beskrivning

Detta är en applikation som via ett REST API räknar frekvensen av ord i en text och returnerar de 10 mest förekommande
orden.

## Installation

- Klona detta repot
- Använd Java 11 eller senare
- Öppna applikationen med din IDE och starta WordFrequencyApplication

## Användning

API:et exponerar en endpoint:
POST http://localhost:3000/count

### Exempel på användning

Kör via terminal:

```bash
curl -H "Content-type: text/plain" -X "POST" -d "Banan Äpple Katt Hund Banan Hund Katt Hund" http://localhost:3000/count
```

Exempel på svar
json
{"Hund":3,"Banan":2,"Katt":2,"Äpple":1}
