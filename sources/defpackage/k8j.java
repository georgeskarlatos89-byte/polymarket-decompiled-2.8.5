package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k8j {
    public final boolean a;
    public final String b;
    public final p8j c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k8j(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2;
        boolean z3;
        char c = 0;
        int i4 = 1;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bArr2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        pfn.b(z2 ^ z3);
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    q7m.g("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.c = new p8j(i4, i2, i3, bArr);
    }
}
