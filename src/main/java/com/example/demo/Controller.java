package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    public void receiveItem(@RequestBody @Valid ItemDto dto) {

        switch (dto){
            case FirstItem(var firstItem) -> System.out.println(firstItem);
            case SecondItem(var secondItem) -> System.out.println(secondItem);
        }
    }
}
