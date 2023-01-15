package cursojavabasico;

public class polimorfismoMain {

    public static void main(String[] args) {
        Coche coche1=new Coche();

        electrico_coche coche2=new electrico_coche();

        cochehibrido coche3 = new cochehibrido();

        //polimofismo

        Coche coche4=new electrico_coche();

        Coche coche5 = new cochehibrido();

        if(coche4 instanceof Coche){
            System.out.println("coche");
        }

        if(coche4 instanceof electrico_coche){
            System.out.println("coche electrico");
        }

        if(coche4 instanceof cochehibrido){
            System.out.println("Coche hibrido");
        }

    }
}
