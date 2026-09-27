package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kx0 extends frb {
    public final long a;
    public final long b;
    public final mw0 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;
    public final vif g;

    public kx0(long j, long j2, mw0 mw0Var, Integer num, String str, ArrayList arrayList, vif vifVar) {
        this.a = j;
        this.b = j2;
        this.c = mw0Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = vifVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof frb) {
                kx0 kx0Var = (kx0) ((frb) obj);
                if (this.a == kx0Var.a && this.b == kx0Var.b && this.c.equals(kx0Var.c)) {
                    Integer num = kx0Var.d;
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str = kx0Var.e;
                    String str2 = this.e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f.equals(kx0Var.f)) {
                        vif vifVar = kx0Var.g;
                        vif vifVar2 = this.g;
                        if (vifVar2 == null) {
                            if (vifVar == null) {
                                return true;
                            }
                            return false;
                        }
                        if (vifVar2.equals(vifVar)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.a;
        long j2 = this.b;
        int hashCode3 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode3 ^ hashCode) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode4 = (((i2 ^ hashCode2) * 1000003) ^ this.f.hashCode()) * 1000003;
        vif vifVar = this.g;
        if (vifVar != null) {
            i = vifVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
