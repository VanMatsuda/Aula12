public class Eevee {
    private String nome;
    private String tipo;
    private int HP;
    private double altura, peso;
        
    public String Ataque(){
        return "Ataque rapido";
    }
    public String Defesa(){
        return "Desvio";
    }
    public String Especial(){
        return "Tri-ataque";
    }
    public Eevee(String nome,String tipo, int hP, double altura, double peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.HP = hP;
        this.altura = altura;
        this.peso = peso;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int hP) {
        HP = hP;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void imprimir (){
    System.out.println("Nome: " + getNome());
    System.out.println("Tipo: " + getTipo());
    System.out.println("HP: " + getHP());
    System.out.println("Altura: " + getAltura() + " m");
    System.out.println("Peso: " + getPeso() + " kg");
    System.out.println("Ataque: " + Ataque());
    System.out.println("Defesa: " + Defesa());
    System.out.println("Especial: " + Especial());
    }
}
