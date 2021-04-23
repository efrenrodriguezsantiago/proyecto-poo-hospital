package seccion13;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;

public class _2imagen extends JFrame {
    //lo colocamos como atributo
    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton;
    private JPEGImageReadParam imagen;




    public _2imagen() {
        setBounds(50, 50, 500, 500);//posicion y tamaño de la pantalla panel
        setTitle("                                                             Imagen                                               ");//tiulo de la ventan
        iniciarComponentes();//aqui inicializaremos el panel
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    //aqui son todos los componentes del panel
    private void iniciarComponentes() {
        colocarPanel();//es el componente del panel
        colocarImagen();
    }


    //aqui agregamos el panel
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }


    //imagenes
    private void colocarImagen(){
        //etiqueta tipo imagen
        JLabel etiqueta2 = new JLabel(new ImageIcon("contar.jpg"));
        etiqueta2.setBounds(10,30,100,100);
        panel.add(etiqueta2);
    }
}
