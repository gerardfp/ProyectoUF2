package com.company.model;

import com.company.view.widget.EditText;

public class Usuario {
    public int id;
    public String nombre;
    public String apellido;
    public String usuario;
    public String contraseña;
    public String telefono;
    public String DNI;
    public String correo;
    public int dinero;
    public String[] donaciones = new String[10];
    public String[] suscripciones = new String[10];
    public Suscripcion[] suscripcions = new Suscripcion[10];
    public long cuenta;
    public boolean admin = false;
    ///CREAR LA CLASE SUSCRIPCIONES Y HACER UNA TABLA CON LOS DATOS AL MOSTRAR "MisSuscripciones"

}
