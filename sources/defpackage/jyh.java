package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class jyh {
    public final String a;
    public final String b;
    public final String c;
    public final DesignTokens.SemanticColor d;
    public final lyh e;
    public final String f;
    public final String g;

    public jyh(String str, String str2, String str3, DesignTokens.SemanticColor semanticColor, lyh lyhVar, String str4, String str5) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = semanticColor;
        this.e = lyhVar;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyh)) {
            return false;
        }
        jyh jyhVar = (jyh) obj;
        if (Intrinsics.areEqual(this.a, jyhVar.a) && Intrinsics.areEqual(this.b, jyhVar.b) && Intrinsics.areEqual(this.c, jyhVar.c) && Intrinsics.areEqual(this.d, jyhVar.d) && this.e == jyhVar.e && Intrinsics.areEqual(this.f, jyhVar.f) && Intrinsics.areEqual(this.g, jyhVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        DesignTokens.SemanticColor semanticColor = this.d;
        if (semanticColor == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = semanticColor.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        lyh lyhVar = this.e;
        if (lyhVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = lyhVar.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str3 = this.f;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("StatsBannerPlay(title=", this.a, ", playerName=", this.b, ", teamAbbreviation=");
        r.append(this.c);
        r.append(", teamColor=");
        r.append(this.d);
        r.append(", teamSide=");
        r.append(this.e);
        r.append(", playIcon=");
        r.append(this.f);
        r.append(", playIconDark=");
        return woa.r(r, this.g, ")");
    }
}
