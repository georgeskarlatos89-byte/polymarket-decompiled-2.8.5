package defpackage;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class gq9 {
    public final Resources.Theme a;
    public final int b;

    public gq9(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq9)) {
            return false;
        }
        gq9 gq9Var = (gq9) obj;
        if (Intrinsics.areEqual(this.a, gq9Var.a) && this.b == gq9Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.a);
        sb.append(", id=");
        return sv6.o(sb, this.b, ')');
    }
}
