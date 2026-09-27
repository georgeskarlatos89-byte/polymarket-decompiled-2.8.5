package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gbh {
    public final String a;
    public final String b;
    public final bbh c;

    public gbh(String str, String str2, bbh bbhVar) {
        this.a = str;
        this.b = str2;
        this.c = bbhVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && gbh.class == obj.getClass()) {
                gbh gbhVar = (gbh) obj;
                if (Intrinsics.areEqual(this.a, gbhVar.a) && Intrinsics.areEqual(this.b, gbhVar.b) && this.c == gbhVar.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + hdi.g((hashCode + i) * 31, 31, false);
    }
}
