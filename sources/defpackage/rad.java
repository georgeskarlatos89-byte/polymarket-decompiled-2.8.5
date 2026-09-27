package defpackage;

import android.app.Notification;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class rad {
    public static Notification.BubbleMetadata a(sad sadVar) {
        boolean z;
        if (sadVar == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(sadVar.a, w3m.c(sadVar.b));
        Notification.BubbleMetadata.Builder deleteIntent = builder.setDeleteIntent(null);
        boolean z2 = true;
        if ((sadVar.d & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.BubbleMetadata.Builder autoExpandBubble = deleteIntent.setAutoExpandBubble(z);
        if ((sadVar.d & 2) == 0) {
            z2 = false;
        }
        autoExpandBubble.setSuppressNotification(z2);
        int i = sadVar.c;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        return builder.build();
    }
}
