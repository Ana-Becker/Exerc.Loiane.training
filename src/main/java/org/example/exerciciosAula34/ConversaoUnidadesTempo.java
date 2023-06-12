package org.example.exerciciosAula34;

public class ConversaoUnidadesTempo {
    static int num;

    public static int convergirMinEmSeg (int min) {
        return min*60;
    }

    public static int convergirHoraEmMin(int hora) {
        return hora*60;
    }

    public static int convergirDiaEmHoras (int dia) {
        return dia*24;
    }

    public static int convergirSemanasEmDias (int semanas) {
        return semanas*7;
    }

    public static void mostrarInfos(){
        System.out.println(num + " min = " + convergirMinEmSeg(num) + " seg");
        System.out.println(num + " hrs = " + convergirHoraEmMin(num) + " min");
        System.out.println(num + " dias = " + convergirDiaEmHoras(num) + " horas");
        System.out.println(num + " semanas = " + convergirSemanasEmDias(num) + " dias");
    }
}
