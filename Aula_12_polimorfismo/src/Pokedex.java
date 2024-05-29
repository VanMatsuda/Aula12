public class Pokedex {
    public static void main(String[] args) throws Exception {
    Eevee e = new Eevee("Normal",10,0.3,6.5,"Eevee");
        e.imprimir();

    Jolteon j = new Jolteon("Electric",65,0.6, 24.5,"Jolteon");
        j.imprimir();
    
    Espeon es = new Espeon("Psychic",65,0.9,26.5,"Espeon");
        es.imprimir();

    Flareon f = new Flareon("Fire",65,0.9,25.0,"Flareon");
        f.imprimir();

    Glaceon g = new Glaceon("Ice",65,0.8,25.9,"Glaceon");
        g.imprimir();

    Leafeon lea = new Leafeon("Grass",65,1.0,25.5,"Leafeon");
        lea.imprimir();

    Sylveon sy = new Sylveon("Fairy",95,1.0,23.5,"Sylveon");
        sy.imprimir();

    Umbreon u = new Umbreon("Dark",95,1.0,27.0,"Umbreon");
        u.imprimir();

    Vaporeon v = new Vaporeon("Water",130,1.0,29.0,"Vaporeon");
        v.imprimir();
    }
}