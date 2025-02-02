package sarf.verb.trilateral.augmented.modifier.substituter.passive;

import java.util.*;

import sarf.KindOfVerb;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.ConjugationResult;
import sarf.verb.trilateral.augmented.modifier.IAugmentedTrilateralModifier;

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
public class SpecialSubstituter1 extends SubstitutionsApplier implements IAugmentedTrilateralModifier {
    private final List<Substitution> substitutions = new ArrayList<>();

    public SpecialSubstituter1() {
        substitutions.add(new InfixSubstitution("وْت","تّ"));// EX: (اتُّصِلَ ، اتُّقِيَ، اتُّئِيَ)
    }

    public List<Substitution> getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        KindOfVerb kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();
        return conjugationResult.getRoot().getC1() == 'و' && formulaNo == 5 && (kov == KindOfVerb.Mithal_Wawi_Mahmouz_Ain || kov == KindOfVerb.Mithal_Wawi_Mahmouz_Laam || kov == KindOfVerb.Mithal_Wawi || kov == KindOfVerb.Lafeef_Mafrooq_Mahmouz_Ain || kov == KindOfVerb.Lafeef_Mafrooq );
    }
}
