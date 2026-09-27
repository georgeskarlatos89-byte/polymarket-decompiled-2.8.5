package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class n9c implements m9c {
    @Override // defpackage.m9c
    public Set<csc> getClassifierNames() {
        return null;
    }

    @Override // defpackage.m9c
    public u44 getContributedClassifier(csc cscVar, xub xubVar) {
        cscVar.getClass();
        xubVar.getClass();
        return null;
    }

    @Override // defpackage.m9c
    public Collection getContributedDescriptors(kn6 kn6Var, Function1 function1) {
        kn6Var.getClass();
        return CollectionsKt.emptyList();
    }

    @Override // defpackage.m9c
    public Collection getContributedFunctions(csc cscVar, xub xubVar) {
        cscVar.getClass();
        xubVar.getClass();
        return CollectionsKt.emptyList();
    }

    @Override // defpackage.m9c
    public Collection getContributedVariables(csc cscVar, xub xubVar) {
        cscVar.getClass();
        xubVar.getClass();
        return CollectionsKt.emptyList();
    }

    @Override // defpackage.m9c
    public Set<csc> getFunctionNames() {
        Collection contributedDescriptors = getContributedDescriptors(kn6.p, ys.w);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : contributedDescriptors) {
            if (obj instanceof d7h) {
                csc name = ((d7h) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.m9c
    public Set<csc> getVariableNames() {
        Collection contributedDescriptors = getContributedDescriptors(kn6.q, ys.w);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : contributedDescriptors) {
            if (obj instanceof d7h) {
                csc name = ((d7h) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.m9c
    public void recordLookup(csc cscVar, xub xubVar) {
        cscVar.getClass();
        xubVar.getClass();
        getContributedFunctions(cscVar, xubVar);
    }
}
