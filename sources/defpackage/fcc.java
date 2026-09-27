package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class fcc extends q55 {
    public jcc k;
    public List l;
    public /* synthetic */ Object m;
    public final /* synthetic */ jcc n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcc(jcc jccVar, Continuation continuation) {
        super(continuation);
        this.n = jccVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return jcc.b(this.n, null, this);
    }
}
