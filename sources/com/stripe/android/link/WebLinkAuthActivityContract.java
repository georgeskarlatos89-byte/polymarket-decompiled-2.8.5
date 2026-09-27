package com.stripe.android.link;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.din;
import defpackage.ga;
import defpackage.jhk;
import defpackage.khk;
import defpackage.lhk;
import io.intercom.android.sdk.NotificationStatuses;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/link/WebLinkAuthActivityContract;", "Lga;", "", "Lmhk;", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebLinkAuthActivityContract extends ga {
    public static final WebLinkAuthActivityContract a = new Object();

    @Override // defpackage.ga
    public final Intent createIntent(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        int i = LinkForegroundActivity.b;
        Intent putExtra = new Intent(context, (Class<?>) LinkForegroundActivity.class).putExtra("LinkPopupUrl", str);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.ga
    public final Object parseResult(int i, Intent intent) {
        Uri data;
        String queryParameter;
        Exception exc;
        Bundle extras;
        if (i != 0) {
            if (i != 49871) {
                if (i == 91367) {
                    if (intent != null && (extras = intent.getExtras()) != null) {
                        exc = (Exception) din.d(extras, "LinkFailure", Exception.class);
                    } else {
                        exc = null;
                    }
                    if (exc != null) {
                        return new lhk(exc);
                    }
                }
            } else if (intent != null && (data = intent.getData()) != null && (queryParameter = data.getQueryParameter("link_status")) != null && queryParameter.hashCode() == -599445191 && queryParameter.equals(NotificationStatuses.COMPLETE_STATUS)) {
                return khk.a;
            }
        }
        return jhk.a;
    }
}
