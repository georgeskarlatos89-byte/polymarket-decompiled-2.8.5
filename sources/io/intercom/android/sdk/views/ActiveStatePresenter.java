package io.intercom.android.sdk.views;

import android.content.Context;
import android.view.View;
import defpackage.d55;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BackgroundUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ActiveStatePresenter {
    private static final String ENGLISH_LOCALE = "en";

    public void presentStateDot(boolean z, View view, AppConfig appConfig) {
        int i;
        if (!ENGLISH_LOCALE.equals(appConfig.getLocale())) {
            view.setBackgroundResource(0);
            return;
        }
        Context context = view.getContext();
        if (z) {
            i = R.color.intercom_active_state;
        } else {
            i = R.color.intercom_away_state;
        }
        BackgroundUtils.setBackground(view, new ActiveStateDrawable(d55.d(context, i), d55.d(view.getContext(), R.color.intercom_white), view.getResources().getDisplayMetrics().density * 1.0f));
    }
}
