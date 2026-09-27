package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class zx5 extends up1 {
    public el8 c;
    public final kf5 d = new kf5();
    public ByteBuffer e;
    public boolean f;
    public long g;
    public ByteBuffer h;
    public final int i;

    static {
        k7c.a("media3.decoder");
    }

    public zx5(int i) {
        this.i = i;
    }

    public final void A() {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public void x() {
        this.b = 0;
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f = false;
    }

    public final ByteBuffer y(int i) {
        int capacity;
        int i2 = this.i;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException(m51.j(capacity, "Buffer too small (", i, " < ", ")"));
    }

    public final void z(int i) {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null) {
            this.e = y(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.e = byteBuffer;
            return;
        }
        ByteBuffer y = y(i2);
        y.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            y.put(byteBuffer);
        }
        this.e = y;
    }
}
