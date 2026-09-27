package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m3k {
    public final String a;
    public final Object b;

    public m3k(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m3k) {
                m3k m3kVar = (m3k) obj;
                if (!Intrinsics.areEqual(this.a, m3kVar.a) || !Intrinsics.areEqual(this.b, m3kVar.b)) {
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
        int hashCode2 = this.a.hashCode() * 31;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValueElement(name=");
        sb.append(this.a);
        sb.append(", value=");
        return woa.q(sb, this.b, ')');
    }
}
