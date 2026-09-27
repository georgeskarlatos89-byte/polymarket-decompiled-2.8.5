package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailability;
import defpackage.arn;
import defpackage.ex8;
import defpackage.ix2;
import defpackage.p3l;
import defpackage.qw4;
import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int b = 0;
    public int a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                ex8 e = ex8.e(this);
                if (i2 != -1) {
                    if (i2 == 0) {
                        e.j(new qw4(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    p3l p3lVar = e.n;
                    p3lVar.sendMessage(p3lVar.obtainMessage(3));
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                m0.d("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                m0.d("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent != null) {
                try {
                    googleApiActivity = this;
                    try {
                        googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        googleApiActivity.a = 1;
                    } catch (ActivityNotFoundException e) {
                        e = e;
                        ActivityNotFoundException activityNotFoundException = e;
                        if (extras.getBoolean("notify_manager", true)) {
                            ex8.e(googleApiActivity).j(new qw4(22, null, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String obj = pendingIntent.toString();
                            String p = ix2.p(new StringBuilder(obj.length() + 36), "Activity not found while launching ", obj, ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                p = p.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            m0.e("GoogleApiActivity", p, activityNotFoundException);
                        }
                        googleApiActivity.a = 1;
                        googleApiActivity.finish();
                    } catch (IntentSender.SendIntentException e2) {
                        e = e2;
                        m0.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                        googleApiActivity.finish();
                    }
                } catch (ActivityNotFoundException e3) {
                    e = e3;
                    googleApiActivity = this;
                } catch (IntentSender.SendIntentException e4) {
                    e = e4;
                    googleApiActivity = this;
                }
            } else {
                arn.h(num);
                GoogleApiAvailability.e.c(this, num.intValue(), this);
                this.a = 1;
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }
}
