package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class olj implements qlj {
    public final String a;
    public final String b;
    public final c8i c;

    public olj(String str, String str2, c8i c8iVar) {
        this.a = str;
        this.b = str2;
        this.c = c8iVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof olj) {
                olj oljVar = (olj) obj;
                if (!Intrinsics.areEqual(this.a, oljVar.a) || !Intrinsics.areEqual(this.b, oljVar.b) || !Intrinsics.areEqual(this.c, oljVar.c)) {
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
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        c8i c8iVar = this.c;
        if (c8iVar != null) {
            i = c8iVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("Finished(result=", this.a, ", linkAccountSessionId=", this.b, ", intent=");
        r.append(this.c);
        r.append(")");
        return r.toString();
    }
}
