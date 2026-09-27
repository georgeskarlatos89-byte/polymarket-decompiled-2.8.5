package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class il8 implements CoroutineContext {
    public final CoroutineContext a;

    public il8(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    public final boolean equals(Object obj) {
        return Intrinsics.areEqual(this.a, obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return this.a.get(fVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        g85 g85Var;
        CoroutineContext minusKey = this.a.minusKey(fVar);
        int i = e2k.b;
        r55 r55Var = d.d1;
        CoroutineContext.Element element = get(r55Var);
        g85 g85Var2 = null;
        if (element instanceof g85) {
            g85Var = (g85) element;
        } else {
            g85Var = null;
        }
        CoroutineContext.Element element2 = minusKey.get(r55Var);
        if (element2 instanceof g85) {
            g85Var2 = (g85) element2;
        }
        if ((g85Var instanceof ki6) && !Intrinsics.areEqual(g85Var, g85Var2)) {
            ((ki6) g85Var).c = 0;
        }
        return new il8(minusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        g85 g85Var;
        CoroutineContext plus = this.a.plus(coroutineContext);
        int i = e2k.b;
        r55 r55Var = d.d1;
        CoroutineContext.Element element = get(r55Var);
        g85 g85Var2 = null;
        if (element instanceof g85) {
            g85Var = (g85) element;
        } else {
            g85Var = null;
        }
        CoroutineContext.Element element2 = plus.get(r55Var);
        if (element2 instanceof g85) {
            g85Var2 = (g85) element2;
        }
        if ((g85Var instanceof ki6) && !Intrinsics.areEqual(g85Var, g85Var2)) {
            ((ki6) g85Var).c = 0;
        }
        return new il8(plus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.a + ")";
    }
}
