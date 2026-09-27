package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class opm extends ckm {
    public final byte[] i;

    public opm(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.i = bArr;
    }

    @Override // defpackage.ckm
    public final byte[] R() {
        return this.i;
    }
}
