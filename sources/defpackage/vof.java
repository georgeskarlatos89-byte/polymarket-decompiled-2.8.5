package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vof extends vc0 {
    public final int a;
    public final int b;
    public final String c;
    public final byte d;
    public final byte e;

    public vof(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = m51.j(i2, "readRecord(sfi=", i, ", number=", ")");
        this.d = (byte) i;
        this.e = (byte) ((i2 << 3) | 4);
    }

    @Override // defpackage.vc0
    public final byte a() {
        return (byte) 0;
    }

    @Override // defpackage.vc0
    public final byte[] b() {
        return null;
    }

    @Override // defpackage.vc0
    public final byte c() {
        return this.d;
    }

    @Override // defpackage.vc0
    public final byte d() {
        return (byte) -78;
    }

    @Override // defpackage.vc0
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vof)) {
            return false;
        }
        vof vofVar = (vof) obj;
        if (this.a == vofVar.a && this.b == vofVar.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vc0
    public final byte f() {
        return this.e;
    }

    @Override // defpackage.vc0
    public final Object g(Map map) {
        map.getClass();
        return map;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return m51.j(this.a, "ReadRecordCommand(recordNumber=", this.b, ", shortFileIdentifier=", ")");
    }
}
