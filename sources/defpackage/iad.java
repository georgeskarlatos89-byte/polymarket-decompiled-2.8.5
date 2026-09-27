package defpackage;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iad {
    public final String a;
    public String b;
    public String c;

    public iad(String str) {
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        str.getClass();
        this.a = str;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }
}
