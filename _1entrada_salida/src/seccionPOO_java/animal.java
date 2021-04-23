package seccionPOO_java;

import java.awt.*;

public class animal {//superclase animal
    public animal(){//que tiene un constructor no lleva stributos
        System.out.println("animal ");
    }
    //va el tipo de animal  si es felino o acuatico
    //va a leon
    public animal(String tipo){
        System.out.println("tipo: "+tipo);
    }
}
