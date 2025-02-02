package sarf.noun.trilateral.unaugmented.modifier.activeparticiple.vocalizer;

import java.util.List;
import java.util.LinkedList;
import sarf.verb.trilateral.Substitution.*;
import sarf.verb.trilateral.unaugmented.modifier.vocalizer.ajwaf.*;
import sarf.noun.trilateral.unaugmented.modifier.IUnaugmentedTrilateralNounModificationApplier;
import sarf.noun.trilateral.unaugmented.modifier.ConjugationResult;
import java.util.ArrayList;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description:فحص الأجوف حسب قائمة    </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class Ajwaf3YaeiListedVocalizer extends AbstractAjwafYaeiListedVocalizer implements IUnaugmentedTrilateralNounModificationApplier {
    private final List<Substitution> substitutions = new LinkedList<>();

    public Ajwaf3YaeiListedVocalizer() {
        substitutions.add(new InfixSubstitution("ايِ", "ائِ")); // EX: (بائِعٌ)
    }

    public List<Substitution> getSubstitutions() {
        return substitutions;
    }

    private static final List<String> appliedProunounsIndecies = new ArrayList<>(18);
    static {
        for (int i = 0; i < 18; i++) {
            appliedProunounsIndecies.add(i + 1 + "");
        }
    }

    protected List<String> getAppliedPronounsIndecies() {
        return appliedProunounsIndecies;
    }

    public boolean isApplied(ConjugationResult conjugationResult) {
        return super.isApplied(conjugationResult);
    }
}
