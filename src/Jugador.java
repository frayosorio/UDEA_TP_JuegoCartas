import java.util.Random;

import javax.swing.JPanel;

public class Jugador {

    private final int TOTAL_CARTAS = 10;
    private final int MARGEN = 10;
    private final int DISTANCIA = 50;

    private Carta[] cartas = new Carta[TOTAL_CARTAS];
    private Random r = new Random();

    public void repartir() {
        int i = 0;
        for (Carta c : cartas) {
            cartas[i++] = new Carta(r);
        }
    }

    public void mostrar(JPanel pnl) {
        pnl.removeAll();

        int p = 1;
        for (Carta c : cartas) {
            c.mostrar(pnl, MARGEN + TOTAL_CARTAS * DISTANCIA - p++ * DISTANCIA, MARGEN);
        }

        pnl.repaint();
    }

    public String getGrupos(){
        String mensaje="No se encontraron figuras";

        return mensaje;
    }

}
