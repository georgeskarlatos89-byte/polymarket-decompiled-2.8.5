package defpackage;

import com.polymarket.designtokens.Icon;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ish implements jsh {
    public final Icon a;

    public ish(Icon icon) {
        icon.getClass();
        this.a = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ish) && this.a == ((ish) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TrailingIcon(icon=" + this.a + ")";
    }
}
