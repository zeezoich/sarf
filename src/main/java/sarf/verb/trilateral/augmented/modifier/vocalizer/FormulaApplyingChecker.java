package sarf.verb.trilateral.augmented.modifier.vocalizer;

import sarf.verb.trilateral.augmented.AugmentedTrilateralRoot;

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
public class FormulaApplyingChecker {
    private final Formula1ApplyingChecker formula1ApplyingChecker = new Formula1ApplyingChecker();
    private final Formula5ApplyingChecker formula5ApplyingChecker = new Formula5ApplyingChecker();
    private final Formula9ApplyingChecker formula9ApplyingChecker = new Formula9ApplyingChecker();

    private FormulaApplyingChecker() {
    }

    private static final FormulaApplyingChecker instance = new FormulaApplyingChecker();

    public static FormulaApplyingChecker getInstance() {
        return instance;
    }

    public int check(AugmentedTrilateralRoot root, int formulaNo) {
        switch (formulaNo) {
        case 1:
            return formula1ApplyingChecker.check(root);
        case 5:
            return formula5ApplyingChecker.check(root);
        case 9:
            return formula9ApplyingChecker.check(root);
        }
        return IFormulaApplyingChecker.NO_THING;
    }
}
