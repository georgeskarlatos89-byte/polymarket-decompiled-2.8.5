package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nr8 {
    public int a;

    public nr8(int i) {
        this.a = i;
    }

    public final boolean a() {
        if (this.a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return ix2.i(this.a, " }", sb);
    }
}
