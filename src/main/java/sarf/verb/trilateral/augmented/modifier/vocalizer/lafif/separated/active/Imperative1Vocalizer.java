package sarf.verb.trilateral.augmented.modifier.vocalizer.lafif.separated.active;

import java.util.*;

import sarf.KindOfVerb;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.ConjugationResult;

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
public class Imperative1Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {
    private final List<Substitution> substitutions = new ArrayList<>();

    public Imperative1Vocalizer() {
        substitutions.add(new SuffixSubstitution("يْ",""));// EX: (أوْصِ، والِ، اتَّقِ، استوفِ)
        substitutions.add(new InfixSubstitution("يِي","ي"));// EX: (أنتِ أوْصِي، والِي، اتَّقِي، استوفِي)
        substitutions.add(new InfixSubstitution("يِن","ن"));// EX: (أنتِ أوْصِنَّ، والِنَّ، اتَّقِنَّ، استوْفِنَّ)
        substitutions.add(new InfixSubstitution("يْن","ين"));// EX: (أنتن أوْصِينَ، والِينَ، اتقِينَ، استَوْفِينَ)
        substitutions.add(new InfixSubstitution("ِيُ","ُ"));// EX: (أنتم أوْصُوا، والُوا، اتقُوا، استوفُوا)
    }

    public List<Substitution> getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        KindOfVerb kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        if (kov == KindOfVerb.Lafeef_Mafrooq_Mahmouz_Ain) {
            switch (formulaNo) {
                case 5:
                case 9:
                    return true;
            }


            switch (formulaNo) {
                case 1:
                case 3:
                    return true;
            }
        } else if (kov == KindOfVerb.Lafeef_Mafrooq) {
            switch (formulaNo) {
                case 1:
                case 3:
                case 5:
                case 9:
                    return true;
            }
        }
        return false;
    }
}
