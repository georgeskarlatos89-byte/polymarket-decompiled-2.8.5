package com.auth0.android.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.bi4;
import defpackage.chk;
import defpackage.dh5;
import defpackage.eh5;
import defpackage.fh5;
import defpackage.lfj;
import defpackage.mfj;
import defpackage.nhk;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/auth0/android/provider/AuthenticationActivity;", "Landroid/app/Activity;", "<init>", "()V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class AuthenticationActivity extends Activity {
    public static final /* synthetic */ int c = 0;
    public boolean a;
    public eh5 b;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            intent = new Intent();
        }
        chk.a(intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", false);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        eh5 eh5Var = this.b;
        if (eh5Var != null) {
            Context context = (Context) eh5Var.b.get();
            if (eh5Var.h && context != null) {
                context.unbindService(eh5Var);
                eh5Var.h = false;
            }
            mfj mfjVar = eh5Var.f;
            if (!mfjVar.b) {
                lfj lfjVar = (lfj) mfjVar.e;
                if (lfjVar != null) {
                    ((AuthenticationActivity) mfjVar.c).unbindService(lfjVar);
                }
                mfjVar.c = null;
                mfjVar.b = true;
            }
            this.b = null;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (!this.a && intent.getExtras() == null) {
            finish();
            return;
        }
        if (!this.a) {
            this.a = true;
            Bundle extras = getIntent().getExtras();
            extras.getClass();
            Uri uri = (Uri) extras.getParcelable("com.auth0.android.EXTRA_AUTHORIZE_URI");
            Parcelable parcelable = extras.getParcelable("com.auth0.android.EXTRA_CT_OPTIONS");
            parcelable.getClass();
            boolean z = extras.getBoolean("com.auth0.android.EXTRA_LAUNCH_AS_TWA", false);
            eh5 eh5Var = new eh5(this, (fh5) parcelable, new mfj(this));
            this.b = eh5Var;
            eh5Var.b();
            eh5 eh5Var2 = this.b;
            eh5Var2.getClass();
            uri.getClass();
            bi4 r = bi4.b.r();
            nhk nhkVar = new nhk(this, 12);
            Context context = (Context) eh5Var2.b.get();
            if (context == null) {
                return;
            }
            ((Executor) r.a.b).execute(new dh5(eh5Var2, z, context, uri, r, nhkVar));
            return;
        }
        if (intent.getData() == null) {
            setResult(0);
        }
        chk.a(intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", this.a);
    }
}
