package Aplicacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    //javax.swing.JFrame implements ActionListener
    public class sistemahospital extends JFrame implements ActionListener{
        private JMenuBar mb;
        private JMenu menu1,menu2;
        private JMenuItem mi1,mi2,mi3,mi5,mi6;

        //esta accion es la que hace imprimir en principal
        registro pantallaregistro;
        consulta pantallaconsulta;

        public sistemahospital(){
            getComponents();//***************************

            pantallaregistro = new registro();//*********
            pantallaconsulta = new consulta();

            add(pantallaregistro);//*********************
            add(pantallaconsulta);//*********************

            //TAMAÑO DE LA CAJA
            setBounds(50, 50, 600, 650);//posicion y tamaño
            setTitle("                                                                          Sistema Hospital                                                                               ");//tiulo de la ventana
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            //***************MENU BAR***************dONDE SALIR
            setLayout(null);
            mb=new JMenuBar();

            setJMenuBar(mb);
            menu1=new JMenu("Archivos");
            mb.add(menu1);

            mi1=new JMenuItem("Salir");
            mi1.addActionListener(this);
            menu1.add(mi1);
            //***********************************ES LA PARTE DONDE REGISTA Y CONSULTA**********************************
            menu2=new JMenu("Pacientes");//------------------
            mb.add(menu2);//tamaño de la ventana

            setJMenuBar(mb);
            mi5=new JMenuItem("Registrar");
            mi5.addActionListener(this);
            menu2.add(mi5);

            //espero conectemos
            mi6=new JMenuItem("consultar");
            mi6.addActionListener(this);
            menu2.add(mi6);
        }

//aqui se instancia la pantalla de registro para imprimir en principal

    @Override
    public void actionPerformed(ActionEvent e) {
    pantallaconsulta.setVisible(true);

    pantallaregistro.setVisible(true);

        }

        /*
    @SuppressWarnings("unchecked")

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {

    pantallaconsulta.setVisible(false);
    pantallaregistro.setVisible(true);

    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
    pantallaregistro.setVisible(false);
    pantallaconsulta.setVisible(true);
    }

    */

    }
