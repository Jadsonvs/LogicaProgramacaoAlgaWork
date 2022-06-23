package exercicio03ExibindoOsDadosDeUmPedido;

public class GerenciamentoDePedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		pedido.codigo = 01;
		pedido.subtotal = 50.0;
		pedido.desconto = 12.0;
		
		System.out.println("Código do pedido: " + pedido.getCodigo());
		System.out.println("Subtotal: " + pedido.getSubtotal());
		System.out.println("Desconto: " + pedido.getDesconto());
		System.out.println("Total do pedido: " + pedido.getTotal());
	}
}