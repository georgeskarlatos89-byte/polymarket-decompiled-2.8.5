package kotlin.ranges;

import defpackage.a84;
import defpackage.h1a;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/a;", "La84;", "", "", "e", "h1a", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntRange extends a implements a84 {
    public static final h1a e = new h1a(null);
    public static final IntRange f = new a(1, 0, 1);

    public final boolean a(int i) {
        if (this.a <= i && i <= this.b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.a
    public final boolean equals(Object obj) {
        if (obj instanceof IntRange) {
            if (!isEmpty() || !((IntRange) obj).isEmpty()) {
                IntRange intRange = (IntRange) obj;
                if (this.a == intRange.a && this.b == intRange.b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // kotlin.ranges.a
    public final boolean isEmpty() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.a
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
