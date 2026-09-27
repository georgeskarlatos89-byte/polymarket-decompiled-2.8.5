package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ly0 {
    public final String a;
    public final long b;
    public final t4j c;

    public ly0(String str, long j, t4j t4jVar) {
        this.a = str;
        this.b = j;
        this.c = t4jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ly0) {
            ly0 ly0Var = (ly0) obj;
            String str = ly0Var.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.b == ly0Var.b) {
                    t4j t4jVar = ly0Var.c;
                    t4j t4jVar2 = this.c;
                    if (t4jVar2 != null ? t4jVar2.equals(t4jVar) : t4jVar == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        t4j t4jVar = this.c;
        if (t4jVar != null) {
            i = t4jVar.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
