package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ys0 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final AudioManager.OnAudioFocusChangeListener b;

    public ys0(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        int i = u1k.a;
        this.a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        u1k.P(this.a, new kd0(this, i, 1));
    }
}
