package sarf.verb.quadriliteral.modifier.vocalizer.nakes.active;

import java.util.*;
import sarf.verb.quadriliteral.substitution.*;
import sarf.verb.quadriliteral.modifier.*;
import sarf.verb.quadriliteral.*;

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
public class Imperative1Vocalizer extends SubstitutionsApplier {

    private final List<Substitution> substitutions = new ArrayList<>();

    public Imperative1Vocalizer() {
        substitutions.add(new SuffixSubstitution("يْ", "")); // EX: (قَلْسِ، اسلَنْقِ)
        substitutions.add(new InfixSubstitution("يِي", "ي")); // EX: (أنتِ قَلْسِي، اسلَنْقِي)
        substitutions.add(new InfixSubstitution("يِن", "ن")); // EX: (أنتِ قَلْسِنَّ، اسلَنْقِنَّ)
        substitutions.add(new InfixSubstitution("يْن", "ين")); // EX: (أنتن قَلْسِينَ، اسلَنْقِينَ)
        substitutions.add(new InfixSubstitution("ِيُ", "ُ")); // EX: (أنتم قَلْسُوا، اسلَنْقُوا)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        if (conjugationResult.getRoot().getC4() != 'ي')
            return false;

        switch (conjugationResult.getFormulaNo()) {
        case 0:
        case 2:
            return true;
        }

        return false;
    }
}
