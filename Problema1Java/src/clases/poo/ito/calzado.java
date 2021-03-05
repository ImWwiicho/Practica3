package clases.poo.ito;

import java.util.HashSet;

public class calzado {

	private int clave = 0;
	private String material = "";
	private String troquel = "";
	private int cantProdxDia = 0;
	private HashSet<String> colores = new HashSet<String>();

	public calzado() {
		super();
	}
	
	public calzado(int clave, String material, String troquel, int cantProdxDia, HashSet<String> colores) {
		super();
		this.clave = clave;
		this.material = material;
		this.troquel = troquel;
		this.cantProdxDia = cantProdxDia;
		this.colores = colores;
	}

	//=============================================
	public float costoxLote(float costoxUnidad) {
		float costoxLote = 0F;
		return costoxLote;
	}
	
	//=============================================
	public int getClave() {
		return this.clave;
	}
	
	//=============================================
	public void setClave(int newClave) {
		this.clave = newClave;
	}
	
	//=============================================
	public String getMaterial() {
		return this.material;
	}
	
	//=============================================
	public void setMaterial(String newMaterial) {
		this.material = newMaterial;
	}

	//=============================================
	public String getTroquel() {
		return this.troquel;
	}

	//=============================================
	public void setTroquel(String newTroquel) {
		this.troquel = newTroquel;
	}

	//=============================================
	public int getCantProdxDia() {
		return this.cantProdxDia;
	}

	//=============================================
	public void setCantProdxDia(int newCantProdxDia) {
		this.cantProdxDia = newCantProdxDia;
	}

	//=============================================
	public HashSet<String> getColores() {
		return this.colores;
	}

	@Override
	public String toString() {
		return "calzado [clave=" + clave + ", material=" + material + ", troquel=" + troquel + ", cantProdxDia="
				+ cantProdxDia + ", colores=" + colores + "]";
	}

}
