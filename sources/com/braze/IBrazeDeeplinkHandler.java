package com.braze;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.braze.ui.actions.UriAction;
import defpackage.qi9;
import defpackage.ue3;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/braze/IBrazeDeeplinkHandler;", "", "qi9", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IBrazeDeeplinkHandler {
    UriAction createUriActionFromUri(Uri uri, Bundle bundle, boolean z, ue3 ue3Var);

    UriAction createUriActionFromUrlString(String str, Bundle bundle, boolean z, ue3 ue3Var);

    int getIntentFlags(qi9 qi9Var);

    void gotoUri(Context context, UriAction uriAction);
}
