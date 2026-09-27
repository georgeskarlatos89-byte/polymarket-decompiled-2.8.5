package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eh9 {
    public final String a;
    public final kh9 b;

    public eh9(String str, kh9 kh9Var) {
        this.a = str;
        this.b = kh9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof eh9) {
                eh9 eh9Var = (eh9) obj;
                if (!Intrinsics.areEqual(this.a, eh9Var.a) || !Intrinsics.areEqual(this.b, eh9Var.b)) {
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
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "HttpResponse(body=" + this.a + ", timing=" + this.b + ")";
    }
}
