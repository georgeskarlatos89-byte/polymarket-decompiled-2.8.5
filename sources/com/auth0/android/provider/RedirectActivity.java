package com.auth0.android.provider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/auth0/android/provider/RedirectActivity;", "Landroid/app/Activity;", "<init>", "()V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) AuthenticationActivity.class);
        intent.addFlags(603979776);
        if (getIntent() != null) {
            intent.setData(getIntent().getData());
        }
        startActivity(intent);
        finish();
    }
}
