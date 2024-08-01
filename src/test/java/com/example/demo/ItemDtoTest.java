package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemDtoTest {

    ObjectMapper mapper = new ObjectMapper();

    @Test
    void firstItemTest() throws JsonProcessingException {
        String fistThing = "{\"fieldA\": \"Thing A\"}";
        ItemDto itemDto = mapper.readValue(fistThing, ItemDto.class);
        assertInstanceOf(FirstItem.class, itemDto);
    }

    @Test
    void secondItemTest() throws JsonProcessingException {
        String fistThing = "{\"fieldB\": \"Thing B\"}";
        ItemDto itemDto = mapper.readValue(fistThing, ItemDto.class);
        assertInstanceOf(SecondItem.class, itemDto);

        var output = switch (itemDto){
            case FirstItem(var ignored) -> "Not this";
            case SecondItem(var fieldB) -> fieldB;
        };

        assertEquals(output, "Thing B");
    }
}