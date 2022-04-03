package com.company;

public class Main {

    public static void main(String[] args) {

        Shelter romashka = new Shelter("Romashka",
                "Pervomayskaya 19");
        Dog rex = new Dog("Rex", "Ovcharka",
                new String[]{"Сидеть", "Лежать"}, ColorEnum.BROWN, romashka);
        System.out.println(rex.getInfo());
        rex.makeVoice();
        rex.makeVoice("Гув гув");

        System.out.println("____________________________");

        Shelter solnyshko = new Shelter("Solnyshko",
                "Sverdlovskya 345");
        Dog sharik = new Dog("Sharik", "Dolmat", ColorEnum.BLACK, solnyshko);
        System.out.println(sharik.getInfo());
        sharik.makeVoice();
        sharik.makeVoice("RRRRRR");

    }
}
