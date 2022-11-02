package oo.composicao.umxmuitos;

public class CompraTeste {
  public static void main(String[] args) {

    Compra compra1 = new Compra();
    compra1.cliente = "ThonWelleng Dani";
    compra1.items.add(new Item("Placa Video Geforce Gt 730 4gb 128bits Vga Hdmi Dvi", 1, 520));
    compra1.items.add(new Item("Mesa Gamer Para 2 Monitores 3 Prateleiras", 1, 388.30));
    compra1.items.add(new Item("Monitor AOC 21.5 ", 2, 647.10));
    compra1.items.add(new Item("Kit Gamer Teclado+Mouse+Headset+MousePad", 1, 118.53));

    System.out.println(compra1.items.size());
    System.out.println(compra1.obterValorTotal());

    /*
    * Relação bi-direcinal
    * Agora para adicionar os itens utilizamos o método criado par a isso.
    *
        compra1.adicionarItem(new Item("Placa Video Geforce Gt 730 4gb 128bits Vga Hdmi Dvi", 1, 520));
        compra1.adicionarItem(new Item("Mesa Gamer Para 2 Monitores 3 Prateleiras", 1, 388.30));
        compra1.adicionarItem(new Item("Monitor AOC 21.5 ", 2, 647.10));
        compra1.adicionarItem(new Item("Kit Gamer Teclado+Mouse+Headset+MousePad", 1, 118.53));

    *Ou seja no momento que eu adiciono o item dentro da compra eu adiciono a compre dentro do item
    * garantindo a relação bi-direcional
    * */
  }
}
