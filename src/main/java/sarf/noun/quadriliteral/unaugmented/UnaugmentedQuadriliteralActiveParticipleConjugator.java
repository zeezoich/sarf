package sarf.noun.quadriliteral.unaugmented;

import sarf.verb.quadriliteral.unaugmented.*;
import sarf.noun.*;
import java.util.*;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description: إنشاء اسم الفاعل الرباعي المجرد    </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class UnaugmentedQuadriliteralActiveParticipleConjugator {
    private UnaugmentedQuadriliteralActiveParticipleConjugator() {
    }

    private static final UnaugmentedQuadriliteralActiveParticipleConjugator instance = new UnaugmentedQuadriliteralActiveParticipleConjugator();

    public static UnaugmentedQuadriliteralActiveParticipleConjugator getInstance() {
        return instance;
    }

    public UnaugmentedQuadriliteralActiveParticiple createNoun(UnaugmentedQuadrilateralRoot root, int suffixIndex) {
        String suffix = GenericNounSuffixContainer.getInstance().get(suffixIndex);
        return new UnaugmentedQuadriliteralActiveParticiple(root, suffix);
    }

    public List createNounList(UnaugmentedQuadrilateralRoot root) {
        List result = new ArrayList(18);
        for (int i=0; i<18; i++)
            result.add(createNoun(root, i));
        return result;
    }

}
