package sarf.gerund.modifier.trilateral.unaugmented.quality.hamza;

import java.util.*;

import sarf.noun.trilateral.unaugmented.modifier.*;
import sarf.verb.trilateral.Substitution.*;

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
public class FaaMahmouz extends AbstractFaaMahmouz {
private final List<Substitution> substitutions = new ArrayList<>();

    public FaaMahmouz() {
        substitutions.add(new InfixSubstitution("ءِوْي", "إِيّ")); // EX: (إيَّة،  )
        substitutions.add(new InfixSubstitution("ءِوْ", "إِي")); // EX: (إيبَة،  )
        substitutions.add(new InfixSubstitution("ءِ", "إِ")); // EX: (إكلة،  )
    }


    public List getSubstitutions() {
        return substitutions;
    }
}
