package sarf.noun.trilateral.unaugmented.modifier.timeandplace.vocalizer;

import java.util.*;
import sarf.noun.*;
import sarf.verb.trilateral.Substitution.*;
import sarf.noun.trilateral.unaugmented.modifier.*;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class ACAjwaf1Vocalizer extends TrilateralNounSubstitutionApplier implements IUnaugmentedTrilateralNounModificationApplier {
    List<Substitution> substitutions = new LinkedList<>();

    public ACAjwaf1Vocalizer() {
        substitutions.add(new InfixSubstitution("ْوَ","َا"));// EX: (مَزَار، مَقامَة)
    }


    public List<Substitution> getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        String nounFormula = conjugationResult.getNounFormula();
        if (!nounFormula.equals("مَفْعَل") && !nounFormula.equals("مَفْعَلَة"))
            return false;

        int kov = conjugationResult.getKov();
        int noc = Integer.parseInt(conjugationResult.getRoot().getConjugation());

        switch (kov) {
        case 15:
        case 16:
            return Conjugation.First || noc == Conjugation.Forth;

        case 17:
            switch (noc) {
            case 1:
            case 4:
            case 5:
                return true;
            }

        }
        return false;

    }
}
