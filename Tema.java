public class Tema {
    public static void main(String[] args) {
        int numeroIf=0, numeroWhile=-9, numeroDoWhile=0, numerfor=3, estacion=4;
        if(numeroIf!=0){
            if(numeroIf>0)
                System.out.println("numeroIf es positivo");
            else
                System.out.println("numeroIf es negativo");
        }
        else{
            System.out.println("numeroIf es 0");
        }
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println("numeroWhile es: "+numeroWhile);
        }
        do{
            numeroDoWhile++;
            System.out.println("numeroDoWhile es: "+numeroDoWhile);
        }
        while(numeroDoWhile<0);
        for(int i=0; i<=numerfor; i++){
            System.out.println("numeroFor es: "+numerfor);
        }
        switch(estacion){
            case 0:
                System.out.println("Primavera");
            break;
            case 1:
                System.out.println("Verano");
            break;
            case 2:
                System.out.println("Otoño");
            break;
            case 3:
                System.out.println("Invierno");
            break;
            default:
            System.out.println("Error");
            break;
        }
    }
}