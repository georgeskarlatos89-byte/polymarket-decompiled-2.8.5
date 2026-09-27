package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class sx0 {
    public static final /* synthetic */ int h = 0;
    public final String a;
    public final pje b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rx0] */
    static {
        ?? obj = new Object();
        obj.f = 0L;
        obj.h = (byte) (obj.h | 2);
        obj.b(pje.ATTEMPT_MIGRATION);
        obj.e = 0L;
        obj.h = (byte) (obj.h | 1);
        obj.a();
    }

    public sx0(String str, pje pjeVar, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.b = pjeVar;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rx0] */
    public final rx0 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = (byte) 3;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sx0) {
            sx0 sx0Var = (sx0) obj;
            String str = sx0Var.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.b.equals(sx0Var.b)) {
                    String str3 = sx0Var.c;
                    String str4 = this.c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = sx0Var.d;
                        String str6 = this.d;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.e == sx0Var.e && this.f == sx0Var.f) {
                                String str7 = sx0Var.g;
                                String str8 = this.g;
                                if (str8 != null ? str8.equals(str7) : str7 == null) {
                                    return true;
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
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 ^ hashCode3) * 1000003;
        long j = this.e;
        int i4 = (i3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i5 = (i4 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.a);
        sb.append(", registrationStatus=");
        sb.append(this.b);
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return woa.r(sb, this.g, "}");
    }
}
