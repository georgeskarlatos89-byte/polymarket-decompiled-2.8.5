package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MatchGroup {
    public final String a;
    public final IntRange b;

    public MatchGroup(String str, IntRange intRange) {
        str.getClass();
        this.a = str;
        this.b = intRange;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MatchGroup) {
                MatchGroup matchGroup = (MatchGroup) obj;
                if (!Intrinsics.areEqual(this.a, matchGroup.a) || !Intrinsics.areEqual(this.b, matchGroup.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
