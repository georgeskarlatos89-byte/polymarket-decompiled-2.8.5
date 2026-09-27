package defpackage;

import com.polymarket.designtokens.Icon;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ibf {
    public final Icon a;
    public final long b;

    public ibf(long j, Icon icon) {
        icon.getClass();
        this.a = icon;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ibf) {
            ibf ibfVar = (ibf) obj;
            if (this.a == ibfVar.a && this.b == ibfVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoBannerIllustration(icon=" + this.a + ", size=" + ky6.c(this.b) + ")";
    }
}
