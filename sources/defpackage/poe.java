package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class poe {
    public static final poe c = new poe(0, false);
    public final boolean a;
    public final int b;

    public poe(boolean z) {
        this.a = z;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poe)) {
            return false;
        }
        poe poeVar = (poe) obj;
        if (this.a == poeVar.a && this.b == poeVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) yb7.a(this.b)) + ')';
    }

    public poe(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
