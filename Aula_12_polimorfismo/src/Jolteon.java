public class Jolteon extends Eevee {
    @Override
    public String nome (){
        return "Eu sou O Jolteon";
    }
    @Override //sobrepor os métodos que estão na classe anterior
    public String ataque(){
        return "Trovoada - Thunder-Shock";
    }
    @Override
    public String defesa(){
        return "Carga - Wild Charge";
    }
    @Override
    public String especial(){
        return "Raio - Thunder";
    }
    @Override
    public String tipo(){
        return "Electric";
    }
    @Override
    public double altura(){
        return 0.8;
    }
    @Override
    public int HP(){
        return 65;
    }
    @Override
    public double peso(){
        return 24.5;
    }
}
