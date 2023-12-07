package program;

import drugs.impl.CatDrug;
import drugs.impl.components.Azitron;
import drugs.impl.components.Penicillin;
import drugs.impl.components.Water;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import drugs.Component;

public class Main {
    public static void main(String[] args) {

        // components
        Component water = new Water("water", "10", 1);
        Component azitron = new Azitron("azitron", "2", 4);
        Component pinicillin = new Penicillin("pinicillin", "15", 10);
        Component pinicillin1 = new Penicillin("pinicillin", "15", 10);

        // Lists
        List<Component> components1 = new ArrayList<>();
        components1.add(water);
        components1.add(pinicillin);

        List<Component> components2 = new ArrayList<>();
        components2.add(water);
        components2.add(azitron);

        List<Component> components3 = new ArrayList<>();
        components3.add(pinicillin);
        components3.add(azitron);

        List<Component> components4 = new ArrayList<>();
        components4.add(water);
        components4.add(pinicillin);
        components4.add(pinicillin1);

        List<Component> components5 = new ArrayList<>();
        components5.add(water);
        components5.add(pinicillin1);

        // Drugs
        CatDrug drug1 = new CatDrug(components1);
        CatDrug drug2 = new CatDrug(components2);
        CatDrug drug3 = new CatDrug(components3);
        CatDrug drug4 = new CatDrug(components4);
        CatDrug drug5 = new CatDrug(components5);

        // домашка

        // 1 task
        Set<Component> components = new HashSet<>();
        components.add(water);
        components.add(water);
        components.add(pinicillin);
        components.add(azitron);
        System.out.println(components);

        // task 2
        Set<Component> result = new HashSet<>();
        result.add(pinicillin);
        result.add(pinicillin1);
        System.out.println(result);

        // task 3
        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug3);
        drugs.add(drug4);
        drugs.add(drug5);
        System.out.println(drugs);

        Collections.sort(drugs);
        System.out.println(drugs);
    }

}
