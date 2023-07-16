package formularios;

import java.util.Random;

/**
 *
 * @author frans rayner
 */
class ClaveAleatoriaGenerator {
    public static String generarClaveAleatoria() {
        String caracteresPermitidos = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int longitudClave = 8;
        Random random = new Random();
        StringBuilder sb = new StringBuilder(longitudClave);

        for (int i = 0; i < longitudClave; i++) {
            int indiceCaracter = random.nextInt(caracteresPermitidos.length());
            char caracter = caracteresPermitidos.charAt(indiceCaracter);
            sb.append(caracter);
        }

        return sb.toString();
    }
}
