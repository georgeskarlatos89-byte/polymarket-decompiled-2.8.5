package bo.app;

import android.content.Context;
import defpackage.ace;
import defpackage.b69;
import defpackage.fq5;
import defpackage.quk;
import defpackage.w0l;
import defpackage.woa;
import defpackage.yyk;
import defpackage.zv5;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s2 {
    public final m8 a;
    public final wf b;
    public final ub c;
    public boolean d;

    public s2(Context context, m8 m8Var, wf wfVar) {
        context.getClass();
        this.a = m8Var;
        this.b = wfVar;
        this.c = new ub(context);
    }

    public static final String c() {
        return "Publishing new messaging session event.";
    }

    public static final String d() {
        return "Messaging session not started.";
    }

    public final boolean a() {
        long s = this.b.s();
        long j = -1;
        if (s != -1 && !this.d) {
            Long readLong = this.c.readLong(fq5.MESSAGING_SESSION_END_TIMESTAMP, -1L);
            if (readLong != null) {
                j = readLong.longValue();
            }
            long j2 = j;
            long f = zv5.f();
            b69.h(this, null, null, false, new yyk(1, s, f, j2), 7);
            if (j2 + s < f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        if (a()) {
            b69.h(this, null, null, false, new w0l(8), 7);
            this.a.b(vb.a, vb.class);
            this.d = true;
            return;
        }
        b69.h(this, null, null, false, new w0l(9), 7);
    }

    public final void e() {
        long f = zv5.f();
        b69.h(this, null, null, false, new quk(f, 7), 7);
        this.c.writeData(fq5.MESSAGING_SESSION_END_TIMESTAMP, Long.valueOf(f));
        this.d = false;
    }

    public static final String a(long j, long j2, long j3) {
        StringBuilder p = ace.p(j, "Messaging session timeout: ", ", current diff: ");
        p.append(j2 - j3);
        return p.toString();
    }

    public static final String a(long j) {
        return woa.m(j, "Messaging session stopped. Adding new messaging session timestamp: ");
    }
}
