package soot.jimple.paddle;

import soot.jimple.paddle.queue.*;
import soot.jimple.paddle.bdddomains.*;
import jedd.*;
import java.util.*;

public class BDDKObjSensStaticContextManager extends AbsStaticContextManager {
    BDDKObjSensStaticContextManager(Rsrcc_srcm_stmt_kind_tgtc_tgtm in, Qsrcc_srcm_stmt_kind_tgtc_tgtm out, int k) {
        super(in, out);
    }
    
    public boolean update() {
        final jedd.internal.RelationContainer newEdges =
          new jedd.internal.RelationContainer(new Attribute[] { srcc.v(), srcm.v(), stmt.v(), kind.v(), tgtc.v(), tgtm.v() },
                                              new PhysicalDomain[] { C1.v(), MS.v(), ST.v(), KD.v(), C2.v(), MT.v() },
                                              ("<soot.jimple.paddle.bdddomains.srcc:soot.jimple.paddle.bdddo" +
                                               "mains.C1, soot.jimple.paddle.bdddomains.srcm:soot.jimple.pad" +
                                               "dle.bdddomains.MS, soot.jimple.paddle.bdddomains.stmt:soot.j" +
                                               "imple.paddle.bdddomains.ST, soot.jimple.paddle.bdddomains.ki" +
                                               "nd:soot.jimple.paddle.bdddomains.KD, soot.jimple.paddle.bddd" +
                                               "omains.tgtc:soot.jimple.paddle.bdddomains.C2, soot.jimple.pa" +
                                               "ddle.bdddomains.tgtm:soot.jimple.paddle.bdddomains.MT> newEd" +
                                               "ges = jedd.internal.Jedd.v().copy(jedd.internal.Jedd.v().pro" +
                                               "ject(in.get(), new jedd.PhysicalDomain[...]), new jedd.Physi" +
                                               "calDomain[...], new jedd.PhysicalDomain[...]); at /home/olho" +
                                               "tak/soot-trunk/src/soot/jimple/paddle/BDDKObjSensStaticConte" +
                                               "xtManager.jedd:37,45-53"),
                                              jedd.internal.Jedd.v().copy(jedd.internal.Jedd.v().project(in.get(),
                                                                                                         new PhysicalDomain[] { C2.v() }),
                                                                          new PhysicalDomain[] { C1.v() },
                                                                          new PhysicalDomain[] { C2.v() }));
        out.add(new jedd.internal.RelationContainer(new Attribute[] { tgtm.v(), srcm.v(), srcc.v(), tgtc.v(), stmt.v(), kind.v() },
                                                    new PhysicalDomain[] { MT.v(), MS.v(), C1.v(), C2.v(), ST.v(), KD.v() },
                                                    ("out.add(newEdges) at /home/olhotak/soot-trunk/src/soot/jimpl" +
                                                     "e/paddle/BDDKObjSensStaticContextManager.jedd:39,8-11"),
                                                    newEdges));
        return !jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(newEdges), jedd.internal.Jedd.v().falseBDD());
    }
}