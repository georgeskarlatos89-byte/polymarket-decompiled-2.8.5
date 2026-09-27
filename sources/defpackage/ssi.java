package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ssi extends tsi {
    public final int a;
    public final Integer b;
    public final boolean c;
    public final Function0 d;

    public ssi(int i, Integer num, boolean z, Function0 function0) {
        this.a = i;
        this.b = num;
        this.c = z;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ssi) {
                ssi ssiVar = (ssi) obj;
                if (this.a != ssiVar.a || !Intrinsics.areEqual(this.b, ssiVar.b) || this.c != ssiVar.c || !Intrinsics.areEqual(this.d, ssiVar.d)) {
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
        int hashCode2 = Integer.hashCode(this.a) * 31;
        int i = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int g = hdi.g((hashCode2 + hashCode) * 31, 31, this.c);
        Function0 function0 = this.d;
        if (function0 != null) {
            i = function0.hashCode();
        }
        return g + i;
    }

    public final String toString() {
        return "Trailing(idRes=" + this.a + ", contentDescription=" + this.b + ", isTintable=" + this.c + ", onClick=" + this.d + ")";
    }

    public /* synthetic */ ssi(int i, int i2, Function0 function0, boolean z) {
        this(i, (Integer) null, z, (i2 & 8) != 0 ? null : function0);
    }
}
