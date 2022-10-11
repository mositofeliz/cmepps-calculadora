public class Empleado {
	enum TipoEmpleado{vendedor, encargado};
	
	float nominaBruta = 0, salariobase = 0;
	
	float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		if(tipo==TipoEmpleado.vendedor)
			salariobase=2000;
		else if(tipo==TipoEmpleado.encargado)
			salariobase=2500;
		
		if(ventasMes>=1000) {
			if(ventasMes>=1500) nominaBruta = salariobase + 200 + horasExtra*30;
			else nominaBruta = salariobase + 100 + horasExtra*30;
		}
		return nominaBruta;
	}
	


	float calculoNominaNeta(float nominaBruta) {
		float retencion = 0;
		
		if(nominaBruta > 1100) {
			if(nominaBruta > 1500) retencion = (float) 0.18;
			else retencion = (float) 0.15;
		}
		return (nominaBruta * (1-retencion));
	}
}