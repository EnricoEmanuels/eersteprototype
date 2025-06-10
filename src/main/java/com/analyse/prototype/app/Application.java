package com.analyse.prototype.app;

import com.analyse.prototype.entities.Persoon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    public static void main(String[] args) {
        Persoon persoon1 = new Persoon(1, "Enrico", 21);

        persoon1.bestelLaptop();
    }
}