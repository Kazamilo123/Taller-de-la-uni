import java.time.LocalDate;

public class FrecuenciasCardiacas {
    private String primerNombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int AñoNacimiento;

    public FrecuenciasCardiacas(String primerNombre, String apellido, int mesNacimiento, int diaNacimiento, int AñoNacimiento){
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.AñoNacimiento = AñoNacimiento;
    }

    public void setPrimerNombre(String primerNombre){
        this.primerNombre = primerNombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setMesNacimiento(int mesNacimiento){
        this.mesNacimiento = mesNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento){
        this.diaNacimiento = diaNacimiento;
    }

    public void setAñoNacimiento(int AñoNacimiento){
        this.AñoNacimiento = AñoNacimiento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getMesNacimiento() {
        return mesNacimiento;
    }
    public int getDiaNacimiento() {
        return diaNacimiento;
    }
    public int getAñoNacimiento() {
        return AñoNacimiento;
    }
    public int obtenerEdad() {
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - AñoNacimiento;
        if (hoy.getMonthValue() < mesNacimiento ||
                (hoy.getMonthValue() == mesNacimiento && hoy.getDayOfMonth() < diaNacimiento)) {
            edad--;
        }
        return edad;
    }
    public int obtenerFrecuenciaMaxima() {
        return 220 - obtenerEdad();
    }
    public double obtenerFrecuenciaEsperadaMinima() {
        return obtenerFrecuenciaMaxima() * 0.50;
    }
    public double obtenerFrecuenciaEsperadaMaxima() {
        return obtenerFrecuenciaMaxima() * 0.85;
    }
}



