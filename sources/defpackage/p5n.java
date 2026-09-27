package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class p5n {
    public final String a;
    public final String b;
    public final boolean c;

    public p5n(String str, String str2, boolean z) {
        arn.e(str);
        this.a = str;
        arn.e(str2);
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5n)) {
            return false;
        }
        p5n p5nVar = (p5n) obj;
        if (dkn.b(this.a, p5nVar.a) && dkn.b(this.b, p5nVar.b) && dkn.b(null, null) && this.c == p5nVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        arn.h(null);
        throw null;
    }
}
