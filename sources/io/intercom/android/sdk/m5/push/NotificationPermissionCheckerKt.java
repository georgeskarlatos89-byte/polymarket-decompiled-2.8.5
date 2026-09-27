package io.intercom.android.sdk.m5.push;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.intercom.twig.Twig;
import defpackage.c1c;
import defpackage.d55;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a,\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\b\u001a\u00020\tH\u0000¨\u0006\r"}, d2 = {"showNotification", "", "context", "Landroid/content/Context;", "notificationId", "", "notification", "Landroid/app/Notification;", "twig", "Lcom/intercom/twig/Twig;", "showNotifications", "notifications", "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationPermissionCheckerKt {
    public static final void showNotification(Context context, int i, Notification notification, Twig twig) {
        context.getClass();
        notification.getClass();
        twig.getClass();
        showNotifications(context, c1c.b(new Pair(Integer.valueOf(i), notification)), twig);
    }

    public static final void showNotifications(Context context, Map<Integer, ? extends Notification> map, Twig twig) {
        context.getClass();
        map.getClass();
        twig.getClass();
        try {
            NotificationManagerCompat from = NotificationManagerCompat.from(context);
            if (Build.VERSION.SDK_INT >= 33 && d55.a(context, "android.permission.POST_NOTIFICATIONS") != 0) {
                return;
            }
            for (Map.Entry<Integer, ? extends Notification> entry : map.entrySet()) {
                from.b(null, entry.getKey().intValue(), entry.getValue());
            }
        } catch (NullPointerException e) {
            twig.w("Failed to show notifications due to unavailable NotificationManager service.", e);
        } catch (Exception e2) {
            twig.w("Failed to show notifications due to unexpected error.", e2);
        }
    }
}
