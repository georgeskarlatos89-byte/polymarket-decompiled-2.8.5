package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p8b extends r0h {
    public final List c;
    public final List d;
    public final long e;
    public final long f;
    public final int g;

    public p8b(List list, ArrayList arrayList, long j, long j2, int i) {
        this.c = list;
        this.d = arrayList;
        this.e = j;
        this.f = j2;
        this.g = i;
    }

    @Override // defpackage.r0h
    public final Shader b(long j) {
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        return p50.a((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), this.c, this.d, this.g);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p8b) {
                p8b p8bVar = (p8b) obj;
                if (Intrinsics.areEqual(this.c, p8bVar.c) && Intrinsics.areEqual(this.d, p8bVar.d) && ogd.c(this.e, p8bVar.e) && ogd.c(this.f, p8bVar.f) && this.g == p8bVar.g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.c.hashCode() * 31;
        List list = this.d;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return Integer.hashCode(this.g) + woa.d(woa.d((hashCode + i) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0) {
            str = "";
        } else {
            str = "start=" + ((Object) ogd.h(j)) + ", ";
        }
        long j2 = this.f;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) ogd.h(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.c + ", stops=" + this.d + ", " + str + str2 + "tileMode=" + ((Object) elm.g(this.g)) + ')';
    }
}
