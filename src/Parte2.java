public class Parte2 {


    public static void main(String[] args){

        coche miCoche = new coche();
        miCoche.AddPuerta();
        System.out.println(miCoche.puertas);
    }
}
class coche{
    public int puertas = 3;
    public void AddPuerta() {
        this.puertas++;
    }
}
