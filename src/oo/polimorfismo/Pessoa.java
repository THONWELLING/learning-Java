package oo.polimorfismo;

public class Pessoa {

  private double peso;

  public Pessoa(double peso) {
    this.peso = peso;
  }

  public void comer(Comida comida) {
    this.peso += Math.round(comida.getPeso());
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    if(peso >= 0 ) {
      this.peso = peso;
    }
  }
}
