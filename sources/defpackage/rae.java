package defpackage;

import com.stripe.android.model.LinkBrand;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rae extends uae {
    public final LinkBrand a;
    public final tae b;

    public rae(LinkBrand linkBrand) {
        linkBrand.getClass();
        this.a = linkBrand;
        this.b = tae.Link;
    }

    @Override // defpackage.uae
    public final tae a() {
        return this.b;
    }

    @Override // defpackage.uae
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rae) && this.a == ((rae) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Link(linkBrand=" + this.a + ")";
    }
}
