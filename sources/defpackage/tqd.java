package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tqd extends q55 {
    public Function2 k;
    public Collection l;
    public Iterator m;
    public Collection n;
    public /* synthetic */ Object o;
    public final /* synthetic */ uqd p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqd(uqd uqdVar, q55 q55Var) {
        super(q55Var);
        this.p = uqdVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, this);
    }
}
