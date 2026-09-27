package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lu29;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "hcaptcha_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class u29 extends Exception {
    public final t29 a;
    public final String b;

    public u29(t29 t29Var, String str) {
        t29Var.getClass();
        this.a = t29Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u29)) {
            return false;
        }
        u29 u29Var = (u29) obj;
        if (this.a == u29Var.a && Intrinsics.areEqual(this.b, u29Var.b)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.b;
        if (str == null) {
            return this.a.c();
        }
        return str;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "HCaptchaException(hCaptchaError=" + this.a + ", hCaptchaMessage=" + this.b + ")";
    }
}
