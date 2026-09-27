package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nua implements tv2 {
    public final /* synthetic */ AtomicInteger a;
    public final /* synthetic */ pc9 b;
    public final /* synthetic */ mua c;

    public nua(AtomicInteger atomicInteger, pc9 pc9Var, mua muaVar, AtomicBoolean atomicBoolean) {
        this.a = atomicInteger;
        this.b = pc9Var;
        this.c = muaVar;
    }

    @Override // defpackage.tv2
    public final void onSuccess(Object obj) {
        if (this.a.decrementAndGet() == 0) {
            this.b.invoke();
            this.c.b(null);
        }
    }
}
