package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jx0 extends arb {
    public final long a;
    public final Integer b;
    public final yj4 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final p2d h;

    public jx0(long j, Integer num, yj4 yj4Var, long j2, byte[] bArr, String str, long j3, p2d p2dVar) {
        this.a = j;
        this.b = num;
        this.c = yj4Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = p2dVar;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof arb) {
            arb arbVar = (arb) obj;
            jx0 jx0Var = (jx0) arbVar;
            if (this.a == jx0Var.a) {
                Integer num = jx0Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    yj4 yj4Var = jx0Var.c;
                    yj4 yj4Var2 = this.c;
                    if (yj4Var2 != null ? yj4Var2.equals(yj4Var) : yj4Var == null) {
                        if (this.d == jx0Var.d) {
                            if (arbVar instanceof jx0) {
                                bArr = ((jx0) arbVar).e;
                            } else {
                                bArr = jx0Var.e;
                            }
                            if (Arrays.equals(this.e, bArr)) {
                                String str = jx0Var.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == jx0Var.g) {
                                        p2d p2dVar = jx0Var.h;
                                        p2d p2dVar2 = this.h;
                                        if (p2dVar2 != null ? p2dVar2.equals(p2dVar) : p2dVar == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i2 = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        yj4 yj4Var = this.c;
        if (yj4Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = yj4Var.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        long j2 = this.d;
        int hashCode4 = (((i4 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i5 = (hashCode4 ^ hashCode3) * 1000003;
        long j3 = this.g;
        int i6 = (i5 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        p2d p2dVar = this.h;
        if (p2dVar != null) {
            i2 = p2dVar.hashCode();
        }
        return i6 ^ i2;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + "}";
    }
}
