package Aplicacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registro extends JInternalFrame{
    private JPanel panel;
    private JTextField cajatexto;

    public registro() {
        //ahora vamos a conectarnos a la base de datos
        //********************************************************************************************
        setBounds(50, 50, 500, 500);//posicion y tamaño
        setTitle("                                                  Registro de Pacientes                                                   ");//tiulo de la ventan
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarEtiquetaq();
        colocarCajaTexto();
        colocarCajaTextos();
        colocarCajaTextoa();
        colocarradiobotones();
        colocarFecha();
        colocarboton();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

//es el titulo de registro de pacientes
    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("                    Registro de Pacientes.");
        etiqueta.setBounds(30, 10, 700, 30);
        etiqueta.setFont(new Font("cooper black", 0, 18));
        panel.add(etiqueta);
    }

    //es el texfield
    private void colocarCajaTexto() {
        cajatexto = new JTextField("ingrese el No. de documento");
        cajatexto.setBounds(30, 50, 300, 30);
        panel.add(cajatexto);
    }

    //es el texfield
    private void colocarCajaTextos() {
        cajatexto = new JTextField("ingrese el nombres del Paciente");
        cajatexto.setBounds(30, 100, 300, 30);//el 30 no se mueve se va moviendo de 100 a 50 en 50 el segundo
        panel.add(cajatexto);
    }

    //es el texfield
    private void colocarCajaTextoa() {
        cajatexto = new JTextField("ingrese apellidos del paciente");
        cajatexto.setBounds(30, 150, 300, 30);
        panel.add(cajatexto);
    }

//es para lo de la fecha de nacimiento da la opcion del menu-------------------------------------
    private void colocarEtiquetaq() {
    JLabel etiqueta = new JLabel(" Ingresa la fecha de nacimietno.");
    etiqueta.setBounds(30, 200, 700, 30);
    panel.add(etiqueta);
}

//**********************************operacion de fecha**************************************
    private void colocarFecha() {
        cajatexto = new JTextField("");
        cajatexto.setBounds(230, 200, 70, 30);
        panel.add(cajatexto);

    }

    //los radiobotones
    private void colocarradiobotones() {
        JRadioButton radioboton1 = new JRadioButton("Hombre", false);//
        radioboton1.setBounds(50, 250, 100, 50);//200 tamaño de largo
        radioboton1.setEnabled(true);//si le pongo false no funciona el boton
        panel.add(radioboton1);

        JRadioButton radioboton2 = new JRadioButton("Mujer", false);//
        radioboton2.setBounds(150, 250, 100, 50);
        panel.add(radioboton2);
    }

    //aqui colocaremos el boton}}}}}}}}}}}}}}}}}}}}}}
    public void colocarboton(){
        JButton boton1 = new JButton("Registrar");//el boton va a tener este texto
        boton1.setBounds(150,350,130,30);//posicion del boton y el tamañ de la caja
        boton1.setEnabled(true);//si le ponemos false no se puede interactuar con el boton
        boton1.setMnemonic('a');//alt + a se clikea solo con estos comandos
        boton1.setFont(new Font("arial",Font.BOLD,20));//establecemos la fuente de la letra numero tamaño del boton
        panel.add(boton1);
    }

}
