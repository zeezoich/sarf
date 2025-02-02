package sarf.noun.quadriliteral.augmented;

import java.util.Map;
import java.util.HashMap;
import sarf.verb.quadriliteral.augmented.AugmentedQuadrilateralRoot;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import sarf.AugmentationFormula;
import sarf.noun.GenericNounSuffixContainer;

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
public class AugmentedQuadriliteralActiveParticipleConjugator {
    private AugmentedQuadriliteralActiveParticipleConjugator() {
    }

    private static final AugmentedQuadriliteralActiveParticipleConjugator instance = new AugmentedQuadriliteralActiveParticipleConjugator();

    public static AugmentedQuadriliteralActiveParticipleConjugator getInstance() {
        return instance;
    }

    public AugmentedQuadriliteralNoun createNoun(AugmentedQuadrilateralRoot root, int suffixIndex, int formulaNo) {
        String suffix = GenericNounSuffixContainer.getInstance().get(suffixIndex);
        String formulaClassName = getClass().getPackage().getName()+".activeparticiple."+"NounFormula"+formulaNo;
        Object [] parameters = {root, suffix};

        try {
            return (AugmentedQuadriliteralNoun) Class.forName(formulaClassName).getConstructors()[0].newInstance(parameters);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List createNounList(AugmentedQuadrilateralRoot root, int formulaNo) {
        List result = new LinkedList();
        for (int i = 0; i < 18; i++) {
            AugmentedQuadriliteralNoun noun = createNoun(root, i, formulaNo);
            result.add(noun);
        }

        return result;

    }

    public Map createAllNounList(AugmentedQuadrilateralRoot root) {
        Map result = new HashMap();
        for (Object o : root.getAugmentationList()) {
            AugmentationFormula formula = (AugmentationFormula) o;
            List formulaVerbList = createNounList(root, formula.getFormulaNo());
            result.put(formula.getFormulaNo() + "", formulaVerbList);
        }
        return result;
    }

}
