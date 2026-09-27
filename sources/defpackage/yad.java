package defpackage;

import android.app.Notification;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class yad {
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addMessage(message);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        return messagingStyle.setConversationTitle(charSequence);
    }
}
