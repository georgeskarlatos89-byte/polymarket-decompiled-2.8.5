package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj6 implements dk6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ck6 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ zj6(ck6 ck6Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = ck6Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // defpackage.dk6
    public final ScheduledFuture a(ba6 ba6Var) {
        int i = this.a;
        Runnable runnable = this.c;
        ck6 ck6Var = this.b;
        switch (i) {
            case 0:
                return ck6Var.b.scheduleAtFixedRate(new ak6(ck6Var, runnable, ba6Var, 0), this.d, this.e, this.f);
            default:
                return ck6Var.b.scheduleWithFixedDelay(new ak6(ck6Var, runnable, ba6Var, 2), this.d, this.e, this.f);
        }
    }
}
