package sarf.gerund.modifier.trilateral.unaugmented.meem;

import sarf.noun.trilateral.unaugmented.modifier.AbstractGeminator;
import sarf.verb.trilateral.Substitution.ExpressionInfixSubstitution;
import sarf.verb.trilateral.Substitution.Substitution;

import java.util.ArrayList;
import java.util.List;

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
public class Geminator extends AbstractGeminator {
    private final List<Substitution> substitutions = new ArrayList<>();

    public Geminator() {
        substitutions.add(new ExpressionInfixSubstitution("ْC3َC3", "َC3ّ")); // EX: (مَرَدّ، )
        substitutions.add(new ExpressionInfixSubstitution("ْC3ِC3", "َC3ّ")); // EX: (مَوَدّ، )
    }

    public List<Substitution> getSubstitutions() {
        return substitutions;
    }
}
