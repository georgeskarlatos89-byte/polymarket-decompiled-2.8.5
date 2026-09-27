package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class jxb {
    public final String a;
    public final Object b;

    public jxb(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jxb) {
                jxb jxbVar = (jxb) obj;
                if (!Intrinsics.areEqual(this.a, jxbVar.a) || !Intrinsics.areEqual(this.b, jxbVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LyricistState(languageTag=");
        sb.append(this.a);
        sb.append(", strings=");
        return woa.q(sb, this.b, ')');
    }
}
