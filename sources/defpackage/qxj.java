package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qxj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public qxj(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof qxj) && Intrinsics.areEqual(((qxj) obj).a, this.a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
