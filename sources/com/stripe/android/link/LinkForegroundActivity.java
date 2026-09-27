package com.stripe.android.link;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.bw4;
import defpackage.gf0;
import defpackage.m64;
import defpackage.vo0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/link/LinkForegroundActivity;", "Lgf0;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkForegroundActivity extends gf0 {
    public static final /* synthetic */ int b = 0;
    public boolean a;

    @Override // androidx.fragment.app.t, defpackage.pk4, defpackage.ok4, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (bundle != null) {
            z = bundle.getBoolean("LinkHasLaunchedPopup");
        } else {
            z = false;
        }
        this.a = z;
        Intent intent = getIntent();
        intent.getClass();
        if (Intrinsics.areEqual(intent.getAction(), "LinkForegroundActivity.redirect")) {
            setResult(49871, intent);
            finish();
        }
    }

    @Override // defpackage.pk4, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (Intrinsics.areEqual(intent.getAction(), "LinkForegroundActivity.redirect")) {
            setResult(49871, intent);
            finish();
        }
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        Uri uri;
        String string;
        super.onResume();
        if (!isFinishing()) {
            if (this.a) {
                setResult(0);
                finish();
                return;
            }
            this.a = true;
            Bundle extras = getIntent().getExtras();
            if (extras != null && (string = extras.getString("LinkPopupUrl")) != null) {
                uri = Uri.parse(string);
            } else {
                uri = null;
            }
            if (uri == null) {
                setResult(0);
                finish();
                return;
            }
            try {
                vo0 vo0Var = new vo0();
                vo0Var.r();
                bw4 i = vo0Var.i();
                String D = m64.D(this);
                if (D != null) {
                    ((Intent) i.b).setPackage(D);
                }
                i.n0(this, uri);
            } catch (ActivityNotFoundException e) {
                setResult(91367, new Intent().putExtra("LinkFailure", e));
                finish();
            } catch (SecurityException e2) {
                setResult(91367, new Intent().putExtra("LinkFailure", e2));
                finish();
            }
        }
    }

    @Override // defpackage.pk4, defpackage.ok4, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("LinkHasLaunchedPopup", this.a);
    }
}
