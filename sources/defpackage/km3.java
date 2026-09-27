package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class km3 implements mm3 {
    public final String a;
    public final wm3 b;

    public km3(String str, wm3 wm3Var) {
        str.getClass();
        this.a = str;
        this.b = wm3Var;
    }

    @Override // defpackage.mm3
    public final Function0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof km3) {
                km3 km3Var = (km3) obj;
                if (!Intrinsics.areEqual(this.a, km3Var.a) || !Intrinsics.areEqual(this.b, km3Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Emoji(emoji=" + this.a + ", onClick=" + this.b + ")";
    }
}
