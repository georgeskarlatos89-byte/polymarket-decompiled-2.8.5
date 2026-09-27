package defpackage;

import com.polymarket.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gh extends hh {
    public final List c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gh() {
        super(r1, 0);
        List listOf = CollectionsKt.listOf(new Pair("AL", "Alabama"), new Pair("AK", "Alaska"), new Pair("AS", "American Samoa"), new Pair("AZ", "Arizona"), new Pair("AR", "Arkansas"), new Pair("AA", "Armed Forces (AA)"), new Pair("AE", "Armed Forces (AE)"), new Pair("AP", "Armed Forces (AP)"), new Pair("CA", "California"), new Pair("CO", "Colorado"), new Pair("CT", "Connecticut"), new Pair("DE", "Delaware"), new Pair("DC", "District of Columbia"), new Pair("FL", "Florida"), new Pair("GA", "Georgia"), new Pair("GU", "Guam"), new Pair("HI", "Hawaii"), new Pair("ID", "Idaho"), new Pair("IL", "Illinois"), new Pair("IN", "Indiana"), new Pair("IA", "Iowa"), new Pair("KS", "Kansas"), new Pair("KY", "Kentucky"), new Pair("LA", "Louisiana"), new Pair("ME", "Maine"), new Pair("MH", "Marshal Islands"), new Pair("MD", "Maryland"), new Pair("MA", "Massachusetts"), new Pair("MI", "Michigan"), new Pair("FM", "Micronesia"), new Pair("MN", "Minnesota"), new Pair("MS", "Mississippi"), new Pair("MO", "Missouri"), new Pair("MT", "Montana"), new Pair("NE", "Nebraska"), new Pair("NV", "Nevada"), new Pair("NH", "New Hampshire"), new Pair("NJ", "New Jersey"), new Pair("NM", "New Mexico"), new Pair("NY", "New York"), new Pair("NC", "North Carolina"), new Pair("ND", "North Dakota"), new Pair("MP", "Northern Mariana Islands"), new Pair("OH", "Ohio"), new Pair("OK", "Oklahoma"), new Pair("OR", "Oregon"), new Pair("PW", "Palau"), new Pair("PA", "Pennsylvania"), new Pair("PR", "Puerto Rico"), new Pair("RI", "Rhode Island"), new Pair("SC", "South Carolina"), new Pair("SD", "South Dakota"), new Pair("TN", "Tennessee"), new Pair("TX", "Texas"), new Pair("UT", "Utah"), new Pair("VT", "Vermont"), new Pair("VI", "Virgin Islands"), new Pair("VA", "Virginia"), new Pair("WA", "Washington"), new Pair("WV", "West Virginia"), new Pair("WI", "Wisconsin"), new Pair("WY", "Wyoming"));
        listOf.getClass();
        this.c = listOf;
    }

    @Override // defpackage.hh
    public final List d() {
        return this.c;
    }

    @Override // defpackage.hh
    public final int e() {
        return R.string.stripe_address_label_state;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof gh) || !Intrinsics.areEqual(this.c, ((gh) obj).c)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(R.string.stripe_address_label_state) * 31);
    }

    @Override // defpackage.hh
    public final String toString() {
        return hdi.q("US(label=2132084260, administrativeAreas=", ")", this.c);
    }
}
