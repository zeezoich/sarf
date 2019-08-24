package sarf.gerund.modifier.trilateral.unaugmented.meem.vocalizer;

import sarf.SystemConstants;
import sarf.noun.trilateral.unaugmented.modifier.ConjugationResult;
import sarf.noun.trilateral.unaugmented.modifier.IUnaugmentedTrilateralNounModificationApplier;
import sarf.verb.trilateral.Substitution.InfixSubstitution;
import sarf.verb.trilateral.Substitution.Substitution;
import sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.AbstractAjwafYaeiListedVocalizer;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description:هو تكرار للصف الاخر ولكن مع شرط وجود الجذر ضمن القائمة           </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class AjwafListed1Vocalizer extends AbstractAjwafYaeiListedVocalizer implements IUnaugmentedTrilateralNounModificationApplier {
    private final List<Substitution> substitutions = new ArrayList<>();

    public AjwafListed1Vocalizer() {
        substitutions.add(new InfixSubstitution("ْيِ", "ِي"));// EX: ( مَبِيع، )
        substitutions.add(new InfixSubstitution("ْيَ", "َا"));// EX: (محار)
    }

    public List<Substitution> getSubstitutions() {
        return substitutions;
    }

    private static final List<String> appliedPronounsIndexes = new ArrayList<>(18);

    static {
        for (int i = 0; i < SystemConstants.NOUN_POSSIBLE_STATES; i++) {
            appliedPronounsIndexes.add(i + 1 + "");
        }
    }

    @Override
    protected List<String> getAppliedPronounsIndexes() {
        return appliedPronounsIndexes;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        return super.isApplied(conjugationResult);
    }
}
