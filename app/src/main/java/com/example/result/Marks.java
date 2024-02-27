package com.example.result;

public class Marks {
    private int mark;

    public static final Marks[][] marks={
            {
                    new Marks(95),
                    new Marks(90),
                    new Marks(93),
                    new Marks(85),
                    new Marks(98),
            },
            {
                    new Marks(90),
                    new Marks(90),
                    new Marks(90),
                    new Marks(80),
                    new Marks(90),
            },
            {
                    new Marks(95),
                    new Marks(95),
                    new Marks(93),
                    new Marks(85),
                    new Marks(95),
            },
            {
                    new Marks(94),
                    new Marks(94),
                    new Marks(94),
                    new Marks(94),
                    new Marks(83),
            }
    };
    private Marks(int mark){
        this.mark=mark;
    }

    public int getMark() {
        return mark;
    }
}
