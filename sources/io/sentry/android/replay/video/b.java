package io.sentry.android.replay.video;

import android.media.MediaMuxer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b {
    public final long a;
    public final MediaMuxer b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public b(String str, float f) {
        str.getClass();
        this.a = 1000000.0f / f;
        this.b = new MediaMuxer(str, 0);
    }

    public final void a() {
        boolean z = this.c;
        MediaMuxer mediaMuxer = this.b;
        if (z && this.e > 0) {
            mediaMuxer.stop();
        }
        mediaMuxer.release();
    }
}
