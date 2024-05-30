public class Pokedex {
    public static void main(String[] args) throws Exception {
    Eevee e = new Eevee("Eevee","Normal",10,0.3,6.5);
        e.imprimir();
        
    System.out.println();
        

    Jolteon j = new Jolteon("Jolteon","Electric",65,0.6, 24.5);
        j.imprimir();

    System.out.println();

    Espeon es = new Espeon("Espeon","Psychic",65,0.9,26.5);
        es.imprimir();
    
    System.out.println();

    Flareon f = new Flareon("Flareon","Fire",65,0.9,25.0);
        f.imprimir();

    System.out.println();

    Glaceon g = new Glaceon("Glaceon","Ice",65,0.8,25.9);
        g.imprimir();

    System.out.println();

    Leafeon lea = new Leafeon("Leafeon","Grass",65,1.0,25.5);
        lea.imprimir();

    System.out.println();

    Sylveon sy = new Sylveon("Sylveon","Fairy",95,1.0,23.5);
        sy.imprimir();

    System.out.println();

    Umbreon u = new Umbreon("Umbreon","Dark",95,1.0,27.0);
        u.imprimir();

    System.out.println();

    Vaporeon v = new Vaporeon( "Vaporeon","Water",130,1.0,29.0);
        v.imprimir();
    }
}