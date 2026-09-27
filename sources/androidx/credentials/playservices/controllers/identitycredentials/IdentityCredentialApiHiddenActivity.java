package androidx.credentials.playservices.controllers.identitycredentials;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.td5;
import defpackage.zd5;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/IdentityCredentialApiHiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class IdentityCredentialApiHiddenActivity extends Activity {
    public ResultReceiver a;
    public boolean b;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            td5 td5Var = zd5.a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("FAILURE_RESPONSE", false);
            bundle.putInt("ACTIVITY_REQUEST_CODE", i);
            bundle.putParcelable("RESULT_DATA", intent);
            resultReceiver.send(i2, bundle);
        }
        this.b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        String stringExtra = getIntent().getStringExtra("EXTRA_ERROR_NAME");
        if (stringExtra == null) {
            finish();
            return;
        }
        if (bundle != null) {
            this.b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.b) {
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("EXTRA_FLOW_PENDING_INTENT");
        if (pendingIntent != null) {
            this.b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), zd5.c, null, 0, 0, 0, null);
            return;
        }
        ResultReceiver resultReceiver2 = this.a;
        if (resultReceiver2 != null) {
            td5 td5Var = zd5.a;
            td5.c(resultReceiver2, stringExtra, "Internal error");
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.b);
        super.onSaveInstanceState(bundle);
    }
}
