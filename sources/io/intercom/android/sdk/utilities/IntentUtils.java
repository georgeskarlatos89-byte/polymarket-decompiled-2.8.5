package io.intercom.android.sdk.utilities;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class IntentUtils {
    private static final Twig twig = LumberMill.getLogger();

    public static void safelyOpenIntent(Context context, Intent intent) {
        intent.addCategory("android.intent.category.BROWSABLE");
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            twig.i("This device has no application that can handle the Uri passed in", new Object[0]);
        }
    }
}
