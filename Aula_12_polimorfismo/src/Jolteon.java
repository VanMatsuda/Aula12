public class Jolteon extends Eevee {
    @Override
    public String Nome (){
        return "Eu sou O Jolteon";
    }
    @Override //sobrepor os métodos que estão na classe anterior
    public String Ataque(){
        return "Trovoada - Thunder-Shock";
    }
    @Override
    public String Defesa(){
        return "Carga - Wild Charge";
    }
    @Override
    public String Especial(){
        return "Raio - Thunder";
    }
    @Override
    public String Tipo(){
        return "Electric";
    }
    @Override
    public double Altura(){
        return 0.8;
    }
    @Override
    public int HP(){
        return 65;
    }
    @Override
    public double Peso(){
        return 24.5;
    }
}
