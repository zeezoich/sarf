package sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.wawi.active;

import java.util.*;

import sarf.Conjugation;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.unaugmented.modifier.*;
import sarf.verb.trilateral.unaugmented.ConjugationResult;

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
public class Past4Vocalizer extends SubstitutionsApplier implements IUnaugmentedTrilateralModifier {

    private List<Substitution> substitutions = new ArrayList<>();

    public Past4Vocalizer() {
        substitutions.add(new InfixSubstitution("ُوْ", "ُو"));
        substitutions.add(new InfixSubstitution("ُوُ", "ُ"));
    }

    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        var noc = conjugationResult.getRoot().getConjugation();
        //return (kov == 21 || kov == 23) && (noc == Conjugation.Fifth);
        return (kov == 21 || kov == 23) && (noc == Conjugation.Fifth);
    }
}
