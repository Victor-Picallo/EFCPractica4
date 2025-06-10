public class Buscador {

    //He eliminado la variable innecesaria y he hecho que si encuentra la plabra clave devuelva true y en caso contrario fase
    public static boolean contienePalabraClave(String texto) {
        String clave = "java";
        String textoMin = texto.toLowerCase();
        String[] palabras = textoMin.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            if (palabra.equals(clave)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(contienePalabraClave("Estoy aprendiendo Java y me encanta."));
        System.out.println(contienePalabraClave("Este texto no contiene la palabra clave."));
    }
}
