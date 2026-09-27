package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mnb extends ey3 {
    public static final mnb b = new ey3(true);
    public static final mnb c = new ey3(false);

    public final boolean equals(Object obj) {
        if ((obj instanceof mnb) && this.a == ((mnb) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hdi.t(new StringBuilder("NotLoading(endOfPaginationReached="), this.a, ')');
    }
}
