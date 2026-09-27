package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ifj extends q55 {
    public Object k;
    public mrc l;
    public Iterator m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ jfj r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifj(jfj jfjVar, Continuation continuation) {
        super(continuation);
        this.r = jfjVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.emit(null, this);
    }
}
