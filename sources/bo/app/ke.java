package bo.app;

import defpackage.b69;
import defpackage.lk1;
import defpackage.pm1;
import defpackage.psk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ke {
    public final y9 a;
    public long b;
    public final long c;
    public le d;
    public int e;
    public Integer f;
    public long g;
    public int h;

    public ke(y9 y9Var, long j, long j2) {
        le leVar = le.PENDING_START;
        y9Var.getClass();
        this.a = y9Var;
        this.b = j;
        this.c = j2;
        this.d = leVar;
        this.e = 0;
        this.f = null;
        this.g = j2;
    }

    public final String a(long j) {
        return kotlin.text.c.d("\n            |RequestInfo for " + this.a.hashCode() + " \n            | at " + j + "\n            | request.target = " + ((v2) this.a).f() + "\n            | nextAdvance = " + (this.b - j) + "\n            | createdAt = " + (this.c - j) + "\n            | state = " + this.d + "\n            | lastStateMovedAt = " + (this.g - j) + "\n            | timesMovedToRetry = " + this.h + "\n        ");
    }

    public static final String a(ke keVar, le leVar, long j) {
        return "Moving from " + keVar.d + " -> " + leVar + " with time " + j + " for \n" + keVar.a(j);
    }

    public static final String a(ke keVar, long j) {
        return "Moving to pending retry.Updated retry count: " + keVar.h + " for: \n" + keVar.a(j);
    }

    public final void a(long j, le leVar) {
        if (this.d != leVar) {
            pm1 pm1Var = pm1.V;
            b69.h(this, pm1Var, null, true, new lk1(this, leVar, j, 3), 2);
            this.g = j;
            this.d = leVar;
            if (leVar == le.PENDING_RETRY) {
                this.h++;
                b69.h(this, pm1Var, null, true, new psk(this, j, 3), 2);
            }
        }
    }
}
