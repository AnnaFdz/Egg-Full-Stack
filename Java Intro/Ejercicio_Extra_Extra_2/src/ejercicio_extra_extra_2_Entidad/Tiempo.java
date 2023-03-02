/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_extra_2_Entidad;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Anny
 */
public class Tiempo {
 private int horas;
    private int minutos;
    private int segs;

    public Tiempo() {
    }

    public Tiempo(int horas, int minutos, int segs) {
        this.horas = horas;
        this.minutos = minutos;
        this.segs = segs;
    }

    @Override
    public String toString() {
        return "Tiempo{" + "horas=" + horas + ", minutos=" + minutos + ", segs=" + segs + '}';
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegs() {
        return segs;
    }

    public void setSegs(int segs) {
        this.segs = segs;
    }
    public void imprimirHoraCompleta(){
        Timer t1 = new Timer();
        t1.schedule(tt, 0, 1000);
       
    }
    TimerTask tt= new TimerTask(){
            @Override
            public void run() {
                segs++;
                if(segs>=60){
                    minutos++;
                    segs=0;
                }else if(minutos>=60){
                    horas++;
                    minutos=0;
                }
                System.out.println("La hora es:" + horas +":"+ minutos +":"+ segs);
            }
            
        };
    /*
    Simplemente tienes que agregar la condición de parada del TimerTask en el método run() y si se cumple llamas a cancel().

_timerTask = new TimerTask() {
    int count = 0;

    @Override
    public void run() {
        if (count == 10) {
            cancel();
        }
        System.out.println(count++);
    }
};
    */
}
