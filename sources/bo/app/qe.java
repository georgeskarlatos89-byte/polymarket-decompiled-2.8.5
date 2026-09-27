package bo.app;

import defpackage.m51;
import defpackage.woa;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qe implements na {
    public final y9 a;
    public final int b;
    public final String c;
    public final String d;

    public qe(y9 y9Var, int i, String str, String str2) {
        y9Var.getClass();
        this.a = y9Var;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // bo.app.na
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe)) {
            return false;
        }
        qe qeVar = (qe) obj;
        if (Intrinsics.areEqual(this.a, qeVar.a) && this.b == qeVar.b && Intrinsics.areEqual(this.c, qeVar.c) && Intrinsics.areEqual(this.d, qeVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = woa.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{code = ");
        sb.append(this.b);
        sb.append(", reason = ");
        sb.append(this.c);
        sb.append(", message = ");
        return m51.m(sb, this.d, '}');
    }
}
