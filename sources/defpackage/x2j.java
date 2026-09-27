package defpackage;

import com.polymarket.data.ELatestHighlight;
import com.polymarket.data.ESportsTeam;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class x2j implements y2j {
    public final String a;
    public final ELatestHighlight b;
    public final ESportsTeam c;

    public x2j(String str, ELatestHighlight eLatestHighlight, ESportsTeam eSportsTeam) {
        str.getClass();
        eLatestHighlight.getClass();
        this.a = str;
        this.b = eLatestHighlight;
        this.c = eSportsTeam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2j)) {
            return false;
        }
        x2j x2jVar = (x2j) obj;
        if (Intrinsics.areEqual(this.a, x2jVar.a) && Intrinsics.areEqual(this.b, x2jVar.b) && Intrinsics.areEqual(this.c, x2jVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.y2j
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ESportsTeam eSportsTeam = this.c;
        if (eSportsTeam == null) {
            hashCode = 0;
        } else {
            hashCode = eSportsTeam.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Play(id=" + this.a + ", highlight=" + this.b + ", team=" + this.c + ")";
    }
}
