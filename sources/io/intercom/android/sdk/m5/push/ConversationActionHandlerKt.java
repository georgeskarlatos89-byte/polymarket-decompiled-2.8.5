package io.intercom.android.sdk.m5.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.mad;
import defpackage.nad;
import io.intercom.android.sdk.R;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "context", "", "url", "Lnad;", "buildContextualAction", "(Landroid/content/Context;Ljava/lang/String;)Lnad;", "Landroid/app/PendingIntent;", "getAttachmentIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConversationActionHandlerKt {
    public static final nad buildContextualAction(Context context, String str) {
        context.getClass();
        str.getClass();
        int i = R.drawable.intercom_ic_attachment;
        PorterDuff.Mode mode = IconCompat.k;
        mad madVar = new mad(IconCompat.b(context.getResources(), context.getPackageName(), i), "Open Attachment", getAttachmentIntent(context, str), new Bundle());
        madVar.d = true;
        return madVar.a();
    }

    private static final PendingIntent getAttachmentIntent(Context context, String str) {
        int hashCode = str.hashCode();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        PendingIntent activity = PendingIntent.getActivity(context, hashCode, intent, 201326592);
        activity.getClass();
        return activity;
    }
}
