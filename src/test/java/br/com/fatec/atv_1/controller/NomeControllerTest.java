package br.com.fatec.atv_1.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class NomeControllerTest {
    private final NomeController NomeController = new NomeController();

    @Test
    void getMyName(){
        String name = NomeController.returnName();
        assertEquals ("Barbara Santos", name);
    }
}