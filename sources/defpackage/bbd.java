package defpackage;

import android.app.Notification;
import android.net.Uri;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class bbd {
    public static Notification.MessagingStyle.Message a(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
