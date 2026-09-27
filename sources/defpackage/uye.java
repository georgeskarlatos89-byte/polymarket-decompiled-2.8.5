package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class uye {
    public final String a;
    public final boolean b;

    public uye(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uye) {
                uye uyeVar = (uye) obj;
                if (!Intrinsics.areEqual(this.a, uyeVar.a) || this.b != uyeVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PositionShareCardArtSource(url=" + this.a + ", isContained=" + this.b + ")";
    }
}
