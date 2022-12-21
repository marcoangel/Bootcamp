public class Tema {
    public static void main(String[] args) {
        System.out.println(suma(5,9,8));
        Coche coche=new Coche();
        coche.incrementaPuertas();
        System.out.println(coche.setPuertas());
    }

    public static int suma(int x, int z, int y){
        return x+z+y;
    }
}

class Coche{
    private int puertas;
    public Coche(){
        puertas=0;
    }

    public int setPuertas(){
        return puertas;
    }

    public void incrementaPuertas(){
        puertas++;
    }
}