package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lnb extends ey3 {
    public static final lnb b = new ey3(false);

    public final boolean equals(Object obj) {
        if ((obj instanceof lnb) && this.a == ((lnb) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hdi.t(new StringBuilder("Loading(endOfPaginationReached="), this.a, ')');
    }
}
