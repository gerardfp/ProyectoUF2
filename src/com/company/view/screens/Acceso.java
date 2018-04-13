package com.company.view.screens;

import com.company.manager.ManagerONG;
import com.company.manager.ManagerUsuario;
import com.company.view.widget.Menu;

public class Acceso {
    Menu menu = new Menu(2);
    Registro registro = new Registro();
    Acceder acceder = new Acceder();
    int opcion;

    public void start(ManagerUsuario managerUsuario, ManagerONG managerONG){
    menu.show(1,"Que quieres hacer?","Acceder","Registrarse");
    opcion=menu.option();

        switch (opcion){
            case 1:
                acceder.start(managerUsuario, managerONG);
                break;

            case 2:
                registro.start(managerUsuario, managerONG);
                break;

            default:

                break;
        }


    }
}
