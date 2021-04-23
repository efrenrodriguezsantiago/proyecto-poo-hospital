package seccion13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _82clic extends JFrame {
    //lo colocamos como atributo
    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton;
    private int contador = 0;




    public _82clic() {
        setBounds(50, 50, 500, 500);//posicion y tamaño
        setTitle("Eventos");//tiulo de la ventan
        iniciarComponentes();//aqui inicializaremos el panel
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



//aqui son todos los componentes del panel
    private void iniciarComponentes() {
        colocarPanel();//es el componente del panel
        colocaretiqueta();
        colocarboton();
    }



    //aqui agregamos el panel
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocaretiqueta(){
        etiqueta = new JLabel();
        etiqueta.setBounds(0,100,400,40);//cuanto v a medir la etiqueta
        etiqueta.setText("pulsa el botón");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//centramos nuestro texto
        etiqueta.setFont(new Font("arial",0,20));//tipo de letra
        panel.add(etiqueta);//aqui añadimos lo que es la etiqueta
    }

    private void colocarboton(){
        boton = new JButton("clic aqui");
        boton.setBounds(165, 300, 150, 40);//tamaño del boton
        boton.setFont(new Font("arial", 10, 15));//aqui si se marco la letra asi como se encuentra-////////////****///////
        boton.setFont(new Font("cooper black",0,20));
        panel.add(boton);

        //sobre este boton vamos a colocar el evento para que pueda funcionar la accion
        eventoDeAccion();
    }
    //accion
    private void eventoDeAccion(){

        ActionListener eventoAccion = new ActionListener() {//**************

            @Override
            public void actionPerformed(ActionEvent ae) {
                contador++;
                if (contador == 1){
                    etiqueta.setText("haz presionado el boton 1 vez");
                }
                else {
                    etiqueta.setText("has presionado el boton contadoor "+contador+" veces");
                }
            }
        };
        boton.addActionListener(eventoAccion);//************

    }
}
