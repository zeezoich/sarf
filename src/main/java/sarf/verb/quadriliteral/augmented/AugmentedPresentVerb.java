package sarf.verb.quadriliteral.augmented;

/**
 * <p>Title: Sarf</p>
 *
 * <p>Description: ?????? ???????</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: </p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public abstract class AugmentedPresentVerb {

    protected final AugmentedQuadrilateralRoot root;
    protected final String lastDpr;
    protected final String connectedPronoun;
    //حرف المضارع
    protected final String cp;

    public AugmentedPresentVerb(AugmentedQuadrilateralRoot root, String cp, String lastDpr, String connectedPronoun) {
        this.root = root;
        this.cp = cp;
        this.lastDpr = lastDpr;
        this.connectedPronoun = connectedPronoun;
    }

    public abstract String form();

    public String getConnectedPronoun() {
        return connectedPronoun;
    }

    public AugmentedQuadrilateralRoot getRoot() {
        return root;
    }

    public String getLastDpr() {
        return lastDpr;
    }

    public String toString() {
        return form();
    }

    public String getCp() {
        return cp;
    }

}
