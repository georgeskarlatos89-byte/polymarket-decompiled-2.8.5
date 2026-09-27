package bo.app;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ac {
    public final zb a;
    public final zb b;

    public ac(zb zbVar, zb zbVar2) {
        zbVar.getClass();
        zbVar2.getClass();
        this.a = zbVar;
        this.b = zbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        if (this.a == acVar.a && this.b == acVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkLevelChangeEvent(oldNetworkLevel=" + this.a + ", newNetworkLevel=" + this.b + ')';
    }
}
