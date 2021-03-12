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
	
	public calzado(int clave, String material, String troquel, int cantProdxDia) {
		super();
		this.clave = clave;
		this.material = material;
		this.troquel = troquel;
		this.cantProdxDia = cantProdxDia;
	}

	//=============================================
	public float costoxLote(float costoxUnidad) {
		float costoxLote = 0F;
		costoxLote=costoxUnidad*this.cantProdxDia;
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
	public void addColores(String colores){
		this.colores.add(colores);	
	}
	
	//=============================================
	public void delColores(String colores){
		this.colores.remove(colores);
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
