package sarf.noun.trilateral.unaugmented.modifier.exaggeration.vocalizer;

import java.util.*;

import sarf.Conjugation;
import sarf.KindOfVerb;
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
public class I1Vocalizer extends TrilateralNounSubstitutionApplier implements IUnaugmentedTrilateralNounModificationApplier {
    private final List<Substitution> substitutions = new ArrayList<>();

    public I1Vocalizer() {
        substitutions.add(new InfixSubstitution("ِوٌ","ٍ"));// EX: (هذا زَهٍ)
        substitutions.add(new InfixSubstitution("ِوً","ِيً"));// EX: (رأيتُ زَهِيًا)
        substitutions.add(new InfixSubstitution("ِوٍ","ٍ"));// EX: (مررتُ على زَهٍ)
        substitutions.add(new SuffixSubstitution("ِوُ","ِي"));// EX: (هذا الزاهي، )
        substitutions.add(new SuffixSubstitution("ِوَ","ِيَ"));// EX: (رأيتُ الزاهيَ، )
        substitutions.add(new SuffixSubstitution("ِوِ","ِي"));// EX: (مررتُ على الزاهي، )
        substitutions.add(new InfixSubstitution("ِوَ","ِيَ"));// EX: (زَهِيَةٌ، زَهِيان )
        substitutions.add(new InfixSubstitution("ِوُ","ُ"));// EX: (زَهُون، )
        substitutions.add(new InfixSubstitution("ِوِ","ِ"));// EX: (زَهِينَ، )
    }

    public List<Substitution> getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        String nounFormula = conjugationResult.getNounFormula();
        KindOfVerb kov = conjugationResult.getKov();
        var noc = conjugationResult.getRoot().getConjugation();

        return nounFormula.equals("فَعِل") && (kov == KindOfVerb.Naqis_Wawi && (noc == Conjugation.First || noc == Conjugation.Third || noc == Conjugation.Fifth));
    }
}
