package meli.bootcamp.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    private Integer numeroLocker = 0;

    private Map<Integer, List<Prenda>> lockers;

    public GuardaRopa() {
        this.lockers = new HashMap<>();
    }

    public Integer guardarPrendas(List<Prenda> prendas) {
        this.lockers.put(++numeroLocker, prendas);
        return this.numeroLocker;
    }

    public String mostrarPrendas() {
        StringBuilder builder = new StringBuilder();

        this.lockers.entrySet()
            .stream()
            .forEach(entry -> {
                builder.append("  - LOCKER N°").append(entry.getKey()).append(":\n");

                List<Prenda> prendas = entry.getValue();
                for (Integer index = 0; index < prendas.size(); index++) {
                    builder.append(prendas.get(index));

                    if (index < prendas.size() - 1) {
                        builder.append("\n");
                    }
                }
            });
        
        return builder.toString();
    }

    public List<Prenda> devolverPrendas(Integer numeroLocker) {
        List<Prenda> prendas = this.lockers.getOrDefault(numeroLocker, null);

        if (prendas != null) {
            this.lockers.remove(numeroLocker);
        }

        return prendas;
    }
    
}
