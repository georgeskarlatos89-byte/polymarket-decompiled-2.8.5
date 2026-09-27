package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qo9 extends ml8 {
    public final so9[] d;
    public final int e;
    public final int f;

    public qo9(to9 to9Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
        super(to9Var);
        this.d = new so9[]{new po9(i, byteBuffer), new po9(byteBuffer2, i), new po9(byteBuffer3, i)};
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.ml8, defpackage.to9
    public final int getHeight() {
        return this.f;
    }

    @Override // defpackage.ml8, defpackage.to9
    public final int getWidth() {
        return this.e;
    }

    @Override // defpackage.ml8, defpackage.to9
    public final so9[] h0() {
        return this.d;
    }
}
