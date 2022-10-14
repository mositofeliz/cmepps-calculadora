public class Empleado {
	enum TipoEmpleado{Vendedor, Encargado};
	
	float nominaBruta = 0, salariobase = 0;
	
	float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		if(tipo==TipoEmpleado.Vendedor)
			salariobase=2000;
		else if(tipo==TipoEmpleado.Encargado)
			salariobase=2500;
		
		if(ventasMes>=1000) {
			if(ventasMes>=1500) nominaBruta = salariobase + 200 + horasExtra*30;
			else nominaBruta = salariobase + 100 + horasExtra*30;
		}
		return nominaBruta;
	}
	


	float calculoNominaNeta(float nominaBruta) {
		float retencion = 0;
		
		if(nominaBruta > 2100) {
			if(nominaBruta > 2500) retencion = 0.18f;
			else retencion = 0.15f;
		}
		return (nominaBruta * (1-retencion));
	}
}