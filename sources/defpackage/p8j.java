package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p8j {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public p8j(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && p8j.class == obj.getClass()) {
                p8j p8jVar = (p8j) obj;
                if (this.a == p8jVar.a && this.c == p8jVar.c && this.d == p8jVar.d && Arrays.equals(this.b, p8jVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
