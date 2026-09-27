package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class pdd {
    public final IntRange a;
    public final ArrayList b;
    public final ArrayList c;
    public final Integer d;
    public final ArrayList e;
    public final IntRange f;

    public pdd(IntRange intRange, ArrayList arrayList, ArrayList arrayList2, Integer num, ArrayList arrayList3, IntRange intRange2) {
        intRange.getClass();
        intRange2.getClass();
        this.a = intRange;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = num;
        this.e = arrayList3;
        this.f = intRange2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pdd) {
                pdd pddVar = (pdd) obj;
                if (!Intrinsics.areEqual(this.a, pddVar.a) || !Intrinsics.areEqual(this.b, pddVar.b) || !Intrinsics.areEqual(this.c, pddVar.c) || !Intrinsics.areEqual(this.d, pddVar.d) || !Intrinsics.areEqual(this.e, pddVar.e) || !Intrinsics.areEqual(this.f, pddVar.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int b = m51.b(this.c, m51.b(this.b, this.a.hashCode() * 31, 31), 31);
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return this.f.hashCode() + m51.b(this.e, (b + hashCode) * 31, 31);
    }

    public final String toString() {
        return "NumericParts(prefixRange=" + this.a + ", wholeDigitIndices=" + this.b + ", separatorIndices=" + this.c + ", decimalIndex=" + this.d + ", fractionalDigitIndices=" + this.e + ", suffixRange=" + this.f + ")";
    }
}
