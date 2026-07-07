package controllers;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.LabSupply;


public class InventoryController {
  public Set <LabSupply> filterAndSortSupplies(List<LabSupply> supplies, int minimumStock) {
    Set<LabSupply> resultado = new TreeSet<>((s1, s2) -> {
      int comStock = Integer.compare(s2.getStock(), s1.getStock());
      if (comStock != 0) {
        return comStock;
      }
      return s1.getCode().compareToIgnoreCase(s2.getCode());
    });
    for (LabSupply supply : supplies) {
      if (supply.getStock() >= minimumStock) {
        resultado.add(supply);
      }
    }
    return resultado;
  } 
  public Map<String, Set<String>> groupCodesByStock(List<LabSupply> supplies) {
    Map<String, Set<String>> grupos = new TreeMap<>();
    grupos.put("HIGH", new TreeSet<>());
    grupos.put("LOW", new TreeSet<>());
    grupos.put("MEDIUM", new TreeSet<>());

    for (LabSupply supply : supplies) {
      String[] partesCodigo = supply.getCode().split("-");
      if (partesCodigo.length == 3) {
        String yyy = partesCodigo[2];

        if (supply.getStock() >= 50) {
          grupos.get("HIGH").add(yyy);
        } else if (supply.getStock() >= 20) {
          grupos.get("MEDIUM").add(yyy);
        } else {
          grupos.get("LOW").add(yyy);
        }
      }
    }
    return grupos;
  }
}
