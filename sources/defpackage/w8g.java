package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class w8g implements x8g {
    public final String a;
    public final char b;

    public w8g(String str, char c) {
        this.a = str;
        this.b = c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w8g) {
                w8g w8gVar = (w8g) obj;
                if (!Intrinsics.areEqual(this.a, w8gVar.a) || this.b != w8gVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.x8g
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Symbol(key=" + this.a + ", char=" + this.b + ")";
    }
}
