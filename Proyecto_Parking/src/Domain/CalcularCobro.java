package Domain;


public interface CalcularCobro {
  
    int CalcularHoras(String Inicio, String fin);


    double CalcularCobro(int horasTotales, double montoXhora);

  
    void CancelarPago(String montoTotal);

}
