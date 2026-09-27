package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface k6c {
    void d();

    void e(y6c y6cVar, Handler handler);

    void f(int i, kf5 kf5Var, long j, int i2);

    void flush();

    void g(int i);

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void h(Surface surface);

    void j(int i);

    void m(long j, int i, int i2, int i3);

    void n(int i, long j);

    int o();

    int p(MediaCodec.BufferInfo bufferInfo);

    void release();

    void setParameters(Bundle bundle);

    default boolean u(q96 q96Var) {
        return false;
    }
}
