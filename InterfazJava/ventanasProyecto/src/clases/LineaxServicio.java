package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class LineaxServicio{
        private static int counter=1;
        private int idLineaxServicio;
	private Servicio servicio;
	private float cant;
	private float montoFinal;
        
        public int getIdLineaxServicio(){
		return idLineaxServicio;
	}

	public void setIdLineaxServicio (int _idLineaxServicio){
		this.idLineaxServicio= _idLineaxServicio;
	}
        
	public Servicio getServicio(){
		return servicio;
	}

	public void setServicio (Servicio _servicio){
		this.servicio=_servicio;
	}
	public float getCant(){
		return cant;
	}

	public void setCant (float _cant){
		this.cant=_cant;
	}

	public float getMontoFinal(){
		return montoFinal;
	}

	public void setMontoFinal (float _montoFinal){
		this.montoFinal=_montoFinal;
	}
	public LineaxServicio(Servicio servicio,float cant,float montoFinal){
		this.servicio=servicio;
		this.cant=cant;
		this.montoFinal=montoFinal;
                this.idLineaxServicio=counter++;
	}
        public LineaxServicio(){
            
        }
	public void agregarServicio(Servicio servicio){
		
	}
}