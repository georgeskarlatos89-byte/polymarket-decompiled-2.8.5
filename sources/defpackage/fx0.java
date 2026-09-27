package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fx0 {
    public final String a;
    public final String b;
    public final String c;
    public final ly0 d;
    public final a0a e;

    public fx0(String str, String str2, String str3, ly0 ly0Var, a0a a0aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ly0Var;
        this.e = a0aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fx0) {
            fx0 fx0Var = (fx0) obj;
            String str = fx0Var.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = fx0Var.b;
                String str4 = this.b;
                if (str4 != null ? str4.equals(str3) : str3 == null) {
                    String str5 = fx0Var.c;
                    String str6 = this.c;
                    if (str6 != null ? str6.equals(str5) : str5 == null) {
                        ly0 ly0Var = fx0Var.d;
                        ly0 ly0Var2 = this.d;
                        if (ly0Var2 != null ? ly0Var2.equals(ly0Var) : ly0Var == null) {
                            a0a a0aVar = fx0Var.e;
                            a0a a0aVar2 = this.e;
                            if (a0aVar2 != null ? a0aVar2.equals(a0aVar) : a0aVar == null) {
                                return true;
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
        int hashCode4;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        ly0 ly0Var = this.d;
        if (ly0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = ly0Var.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        a0a a0aVar = this.e;
        if (a0aVar != null) {
            i = a0aVar.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
