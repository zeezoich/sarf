package sarf.verb.trilateral.augmented.imperative;

import sarf.ImperativeConjugationDataContainer;

/**
 * this class has method that return instances that know how conjugate the augment imperative verb of both kinds (مؤكد و غير مؤكد)
 */
public final class AugmentedImperativeConjugatorFactory {
    private AugmentedImperativeConjugatorFactory() {}

    private static final AugmentedImperativeConjugatorFactory instance = new AugmentedImperativeConjugatorFactory();

    private final AugmentedImperativeConjugator notEmphasizedConjugator = new AugmentedImperativeConjugator(ImperativeConjugationDataContainer.getInstance().getLastDimList(), ImperativeConjugationDataContainer.getInstance().getConnectedPronounList());
    private final AugmentedImperativeConjugator emphasizedConjugator = new AugmentedImperativeConjugator(ImperativeConjugationDataContainer.getInstance().getEmphasizedLastDimList(), ImperativeConjugationDataContainer.getInstance().getEmphasizedConnectedPronounList());

    public static AugmentedImperativeConjugatorFactory getInstance() {
        return instance;
    }

    public AugmentedImperativeConjugator getEmphasizedConjugator() {
        return emphasizedConjugator;
    }

    public AugmentedImperativeConjugator getNotEmphasizedConjugator() {
        return notEmphasizedConjugator;
    }
}
