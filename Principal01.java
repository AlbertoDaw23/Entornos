import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal01 {
    public static void main(String[] args){

        System.out.println("Hola mundo");
        

        imprimirFechaYHoraActual();
    }

     public static void imprimirFechaYHoraActual() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHoraFormateada = fechaHoraActual.format(formatoFechaHora);
        System.out.println("Fecha y Hora actual: " + fechaHoraFormateada);
    }
}
