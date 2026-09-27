package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class a4k {
    static {
        csb.b(a4k.class);
    }

    public static int a(int i) {
        int i2 = 0;
        for (int i3 = 28; i3 >= 0; i3 -= 7) {
            if ((i >> i3) != 0 || i3 == 0) {
                i2++;
            }
        }
        return i2;
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.position() - position < 5) {
                byte b = byteBuffer.get();
                int i2 = i + (b & Byte.MAX_VALUE);
                if ((b & 128) == 0) {
                    return i2;
                }
                if (i2 <= 16777215) {
                    i = i2 << 7;
                } else {
                    throw new Exception("Value too large to fit in an int");
                }
            } else {
                throw new Exception("Data too long for a 32-bit int");
            }
        }
        throw new Exception();
    }

    public static long c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        long j = 0;
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.position() - position < 10) {
                long j2 = j + (r5 & Byte.MAX_VALUE);
                if ((byteBuffer.get() & 128) == 0) {
                    if (j2 < 0) {
                        new Exception().printStackTrace();
                    }
                    return j2;
                }
                if (j2 <= 72057594037927935L) {
                    j = j2 << 7;
                } else {
                    throw new Exception("Value too large to fit in an int");
                }
            } else {
                throw new Exception("Data too long for a 64-bit int");
            }
        }
        throw new Exception();
    }
}
