package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class k0b extends wtn {
    public final /* synthetic */ s34 a;
    public final /* synthetic */ LinkedHashSet b;
    public final /* synthetic */ Function1 c;

    public k0b(s34 s34Var, LinkedHashSet linkedHashSet, Function1 function1) {
        this.a = s34Var;
        this.b = linkedHashSet;
        this.c = function1;
    }

    @Override // defpackage.wtn
    public final boolean b(Object obj) {
        s34 s34Var = (s34) obj;
        s34Var.getClass();
        if (s34Var != this.a) {
            m9c X = s34Var.X();
            X.getClass();
            if (X instanceof m0b) {
                this.b.addAll((Collection) this.c.invoke(X));
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.wtn
    public final Object d() {
        return Unit.INSTANCE;
    }
}
