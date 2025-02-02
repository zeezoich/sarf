package sarf.verb.trilateral.augmented.modifier.vocalizer.lafif.connected.active;

import java.util.*;

import sarf.KindOfVerb;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.augmented.modifier.*;
import sarf.verb.trilateral.augmented.*;

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
public class Present9Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {
    private final List<Substitution> substitutions = new ArrayList<>();

    public Present9Vocalizer() {
        substitutions.add(new SuffixSubstitution("وُ", "ى")); // EX: (يَتَساوَى، يَتَسَوَّى)
        substitutions.add(new SuffixSubstitution("وْ", "")); // EX: (لم يَتَساوَ، لم يَتَسَوَّ)
        substitutions.add(new SuffixSubstitution("وَ", "ى")); // EX: (لن يَتَساوَى، لن يتسوَّى)
        substitutions.add(new InfixSubstitution("وَا", "يَا")); // EX: (أنتما تَتَساوَيانِ، تتسوَّيانِ)
        substitutions.add(new InfixSubstitution("وِي", "يْ")); // EX: (أنتِ تَتَساوَيْنَ، تتسوَّيْنَ)
        substitutions.add(new InfixSubstitution("وِن", "يِن")); // EX: (أنتِ تَتَساوَيِنَّ، تتسوَّيِنَّ)
        substitutions.add(new InfixSubstitution("وُو", "وْ")); // EX: (أنتم تَتَساوَوْنَ، تتسوَّوْنَ)
        substitutions.add(new InfixSubstitution("وْن", "يْن")); // EX: (أنتن تَتَساوَيْنَ، تتسوَّيْنَ)
        substitutions.add(new InfixSubstitution("وَن", "يَن")); // EX: (تَتَساوَيَنَ، تتسوَّيَنَ)
    }

    public List<Substitution> getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        KindOfVerb kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();
        AugmentedTrilateralRoot root = conjugationResult.getRoot();
        return root.getC2() == root.getC3() && root.getC3() == 'و' &&  kov == KindOfVerb.Lafeef_Maqroon && (formulaNo == 7 || formulaNo == 8);
    }
}
