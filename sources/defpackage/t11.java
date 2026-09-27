package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t11 implements p11 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public t11(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final int a() {
        int i = this.a;
        if (i != 1935960438) {
            if (i != 1935963489) {
                if (i != 1937012852) {
                    q7m.g("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i));
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }

    @Override // defpackage.p11
    public final int getType() {
        return 1752331379;
    }
}
