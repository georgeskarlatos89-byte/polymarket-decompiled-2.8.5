package io.sentry;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class v3 {
    public final Serializable a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public v3(Boolean bool, Double d, Double d2, Boolean bool2, Double d3) {
        boolean z;
        this.a = bool;
        this.b = d;
        this.c = d2;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.d = Boolean.valueOf(z);
        this.e = d3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [io.sentry.e7, java.lang.Object] */
    public static v3 a(v6 v6Var, c cVar, p6 p6Var) {
        String str;
        if (p6Var != null) {
            String effectiveOrgId = p6Var.getEffectiveOrgId();
            String b = cVar.b("sentry-org_id");
            if (b != null && !b.trim().isEmpty()) {
                str = b.trim();
            } else {
                str = null;
            }
            if ((effectiveOrgId != null && str != null && !effectiveOrgId.equals(str)) || (p6Var.isStrictTraceContinuation() && ((effectiveOrgId != null || str != null) && (effectiveOrgId == null || !effectiveOrgId.equals(str))))) {
                p6Var.getLogger().f(p5.DEBUG, "Not continuing trace due to strict org ID validation failure.", new Object[0]);
                return new v3();
            }
        }
        return new v3(v6Var.a, (e7) new Object(), v6Var.b, cVar, v6Var.c);
    }

    public v3(Boolean bool, Double d, Double d2) {
        this(bool, d, d2, Boolean.FALSE, (Double) null);
    }

    public v3(Boolean bool, Double d) {
        this(bool, d, (Double) null, Boolean.FALSE, (Double) null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, io.sentry.protocol.w] */
    /* JADX WARN: Type inference failed for: r2v0, types: [io.sentry.e7, java.lang.Object] */
    public v3() {
        this((io.sentry.protocol.w) new Object(), (e7) new Object(), (e7) null, (c) null, (Boolean) null);
    }

    public v3(io.sentry.protocol.w wVar, e7 e7Var, e7 e7Var2, c cVar, Boolean bool) {
        this.b = wVar;
        this.c = e7Var;
        this.d = e7Var2;
        this.e = io.sentry.util.b.i(cVar, bool, null, null);
        this.a = bool;
    }

    public v3(v3 v3Var) {
        this((io.sentry.protocol.w) v3Var.b, (e7) v3Var.c, (e7) v3Var.d, (c) v3Var.e, (Boolean) v3Var.a);
    }

    public v3(io.sentry.android.core.b0 b0Var) {
        this.b = b0Var;
        this.c = null;
        this.d = null;
        this.a = null;
        this.e = null;
    }

    public v3(io.sentry.android.core.b0 b0Var, byte[] bArr) {
        this.b = b0Var;
        this.c = bArr;
        this.d = null;
        this.a = null;
        this.e = null;
    }

    public v3(io.sentry.android.core.b0 b0Var, byte[] bArr, ArrayList arrayList, ArrayList arrayList2, io.sentry.protocol.c cVar) {
        this.b = b0Var;
        this.c = bArr;
        this.d = arrayList;
        this.a = arrayList2;
        this.e = cVar;
    }
}
