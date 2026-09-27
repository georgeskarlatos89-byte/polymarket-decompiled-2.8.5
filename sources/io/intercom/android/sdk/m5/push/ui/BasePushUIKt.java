package io.intercom.android.sdk.m5.push.ui;

import android.content.Context;
import defpackage.tad;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "context", "", "contentTitle", "contentText", "Lio/intercom/android/sdk/m5/push/NotificationChannel;", "notificationChannel", "Ltad;", "createBaseNotificationBuilder", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/push/NotificationChannel;)Ltad;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BasePushUIKt {
    public static final tad createBaseNotificationBuilder(Context context, String str, String str2, NotificationChannel notificationChannel) {
        context.getClass();
        str.getClass();
        str2.getClass();
        notificationChannel.getClass();
        tad tadVar = new tad(context, notificationChannel.getChannelName());
        tadVar.e = tad.b(str);
        tadVar.f = tad.b(str2);
        tadVar.C.icon = R.drawable.intercom_push_icon;
        tadVar.c(16, true);
        return tadVar;
    }
}
