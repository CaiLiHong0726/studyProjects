package com.hong.foundation.polymorphic;

import java.util.ArrayList;
import java.util.List;

public class Music {
    public static void main(String[] args) {
        List<Instrument> instrumentList = new ArrayList<>();
        instrumentList.add(new Wind());
        instrumentList.add(new Percussion());
        for (Instrument instrument: instrumentList){
            System.out.println(instrument.getClass().getName());
            instrument.play();
        }

    }
}
