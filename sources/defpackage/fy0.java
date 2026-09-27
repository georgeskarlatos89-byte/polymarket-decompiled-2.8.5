package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fy0 {
    public final eei a;

    public fy0(eei eeiVar) {
        this.a = eeiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof fy0) && this.a == ((fy0) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.a + "}";
    }
}
