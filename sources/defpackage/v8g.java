package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class v8g implements x8g {
    public final String a;
    public final int b;

    public v8g(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v8g) {
                v8g v8gVar = (v8g) obj;
                if (!Intrinsics.areEqual(this.a, v8gVar.a) || this.b != v8gVar.b) {
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
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Digit(key=" + this.a + ", digit=" + this.b + ")";
    }
}
