package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class po9 implements so9 {
    public final /* synthetic */ int a = 0;
    public final ByteBuffer b;
    public final int c;

    public po9(int i, ByteBuffer byteBuffer) {
        this.c = i;
        this.b = byteBuffer;
    }

    @Override // defpackage.so9
    public final ByteBuffer c() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // defpackage.so9
    public final int d() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // defpackage.so9
    public final int e() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }

    public po9(ByteBuffer byteBuffer, int i) {
        this.b = byteBuffer;
        this.c = i;
    }
}
