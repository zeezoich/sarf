package sarf.verb.trilateral.unaugmented.modifier.vocalizer.nakes.wawi.passive;

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
public class PresentVocalizer extends SubstitutionsApplier implements IUnaugmentedTrilateralModifier {
    private List<Substitution> substitutions = new ArrayList<>();

    public PresentVocalizer() {
        substitutions.add(new SuffixSubstitution("َوُ","َى"));// EX: (يُغْزَى، يُزهى، يُرضَى، يُسْرَى)
        substitutions.add(new SuffixSubstitution("َوَ","َى"));// EX: (لن يُغزى )
        substitutions.add(new SuffixSubstitution("َوْ","َ"));// EX: (لم يُغْزَ)
        substitutions.add(new InfixSubstitution("َوَا","َيَا"));// EX: (يُغزيان )
        substitutions.add(new InfixSubstitution("َوِي","َيْ"));// EX: (أنتِ تُغْزَيْنَ )
        substitutions.add(new InfixSubstitution("َوَن","َيَن"));// EX: (هو يُغْزَيَنَّ، يُزْهَيَنَّ)
        substitutions.add(new InfixSubstitution("َوِن","َيِن"));// EX: (أنتِ تُغْزَيِنَّ)
        substitutions.add(new InfixSubstitution("َوْن","َيْن"));// EX: (أنتن تُغْزَيْنَ)
        substitutions.add(new InfixSubstitution("َوُو","َوْ"));// EX: (أنتم تُغْزَوْنَ )
    }


    public List getSubstitutions() {
        return substitutions;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        int kov = conjugationResult.getKov();
        var noc = conjugationResult.getRoot().getConjugation();
        return ((kov == 21 || kov == 22 || kov == 23) && (noc == Conjugation.First)) ||
                ((kov == 21 || kov == 23) && (noc == Conjugation.Fifth)) ||
                ((kov == 22 || kov == 23) && (noc == Conjugation.Third)) ||
                (kov == 23 && noc == Conjugation.Forth);
    }
}
