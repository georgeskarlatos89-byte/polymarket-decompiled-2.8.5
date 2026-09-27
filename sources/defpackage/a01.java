package defpackage;

import android.text.SpannableString;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a01 {
    public final SpannableString a;
    public final SpannableString b;
    public final String c;

    public a01(SpannableString spannableString, SpannableString spannableString2, String str) {
        spannableString.getClass();
        spannableString2.getClass();
        str.getClass();
        this.a = spannableString;
        this.b = spannableString2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a01)) {
            return false;
        }
        a01 a01Var = (a01) obj;
        if (Intrinsics.areEqual(this.a, a01Var.a) && Intrinsics.areEqual(this.b, a01Var.b) && Intrinsics.areEqual(this.c, a01Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutocompletePrediction(primaryText=");
        sb.append((Object) this.a);
        sb.append(", secondaryText=");
        sb.append((Object) this.b);
        sb.append(", placeId=");
        return woa.r(sb, this.c, ")");
    }
}
