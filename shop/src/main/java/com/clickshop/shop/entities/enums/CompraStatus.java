package com.clickshop.shop.entities.enums;

public enum CompraStatus {

	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5),
	EMBALANDO(6);
	
	
	private int code;
	private CompraStatus(int code) {
		this.code = code;
	}
	//para meu codigo ficar acessivel
	public int getCode() {
		return code;
	}
	public static CompraStatus valueOf(int code) {
		for(CompraStatus value : CompraStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Codigo invaido");
	}
}
