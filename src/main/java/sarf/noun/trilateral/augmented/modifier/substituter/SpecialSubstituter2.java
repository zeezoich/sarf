package sarf.noun.trilateral.augmented.modifier.substituter;

import java.util.*;

import sarf.KindOfVerb;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.ConjugationResult;
import sarf.verb.trilateral.augmented.modifier.IAugmentedTrilateralModifier;
import sarf.noun.TrilateralNounSubstitutionApplier;

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
public class SpecialSubstituter2 extends TrilateralNounSubstitutionApplier implements IAugmentedTrilateralModifier {
    private final List<Substitution> substitutions = new LinkedList();

    public SpecialSubstituter2() {
        substitutions.add(new InfixSubstitution("يْت","تّ"));// EX: (اتِّسار،)
    }

    public List<Substitution> getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        KindOfVerb kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();
        return conjugationResult.getRoot().getC1() == 'ي' && formulaNo == 5 && (kov == KindOfVerb.Mithal_Yaee_Mahmouz_Ain || kov == KindOfVerb.Mithal_Yaee);
    }
}
