public class Jolteon extends Eevee {
    public Jolteon(String nome,String tipo, int hP, double altura, double peso){
        super(nome,tipo, hP, altura, peso);
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
}
