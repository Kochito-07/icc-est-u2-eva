import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import controllers.InventoryController;
import models.LabSupply;

public class App {
    public static void main(String[] args) throws Exception {
        List<LabSupply> supplies = new ArrayList<>();

        supplies.add(new LabSupply("IN-205-104", "Ana Torres", 80));
        supplies.add(new LabSupply("IN-201-101", "Luis Mora", 15));
        supplies.add(new LabSupply("IN-208-108", "Carlos Vega", 45));
        supplies.add(new LabSupply("In-205-104", "Ana Torres", 80));
        supplies.add(new LabSupply("IN-203-103", "Luis Andrade", 30));
        supplies.add(new LabSupply("IN-207-107", "Mateo Rojas", 8));
        supplies.add(new LabSupply("IN-202-102", "Sofia Cordero", 105));
        supplies.add(new LabSupply("IN-206-106", "Carlos Mendez", 90));
        supplies.add(new LabSupply("IN-204-105", "Ana Molina", 20));
        supplies.add(new LabSupply("IN-202-105", "Sofia Crespo", 120));
        supplies.add(new LabSupply("IN-203-103", "Carlos Mendez", 8));
        supplies.add(new LabSupply("IN-201-105", "Ana Molina", 45));

        InventoryController controller = new InventoryController();
        System.out.println("\n|----- Insumos filtrados y ordenados (stock minimo 20) -----|\n");
        Set<LabSupply> resultadoA = controller.filterAndSortSupplies(supplies, 20);   

        for (LabSupply s : resultadoA) {
            System.out.println(s);
        }
        
        System.out.println("\n|----- Insumos agrupados por rango de stock: ) -----|\n");
        Map<String, Set<String>> resultadoB = controller.groupCodesByStock(supplies);
        System.out.println(resultadoB);
    }
}
