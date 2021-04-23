package seccion13;
import javax.swing.*;//es un aquete de interfaz
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class _1ventana extends JFrame {//es una ventana con la extension Jframe que sirve para panel
    public JPanel panel;
    public _1ventana(){//constructor
        //establecer tamaño de la ventana
        this.setSize(1000,700);//ancho y altura--establecemos el tamaño
        setDefaultCloseOperation(EXIT_ON_CLOSE);// si cerramos la ventana lo vamos a cerrar en terminal tambien
        setLocationRelativeTo(null);//es para centrar la ventana de nuestro panel
        //setResizable(false);//bloqueamos para que la ventana no se pueda redimensionar
        setMinimumSize(new Dimension(200,200));//es lo minomo que puedan achicar mi vnetana tamaño minimo
        //this.getContentPane().setBackground(Color.BLUE);//color de la ventana

        iniciarComponentes();//desde aqui mandamos a llamar esta funcion---------------------------------------------
        setTitle("FINANZAS plus plus");//establecemos titulo como el html icono

    }
//creamos botones panel etiquetas etc
    private void iniciarComponentes(){
        colocarpaneles();
        //colocaretiqueta();//--desactivamos un momento se quita la letra contador
        colocarimagen();
        //colocarbotones();
        //colocarradiobotones();
        //colocarbotonactivacion();
        //cajatexto();
        //colocarareatexto();
        //colocarcasillas();
        //colocarlistadesplegable();
        //colocarlistadesplegable1();
        //colocarcontraseña();
        //colocartablas();
        //colocarlista();

    }
    private void colocarpaneles(){
        panel = new JPanel();
        //panel.setBackground(Color.cyan);//agregamos el color de panel-----lo usaremos mas adelante
        panel.setLayout(null);//desactivamos el diseño para que podamos posicionar la etiqueta
        this.getContentPane().add(panel);//agregamos el panel de la ventana
    }
    private void colocaretiqueta(){
        //estiqueta 1 tipo texto
        JLabel etiqueta = new JLabel("CONTADOR",SwingConstants.CENTER);//creamos la etiqueta de texto y lo centra el cuadro de texto
        etiqueta.setBounds(85,10,800,80);//ancho y altura --ancho altura posicon de hola
        etiqueta.setForeground(Color.red);//color de la letra
        // etiqueta.setOpaque(true);//le damos permisopara pintar el fondo de etiqueta
        //etiqueta.setBackground(Color.blue);//cambiamos el color de fondo de caja de texto
        etiqueta.setFont(new Font("arial",2,20));//nombre tipo de letra---estilo de letra---tamaño de letra ---establecer fuente osea tipo de letra
        panel.add(etiqueta);//lo creamos y lo imprimimos en ventana de anel

    }
    //imagenes
    private void colocarimagen(){

        //etiqueta tipo imagen
        ImageIcon imagen = new ImageIcon("contar.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(80,4,100,100);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }

    private void colocarbotones(){
    JButton boton1 = new JButton("click");//el boton va a tener este texto
    boton1.setBounds(100,100,100,40);//posicion del boton y el tamañ de la caja
        boton1.setEnabled(true);//si le ponemos false no se puede interactuar con el boton
        boton1.setMnemonic('a');//alt + a se clikea solo con estos comandos
        boton1.setForeground(Color.red);//color de texto del boton
        boton1.setFont(new Font("arial",Font.BOLD,20));//establecemos la fuente de la letra numero tamaño del boton
    panel.add(boton1);

        JButton boton2 = new JButton();//el boton va a tener este texto
        boton2.setBounds(100,200,100,40);//posicion del boton y el tamañ de la caja
        //boton1.setOpaque(true);//en caso de que no se pueda cambiar el color de fondo
        ImageIcon calcu = new ImageIcon("calcu.pgn");
        boton2.setIcon(new ImageIcon(calcu.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH))); //ancho tamaño de alto y escalado
        //boton2.setBackground(Color.blue);//color de fondo del boton
        panel.add(boton2);

        //boton 3
        JButton boton3 = new JButton();
        boton3.setBounds(100,300,110,50);//posicion y tamaño de boton
        //boton3.setBorder(BorderFactory.createLineBorder(Color.cyan,3));//el color de border del boton y ancho de 3 pixeles
        boton3.setBorder(BorderFactory.createLineBorder(Color.green,4,true));//esquina redondeada en true
        panel.add(boton3);//imprime

    }
    //radio botones
    private void colocarradiobotones(){
        JRadioButton radioboton1 = new JRadioButton("opcion 1",false);//
        radioboton1.setBounds(50,100,200,50);//200 tamaño de largo
        radioboton1.setEnabled(true);//si le pongo false no funciona el boton
        radioboton1.setFont(new Font("cooper black",0,20));//tipo de letra y el tamaño de la letra
        panel.add(radioboton1);

        JRadioButton radioboton2 = new JRadioButton("opcion 2",false);//
        radioboton2.setBounds(50,150,100,50);
        panel.add(radioboton2);

        JRadioButton radioboton3 = new JRadioButton("opcion 3",false);//
        radioboton3.setBounds(50,200,100,50);
        panel.add(radioboton3);

        JRadioButton radioboton4 = new JRadioButton("opcion 4",false);//botones para opciones de marcarr examen
        radioboton4.setBounds(50,250,100,50);
        panel.add(radioboton4);

        ButtonGroup agruparboton = new ButtonGroup();//es para que se marque un botn no todas
        agruparboton.add(radioboton1);
        agruparboton.add(radioboton2);
        agruparboton.add(radioboton3);
        agruparboton.add(radioboton4);

    }
    //boton de ativacion
    private void colocarbotonactivacion(){
        JToggleButton botonactivar1 = new JToggleButton("opcion 1 ",false);//es para encender activar
        botonactivar1.setBounds(50,100,100,40);
        panel.add(botonactivar1);

        JToggleButton botonactivar2 = new JToggleButton("opcion 2 ",false);//es para
        botonactivar2.setBounds(50,150,100,40);
        panel.add(botonactivar2);

        JToggleButton botonactivar3 = new JToggleButton("opcion 3 ",false);//es para
        botonactivar3.setBounds(50,200,100,40);
        panel.add(botonactivar3);

        //es la misma accion anerior de que se activa los botones uno solo y los demas no
        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(botonactivar1);
        grupoBotones.add(botonactivar2);
        grupoBotones.add(botonactivar3);
    }
//son las cajas de textos
    private void cajatexto(){
        JTextField cajatexto1 = new JTextField();//crear caja de texto d una sola linea llenar nombre apellido email etc
        cajatexto1.setBounds(50,50,150,30);//tamaño de texto 150 de largo ancho de 30
        cajatexto1.setText("Escribe tu nombre...");//lo que el text contiene para escribir
        panel.add(cajatexto1);

    }
//colocar areas de texto
    private void colocarareatexto(){
        JTextArea areatexto1 = new JTextArea();//creamos area de texto cambiar color
        areatexto1.setBounds(20,20,200,200);//altura 200 posicionamos
        areatexto1.setText("escriba el texto...");
        areatexto1.setForeground(Color.cyan);//color de la letra
        areatexto1.setBackground(Color.red);//fondo de texto
        //areatexto1.append("\nescribe texto por aqui");
        areatexto1.setEditable(true);//podemos editarlo si ponemos false ya no se puede editar lo escrito
        panel.add(areatexto1);//lo imprme

//colocar el scroll barras de dezplazamiento
        JScrollPane barradezplazar1 = new JScrollPane(areatexto1,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barradezplazar1.setBounds(20,20,200,200);//misma altura que cajas de texto

    panel.add(barradezplazar1);//imprime el scroll dezplazamiento
    }
//casillas de opcion
    private void colocarcasillas(){
        JCheckBox colocarcasillas1 = new JCheckBox("matematicas");//es para
        colocarcasillas1.setBounds(20,20,100,40);//es una opcion una palomita como opcion de seleccion
        panel.add(colocarcasillas1);

        JCheckBox colocarcasillas2 = new JCheckBox("programacion");//es para
        colocarcasillas2.setBounds(20,50,100,40);//es una opcion una palomita como opcion de seleccion
        panel.add(colocarcasillas2);

        JCheckBox colocarcasillas3 = new JCheckBox("base de datos");//es para
        colocarcasillas3.setBounds(20,80,100,40);//es una opcion una palomita como opcion de seleccion
        panel.add(colocarcasillas3);

        JCheckBox colocarcasillas4 = new JCheckBox("git");//es para
        colocarcasillas4.setBounds(20,110,100,40);//es una opcion una palomita como opcion de seleccion
        panel.add(colocarcasillas4);
    }

    //listas dexplegables*************************************************************************************+
    private void colocarlistadesplegable(){//es como de seleccion pero en desplegable
        String [] paises = {"Mexico","E.U.A","Europa","Inglaterra"};
        JComboBox colocarlista1 = new JComboBox(paises);//es para opcion de seleccion
        colocarlista1.setBounds(20,20,100,30);

        colocarlista1.addItem("Argentina");
        colocarlista1.setSelectedItem("Europa");//se muestra rimero en la ñlista
        panel.add(colocarlista1);
    }
    _1persona persona1 = new _1persona("efren",27,"mexicano");//viene de la clase _1persona se instancia
    _1persona persona2 = new _1persona("jose",23,"chileno");//viene de la clase _1persona se instancia
    _1persona persona3 = new _1persona("llus",20,"panama");//viene de la clase _1persona se instancia
    _1persona persona4 = new _1persona("mario",34,"peruano");//viene de la clase _1persona se instancia

    //es para lista desplegable como de opcion**************************************************++
    private void colocarlistadesplegable1(){//es como de seleccion pero en desplegable
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox listadesplegable1 = new JComboBox(modelo);//es para opcion de seleccion

        modelo.addElement(persona1);//agregamos un elemento
        modelo.addElement(persona2);//agregamos un elemento
        modelo.addElement(persona3);//agregamos un elemento
        modelo.addElement(persona4);//agregamos un elemento


        listadesplegable1.setBounds(20,20,200,30);//posicion y tamaño
        panel.add(listadesplegable1);
    }
    //lista de contraseñas
    private void colocarcontraseña(){
    JPasswordField contraseña1 = new JPasswordField();
    contraseña1.setBounds(20,20,150,30);//posicion y tamaño de la caja de contraseña
    contraseña1.setText("hola");//imprime la contraseña que es lo que tenemos

        panel.add(contraseña1);

//muestra la contraseña que creo el usuario
        String contraseñas = "";
        for (int i=0;i<contraseña1.getPassword().length;i++){
            contraseñas += contraseña1.getPassword()[i];
        }
        System.out.println("contraseña1: "+contraseñas);//obtenemos la contraseña
    }
//colocar tablas
    private void colocartablas(){
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");

//aqui voy añadiendo las filas de la tablas
        String [] persona1 = {"efren","27","mexicano"};
        String [] persona2 = {"noemi","27","mexicana"};
        String [] persona3 = {"mimicilla","10","mexicana"};


        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);



        JTable tabla = new JTable(modelo);
        tabla.setBounds(20,20,300,300);
        panel.add(tabla);

        //aqui agregamos el scroll en columnas--------horizontal y vertical solo cual el scrol sea necesario
        JScrollPane scroll = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);//el scrol agrega a la tabla
        scroll.setBounds(20,20,300,300);
        panel.add(scroll);
    }

    private void colocarlista(){
        DefaultListModel modelo = new DefaultListModel();

        modelo.addElement(new _1persona("efren gomez sanchez",26,"mexicano"));
        modelo.addElement(new _1persona("ana serrano acuña",22,"mexicana"));
        modelo.addElement(new _1persona("juan ruiz aguilar",23,"mexicano"));
        modelo.addElement(new _1persona("marco colado baraja",21,"mexicano"));
        modelo.addElement(new _1persona("paola contreras bolaños",21,"mexicana"));
        modelo.addElement(new _1persona("diana hernandez bustos",26,"mexicana"));
        modelo.addElement(new _1persona("oliva alvarado carmona",26,"mexicana"));
        modelo.addElement(new _1persona("alejandro cornejo lucas",26,"mexicano"));
        modelo.addElement(new _1persona("osvaldo cepeda suceda",28,"mexicano"));
        modelo.addElement(new _1persona("america amezcua esquivel",24,"mexicana"));
        modelo.addElement(new _1persona("efren gomez sanchez",26,"mexicano"));
        modelo.addElement(new _1persona("ana serrano acuña",22,"mexicana"));
        modelo.addElement(new _1persona("juan ruiz aguilar",23,"mexicano"));
        modelo.addElement(new _1persona("marco colado baraja",21,"mexicano"));
        modelo.addElement(new _1persona("paola contreras bolaños",21,"mexicana"));
        modelo.addElement(new _1persona("diana hernandez bustos",26,"mexicana"));
        modelo.addElement(new _1persona("oliva alvarado carmona",26,"mexicana"));
        modelo.addElement(new _1persona("alejandro cornejo lucas",26,"mexicano"));
        modelo.addElement(new _1persona("osvaldo cepeda suceda",28,"mexicano"));
        modelo.addElement(new _1persona("america amezcua esquivel",24,"mexicana"));
        modelo.addElement(new _1persona("efren gomez sanchez",26,"mexicano"));
        modelo.addElement(new _1persona("ana serrano acuña",22,"mexicana"));
        modelo.addElement(new _1persona("juan ruiz aguilar",23,"mexicano"));
        modelo.addElement(new _1persona("marco colado baraja",21,"mexicano"));
        modelo.addElement(new _1persona("paola contreras bolaños",21,"mexicana"));
        modelo.addElement(new _1persona("diana hernandez bustos",26,"mexicana"));
        modelo.addElement(new _1persona("oliva alvarado carmona",26,"mexicana"));
        modelo.addElement(new _1persona("alejandro cornejo lucas",26,"mexicano"));
        modelo.addElement(new _1persona("osvaldo cepeda suceda",28,"mexicano"));
        modelo.addElement(new _1persona("america amezcua esquivel",24,"mexicana"));
        modelo.addElement(new _1persona("efren gomez sanchez",26,"mexicano"));
        modelo.addElement(new _1persona("ana serrano acuña",22,"mexicana"));
        modelo.addElement(new _1persona("juan ruiz aguilar",23,"mexicano"));
        modelo.addElement(new _1persona("marco colado baraja",21,"mexicano"));
        modelo.addElement(new _1persona("paola contreras bolaños",21,"mexicana"));
        modelo.addElement(new _1persona("diana hernandez bustos",26,"mexicana"));
        modelo.addElement(new _1persona("oliva alvarado carmona",26,"mexicana"));
        modelo.addElement(new _1persona("alejandro cornejo lucas",26,"mexicano"));
        modelo.addElement(new _1persona("osvaldo cepeda suceda",28,"mexicano"));
        modelo.addElement(new _1persona("america amezcua esquivel",24,"mexicana"));

        JList lista1 = new JList(modelo);
        lista1.setBounds(20,20,200,300);//posicion y tamaño
        panel.add(lista1);//imprime

        //aqui implementmos el scroll
        JScrollPane scrols = new JScrollPane(lista1,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);//el scrol agrega a la tabla
        scrols.setBounds(20,20,200,300);//misma posicion que lista1
        panel.add(scrols);
    }
}
