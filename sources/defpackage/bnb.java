package defpackage;

import com.polymarket.usviewmodels.USLivestreamAnalyticsContext;
import com.polymarket.usviewmodels.USLivestreamPhase;
import com.polymarket.usviewmodels.USLivestreamStreamKind;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class bnb {
    public final String a;
    public final USLivestreamStreamKind b;
    public final USLivestreamPhase c;

    public bnb(String str, USLivestreamStreamKind uSLivestreamStreamKind, USLivestreamPhase uSLivestreamPhase) {
        uSLivestreamStreamKind.getClass();
        uSLivestreamPhase.getClass();
        this.a = str;
        this.b = uSLivestreamStreamKind;
        this.c = uSLivestreamPhase;
    }

    public final USLivestreamAnalyticsContext a() {
        return new USLivestreamAnalyticsContext(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnb)) {
            return false;
        }
        bnb bnbVar = (bnb) obj;
        if (Intrinsics.areEqual(this.a, bnbVar.a) && this.b == bnbVar.b && this.c == bnbVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.b.hashCode();
        return this.c.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "TrackedContext(provider=" + this.a + ", streamKind=" + this.b + ", phase=" + this.c + ")";
    }
}
