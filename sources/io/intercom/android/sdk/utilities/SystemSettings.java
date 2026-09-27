package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.provider.Settings;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class SystemSettings {
    private static final Twig twig = LumberMill.getLogger();

    public static float getTransitionScale(Context context) {
        try {
            return Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale");
        } catch (Exception e) {
            twig.internal("Couldn't get animation scale: " + e.getMessage());
            return 1.0f;
        }
    }
}
