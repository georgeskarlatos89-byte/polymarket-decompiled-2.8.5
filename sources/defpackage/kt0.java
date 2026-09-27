package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface kt0 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    void b(ByteBuffer byteBuffer);

    it0 c(it0 it0Var);

    void d();

    boolean e();

    void flush();

    boolean isActive();

    void reset();
}
