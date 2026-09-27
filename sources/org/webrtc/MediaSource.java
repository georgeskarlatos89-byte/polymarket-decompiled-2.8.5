package org.webrtc;

import defpackage.dmk;
import org.webrtc.MediaSource;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class MediaSource {
    private long nativeSource;
    private final RefCountDelegate refCountDelegate;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaSource(final long j) {
        this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: v7c
            @Override // java.lang.Runnable
            public final void run() {
                MediaSource.a(j);
            }
        });
        this.nativeSource = j;
    }

    public static /* synthetic */ void a(long j) {
        lambda$new$0(j);
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource != 0) {
            return;
        }
        dmk.n("MediaSource has been disposed.");
    }

    private static /* synthetic */ void lambda$new$0(long j) {
        JniCommon.nativeReleaseRef(j);
    }

    private static native State nativeGetState(long j);

    public void dispose() {
        checkMediaSourceExists();
        this.refCountDelegate.release();
        this.nativeSource = 0L;
    }

    public long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
    }

    public void runWithReference(Runnable runnable) {
        if (this.refCountDelegate.safeRetain()) {
            try {
                runnable.run();
            } finally {
                this.refCountDelegate.release();
            }
        }
    }

    public State state() {
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }
}
