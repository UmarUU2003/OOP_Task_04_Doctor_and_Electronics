package main;

import inheritance_A.Lor;
import inheritance_A.Xirurg;

public class Main {
    public static void main(String[] args) {
        Xirurg xirurg = new Xirurg("Abduazimov Muhiddin", "Ko'z xirurgi", "Yuqori");
        xirurg.info();

        Lor lor = new Lor("Orifjonov Komiljon", "Yangi dori vositalari bo'yicha tadqiqotchi", "Yuqori");
        lor.info();
    }
}
