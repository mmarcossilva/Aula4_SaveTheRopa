import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {
    private int contador;
    private HashMap<Integer, List<Vestuario>> portas;

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        portas.put(contador, listaDeVestuario);
        this.contador++;
        return contador-1;
    }

    public GuardaRoupa() {
        this.contador = 0;
        this.portas = new HashMap<Integer, List<Vestuario>>();
    }

    public void mostrarVestuarios(){
        portas.forEach((key, value) -> {
            System.out.println("Porta "+ key);

            for (Vestuario item : value) {
                System.out.println(item);
            }
        });
    }

    public List<Vestuario> devolverVestuarios(Integer id){
        return portas.remove(id);
    }
}
