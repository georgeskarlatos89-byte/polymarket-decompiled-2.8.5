package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ypa extends qqa {
    public final String a;
    public final int b;
    public final String c;

    public ypa(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
        if (i > 0) {
            StringBuilder sb = new StringBuilder("ArrayKClassValue(");
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("kotlin/Array<");
            }
            sb.append(this.a);
            int i3 = this.b;
            for (int i4 = 0; i4 < i3; i4++) {
                sb.append(">");
            }
            sb.append(")");
            this.c = sb.toString();
            return;
        }
        dmk.v("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypa)) {
            return false;
        }
        ypa ypaVar = (ypa) obj;
        if (Intrinsics.areEqual(this.a, ypaVar.a) && this.b == ypaVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.c;
    }
}
