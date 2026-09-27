package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bqa extends iqa {
    public final byte a;

    public bqa(byte b) {
        this.a = b;
    }

    @Override // defpackage.iqa
    public final Object a() {
        return Byte.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bqa) && this.a == ((bqa) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }
}
