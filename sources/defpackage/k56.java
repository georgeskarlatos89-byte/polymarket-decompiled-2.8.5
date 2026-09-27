package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k56 implements m56, bld {
    public final ByteBuffer a;

    public k56() {
        this.a = ByteBuffer.allocate(4);
    }

    @Override // defpackage.m56
    public int a() {
        return d() | (d() << 8);
    }

    @Override // defpackage.bld
    public void b(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putInt(num.intValue()).array());
        }
    }

    @Override // defpackage.m56
    public int c(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.a;
        int min = Math.min(i, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // defpackage.m56
    public short d() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP);
        }
        throw new l56();
    }

    @Override // defpackage.m56
    public long skip(long j) {
        ByteBuffer byteBuffer = this.a;
        int min = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    public k56(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
