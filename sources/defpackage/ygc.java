package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ygc extends zk9 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public ygc(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ygc.class == obj.getClass()) {
                ygc ygcVar = (ygc) obj;
                if (this.b == ygcVar.b && this.c == ygcVar.c && this.d == ygcVar.d && Arrays.equals(this.e, ygcVar.e) && Arrays.equals(this.f, ygcVar.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
