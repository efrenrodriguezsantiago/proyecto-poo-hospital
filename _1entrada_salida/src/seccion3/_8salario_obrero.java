package seccion3;

import javax.swing.*;

public class _8salario_obrero {
    public static void main(String []args){
        //un obrero necesita calcular su salario semanal
        //si trabaja 40 horas o menos se le paga 16 dolares la hora
        //si trabaja mas de 40 horasse le pagara 16 dolares la hora y por cada hora extra se le pagara 20 dolares

    float hora_trabajada,hora_extra,resultado,salario1,salario2,salario3,total;
    hora_trabajada = Integer.parseInt(JOptionPane.showInputDialog("digite las horas trabajadas"));

    if(hora_trabajada<=40){
    salario1 = hora_trabajada * 16;
        JOptionPane.showMessageDialog(null,"el salario semanal es: "+salario1);
    }else {
        salario2 = (40 * 16) + ((hora_trabajada-40)*20);
        JOptionPane.showMessageDialog(null,"el salario semanal mas horas extras es: "+salario2);
        }
    }
}
