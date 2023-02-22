package clasesPrincipal;

import claseshijas.SmartPhone;
import claseshijas.SmartWatch;


public class ObjetosMain {
    public static void main(String[] args) {

        SmartPhone FlipZ = new SmartPhone("negro","sansumg",
                "x456z","flipz",250.76,15.54,
                5.67,2.45,600.5,5000,
                "W3045","G45T","táctil","android",
                "frontal y trasera","bluet-23",
                "MicroSD","Huella y Rostro");

        System.out.println(FlipZ);

        SmartWatch Watch300 = new SmartWatch("gris","Samsung","W3027","Watch Xsung",100.13,5.0,4.1,1.5,300.5,3000,
                "si",
                "si","si","GoodNight",
                "WatchIMC","saludWatch");
        System.out.println(Watch300);
    };
};
