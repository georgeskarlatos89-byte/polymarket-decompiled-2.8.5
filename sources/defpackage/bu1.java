package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bu1 implements meh {
    public final ByteBuffer a;
    public final int b;

    public bu1(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        this.a = slice;
        this.b = slice.capacity();
    }

    @Override // defpackage.meh
    public final long read(tp1 tp1Var, long j) {
        ByteBuffer byteBuffer = this.a;
        int position = byteBuffer.position();
        int i = this.b;
        if (position == i) {
            return -1L;
        }
        int position2 = (int) (byteBuffer.position() + j);
        if (position2 <= i) {
            i = position2;
        }
        byteBuffer.limit(i);
        return tp1Var.write(byteBuffer);
    }

    @Override // defpackage.meh
    public final b3j timeout() {
        return b3j.NONE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
