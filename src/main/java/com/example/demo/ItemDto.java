package com.example.demo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(value = FirstItem.class),
        @JsonSubTypes.Type(value = SecondItem.class)
})
public sealed interface ItemDto permits FirstItem, SecondItem {}
