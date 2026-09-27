package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tg9 {
    public static final tg9 d = new tg9("HTTP", 2, 0);
    public static final tg9 e = new tg9("HTTP", 1, 1);
    public static final tg9 f = new tg9("HTTP", 1, 0);
    public static final tg9 g = new tg9("SPDY", 3, 0);
    public static final tg9 h = new tg9("QUIC", 1, 0);
    public final String a;
    public final int b;
    public final int c;

    public tg9(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tg9) {
                tg9 tg9Var = (tg9) obj;
                if (!Intrinsics.areEqual(this.a, tg9Var.a) || this.b != tg9Var.b || this.c != tg9Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + woa.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.a + '/' + this.b + '.' + this.c;
    }
}
