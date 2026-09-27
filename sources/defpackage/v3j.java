package defpackage;

import com.appsflyer.internal.l;
import java.nio.ByteBuffer;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v3j extends i81 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void k(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.kt0
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer j;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 21) {
            if (i3 != 22) {
                if (i3 != 1342177280) {
                    if (i3 == 1610612736) {
                        j = j(i2);
                        while (position < limit) {
                            k((byteBuffer.get(position + 3) & MessagePack.Code.EXT_TIMESTAMP) | ((byteBuffer.get(position + 2) & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((byteBuffer.get(position + 1) & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((byteBuffer.get(position) & MessagePack.Code.EXT_TIMESTAMP) << 24), j);
                            position += 4;
                        }
                    } else {
                        l.o();
                        return;
                    }
                } else {
                    j = j((i2 / 3) * 4);
                    while (position < limit) {
                        k(((byteBuffer.get(position + 2) & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((byteBuffer.get(position + 1) & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((byteBuffer.get(position) & MessagePack.Code.EXT_TIMESTAMP) << 24), j);
                        position += 3;
                    }
                }
            } else {
                j = j(i2);
                while (position < limit) {
                    k((byteBuffer.get(position) & MessagePack.Code.EXT_TIMESTAMP) | ((byteBuffer.get(position + 1) & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((byteBuffer.get(position + 2) & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((byteBuffer.get(position + 3) & MessagePack.Code.EXT_TIMESTAMP) << 24), j);
                    position += 4;
                }
            }
        } else {
            j = j((i2 / 3) * 4);
            while (position < limit) {
                k(((byteBuffer.get(position) & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((byteBuffer.get(position + 1) & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((byteBuffer.get(position + 2) & MessagePack.Code.EXT_TIMESTAMP) << 24), j);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j.flip();
    }

    @Override // defpackage.i81
    public final it0 f(it0 it0Var) {
        int i2 = it0Var.c;
        if (i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736 && i2 != 4) {
            throw new jt0(it0Var);
        }
        if (i2 != 4) {
            return new it0(it0Var.a, it0Var.b, 4);
        }
        return it0.e;
    }
}
