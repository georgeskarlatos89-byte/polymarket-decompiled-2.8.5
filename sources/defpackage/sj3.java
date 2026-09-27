package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class sj3 {
    public final String a;
    public final char b;
    public final int c;

    public sj3(String str, int i, char c) {
        str.getClass();
        this.a = str;
        this.b = c;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj3)) {
            return false;
        }
        sj3 sj3Var = (sj3) obj;
        if (Intrinsics.areEqual(this.a, sj3Var.a) && this.b == sj3Var.b && this.c == sj3Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((Character.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharacterBlock(id=");
        sb.append(this.a);
        sb.append(", character=");
        sb.append(this.b);
        sb.append(", index=");
        return ix2.i(this.c, ")", sb);
    }
}
