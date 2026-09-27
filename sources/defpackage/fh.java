package defpackage;

import com.polymarket.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fh extends hh {
    public final List c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fh() {
        super(r0, 0);
        List listOf = CollectionsKt.listOf(new Pair("AB", "Alberta"), new Pair("BC", "British Columbia"), new Pair("MB", "Manitoba"), new Pair("NB", "New Brunswick"), new Pair("NL", "Newfoundland and Labrador"), new Pair("NT", "Northwest Territories"), new Pair("NS", "Nova Scotia"), new Pair("NU", "Nunavut"), new Pair("ON", "Ontario"), new Pair("PE", "Prince Edward Island"), new Pair("QC", "Quebec"), new Pair("SK", "Saskatchewan"), new Pair("YT", "Yukon"));
        listOf.getClass();
        this.c = listOf;
    }

    @Override // defpackage.hh
    public final List d() {
        return this.c;
    }

    @Override // defpackage.hh
    public final int e() {
        return R.string.stripe_address_label_province;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof fh) || !Intrinsics.areEqual(this.c, ((fh) obj).c)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(R.string.stripe_address_label_province) * 31);
    }

    @Override // defpackage.hh
    public final String toString() {
        return hdi.q("Canada(label=2132084256, administrativeAreas=", ")", this.c);
    }
}
