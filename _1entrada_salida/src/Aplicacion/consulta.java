package Aplicacion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class consulta extends JInternalFrame {
    private JPanel panel;
    private JTextField cajatexto;

    public consulta() {
        setBounds(50, 50, 500, 500);//posicion y tamaño
        setTitle("                                                  Consulta de Pacientes                                                   ");//tiulo de la ventan
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarEtiquetaDos();
        colocarEtiquetaTres();
        colocarCajaTextosUno();
        colocarCajaTextosDos();
        colocartablas();
        colocarboton();
    }

    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    //es el titulo de registro de pacientes********************
    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("                    Consulta de Pacientes.");
        etiqueta.setBounds(30, 10, 700, 30);
        etiqueta.setFont(new Font("cooper black", 0, 18));
        panel.add(etiqueta);
    }

    //es el nombre del documento
    private void colocarEtiquetaDos() {
        JLabel etiqueta = new JLabel("No. del Documento");
        etiqueta.setBounds(30, 60, 200, 30);
        panel.add(etiqueta);
    }

    //es el texfield
    private void  colocarCajaTextosDos() {
        cajatexto = new JTextField("");
        cajatexto.setBounds(300, 100, 100, 30);
        panel.add(cajatexto);
    }

    //es el apellido*****************************
    private void colocarEtiquetaTres() {
        JLabel etiqueta = new JLabel("No. del Apellido");
        etiqueta.setBounds(300, 60, 200, 30);
        panel.add(etiqueta);
    }
    //es el texfield
    private void  colocarCajaTextosUno() {
        cajatexto = new JTextField("");
        cajatexto.setBounds(30, 100, 100, 30);
        panel.add(cajatexto);
    }

//en esta parte vamos a colorcar el resultado de la tabla
private void colocartablas(){
    DefaultTableModel modelo = new DefaultTableModel();

    modelo.addColumn("Documento");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Fecha");
    modelo.addColumn("Sexo");

//aqui voy añadiendo las filas de la tablas
    String [] persona1 = {"acta","efren","gomez","02-06-1996","m"};

    modelo.addRow(persona1);

    JTable tabla = new JTable(modelo);
    tabla.setBounds(30,100,400,600);
    panel.add(tabla);
    //aqui agregamos el scroll en columnas--------horizontal y vertical solo cual el scrol sea necesario
    JScrollPane scroll = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);//el scrol agrega a la tabla
    scroll.setBounds(45,150,400,200);
    panel.add(scroll);

    }

    public void colocarboton(){
        JButton boton1 = new JButton("Consultar");//el boton va a tener este texto
        boton1.setBounds(150,400,130,30);//posicion del boton y el tamañ de la caja
        boton1.setEnabled(true);//si le ponemos false no se puede interactuar con el boton
        boton1.setMnemonic('a');//alt + a se clikea solo con estos comandos
        boton1.setFont(new Font("arial",Font.BOLD,20));//establecemos la fuente de la letra numero tamaño del boton
        panel.add(boton1);
    }

}
