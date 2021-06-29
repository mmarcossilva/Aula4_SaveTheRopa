import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vestuario vestuario = new Vestuario("marca", "calça");
        Vestuario vestuario1 = new Vestuario("marca2", "bermuda");
        Vestuario vestuario2 = new Vestuario("marca3", "camisa");
        Vestuario vestuario3 = new Vestuario("marca4", "casaco");
        List<Vestuario> roupas = new ArrayList<>();
        List<Vestuario> roupas2 = new ArrayList<>();
        roupas.add(vestuario);
        roupas.add(vestuario1);
        roupas.add(vestuario2);
        roupas2.add(vestuario3);
        GuardaRoupa guardaRoupa = new GuardaRoupa();
        guardaRoupa.guardarVestuarios(roupas);
        guardaRoupa.guardarVestuarios(roupas2);
        guardaRoupa.mostrarVestuarios();
        System.out.println(guardaRoupa.devolverVestuarios(0));
        System.out.println(guardaRoupa.devolverVestuarios(1));
        guardaRoupa.mostrarVestuarios();
    }
}
