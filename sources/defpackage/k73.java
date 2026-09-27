package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class k73 extends m73 {
    public static final Set i = ArraysKt.l0(new Character[]{'-', ' '});
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final de1 g;
    public final boolean h;

    public k73(String str) {
        boolean z;
        str.getClass();
        this.c = str;
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (!i.contains(Character.valueOf(charAt))) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        this.d = sb2;
        int length = sb2.length();
        this.e = length;
        if (length == 19) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        String H = r2i.H(6, sb2);
        H = H.length() != 6 ? null : H;
        this.g = H != null ? new de1(H) : null;
        int length2 = sb2.length() - 1;
        int i3 = 0;
        boolean z3 = true;
        while (true) {
            if (-1 < length2) {
                char charAt2 = sb2.charAt(length2);
                if (!Character.isDigit(charAt2)) {
                    break;
                }
                int numericValue = Character.getNumericValue(charAt2);
                boolean z4 = !z3;
                numericValue = z3 ? numericValue : numericValue * 2;
                if (numericValue > 9) {
                    numericValue -= 9;
                }
                i3 += numericValue;
                length2--;
                z3 = z4;
            } else if (i3 % 10 == 0) {
                z2 = true;
            }
        }
        this.h = z2;
    }

    public final String a(int i2) {
        Set set = (Set) m73.b.get(Integer.valueOf(i2));
        if (set == null) {
            set = m73.a;
        }
        String H = r2i.H(i2, this.d);
        int size = set.size() + 1;
        String[] strArr = new String[size];
        int length = H.length();
        int i3 = 0;
        int i4 = 0;
        for (Object obj : CollectionsKt.y0(CollectionsKt.M0(set))) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int intValue = ((Number) obj).intValue() - i3;
            if (length > intValue) {
                strArr[i3] = H.substring(i4, intValue);
                i4 = intValue;
            }
            i3 = i5;
        }
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                if (strArr[i6] == null) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i6);
        if (i6 == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            strArr[valueOf.intValue()] = H.substring(i4);
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            String str = strArr[i7];
            if (str == null) {
                break;
            }
            arrayList.add(str);
        }
        return CollectionsKt.N(arrayList, ApiConstant.SPACE, null, null, null, 62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k73) && Intrinsics.areEqual(this.c, ((k73) obj).c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return sv6.n("Unvalidated(denormalized=", this.c, ")");
    }
}
