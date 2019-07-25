package sarf.verb.trilateral.augmented.modifier.vocalizer.nakes.wawi.active;

import java.util.*;

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
public class Present1Vocalizer extends SubstitutionsApplier implements IAugmentedTrilateralModifier {

    private List substitutions = new LinkedList();

    public Present1Vocalizer() {
        substitutions.add(new InfixSubstitution("ِوُو","ُو"));// EX: (هم يُدْنُون، يحابون، ينجلون، يرتضون، يرعوون، يسترضون، يحلولون)
        substitutions.add(new InfixSubstitution("ِوُن","ُن"));// EX: (هم يُدْنُنَّ، يحابُنَّ، ينجلُنَّ، يرتضُنَّ، يرعوُنَّ، يسترضُنَّ، يحلولُنَّ)
        substitutions.add(new SuffixSubstitution("وُ","ي"));// EX: (هو يُدْنِي، يحابي، ينجلي، يرتضي، يرعَوِي، يسترضي، يحلولي)
        substitutions.add(new SuffixSubstitution("وْ",""));// EX: (لم يُدْنِ، يحاب، ينجلِ، يرتضِ، يرعَوِ، يسترضِ، يحلولِ)
        substitutions.add(new InfixSubstitution("وْن","ين"));// EX: (أنتن تُدنِينَ، تحابين، تنجلين، ترتضين، ترعوين، تسترضين، تحلولين)
        substitutions.add(new InfixSubstitution("ِوِ","ِ"));// EX: (أنتِ تُدْنِينَ، تُحابِينَ، تنجلين، ترتضين، ترعوين، تسترضين، تحلولين)
        substitutions.add(new InfixSubstitution("وَ","يَ"));// EX: (لن يُدْنِيَ، هما يُدنِيان، يحابيان، ينجليان، يرتضيان، يرعويان، يسترضيان، يحلوليان)
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        KindOfVerb kov = conjugationResult.getKov();
        int formulaNo = conjugationResult.getFormulaNo();

        if ((kov == 22 || kov == 23) && formulaNo == 4) return true;
        if ((kov == 21 || kov == 23) &&  formulaNo == 9) return true;
        if (kov == 23 && (formulaNo == 6 || formulaNo == 10)) return true;

        switch (kov) {
        case 21:
        case 22:
        case 23:
            switch (formulaNo) {
            case 1:
            case 3:
            case 5:
                return true;
            }
        }
        return false;
    }
}
