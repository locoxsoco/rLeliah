package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Producto{
	private int idProducto;
	private String nombre;
	private float precio;
	private int cantMinima;
	private String marca;

	public int getIdProducto(){
		return idProducto;
	}

	public void setIdProducto (int _idProducto){
		this.idProducto=_idProducto;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre (String _nombre){
		this.nombre=_nombre;
	}

	public float getPrecio(){
		return precio;
	}

	public void setPrecio (float _precio){
		this.precio=_precio;
	}

	public int getCantMinima(){
		return cantMinima;
	}

	public void setCantMinima (int _cantMinima){
		this.cantMinima=_cantMinima;
	}

	public String getMarca(){
		return marca;
	}

	public void setMarca (String _marca){
		this.marca=_marca;
	}

	public Producto(int idProducto,String nombre,float precio,int cantMinima,String marca){
		this.idProducto=idProducto;
		this.nombre=nombre;
		this.precio=precio;
		this.cantMinima=cantMinima;
		this.marca=marca;
		
	}
}