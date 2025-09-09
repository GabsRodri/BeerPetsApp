package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;
public class SendExpert {
    public List<String> getTipos(String category) {
        List<String> tipos = new ArrayList<>();

        switch (category.toLowerCase()) {
                case "sobres":
                    tipos.add("Sobre tamaño carta");
                    tipos.add("Sobre tamaño oficio");
                    tipos.add("Sobre regalo");
                    break;
                case "paquetes":
                    tipos.add("Paquete pequeño");
                    tipos.add("Paquete mediano");
                    tipos.add("Paquete grande");
                    break;
                case "documentos":
                    tipos.add("Documento urgente");
                    tipos.add("Documento no urgente");
                    tipos.add("Documento internacional");
                    break;
                case "productos":
                    tipos.add("Producto frágil");
                    tipos.add("Producto electrónico");
                    tipos.add("Producto perecedero");
                    break;
                default:
                    tipos.add("No se encontraron tipos de encomienda");
                    break;
            }

            return tipos;
    }
}
