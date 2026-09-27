package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class it5 {
    public final String a;
    public final char b;
    public final String c;

    public it5(String str, char c) {
        this.a = str;
        this.b = c;
        this.c = e.s(str, String.valueOf(c), "");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof it5) {
                it5 it5Var = (it5) obj;
                if (!Intrinsics.areEqual(this.a, it5Var.a) || this.b != it5Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.a + ", delimiter=" + this.b + ')';
    }
}
