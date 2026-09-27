package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface m9c {
    public static final vvn a = vvn.l;

    Set getClassifierNames();

    u44 getContributedClassifier(csc cscVar, xub xubVar);

    Collection getContributedDescriptors(kn6 kn6Var, Function1 function1);

    Collection getContributedFunctions(csc cscVar, xub xubVar);

    Collection getContributedVariables(csc cscVar, xub xubVar);

    Set getFunctionNames();

    Set getVariableNames();

    void recordLookup(csc cscVar, xub xubVar);
}
