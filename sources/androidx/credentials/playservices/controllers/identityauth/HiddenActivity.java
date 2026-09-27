package androidx.credentials.playservices.controllers.identityauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.td5;
import defpackage.zd5;
import io.sentry.android.core.m0;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class HiddenActivity extends Activity {
    public ResultReceiver a;
    public boolean b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        td5 td5Var = zd5.a;
        td5.c(resultReceiver, str, str2);
        finish();
    }

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
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (!this.b) {
            if (stringExtra == null) {
                m0.p("HiddenActivity", "Activity handed an unsupported type");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("EXTRA_FLOW_PENDING_INTENT");
            int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
            if (pendingIntent != null) {
                try {
                    this.b = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), intExtra, null, 0, 0, 0, null);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    switch (stringExtra.hashCode()) {
                        case -441061071:
                            if (stringExtra.equals("BEGIN_SIGN_IN")) {
                                ResultReceiver resultReceiver2 = this.a;
                                resultReceiver2.getClass();
                                a(resultReceiver2, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e.getMessage());
                                return;
                            }
                            return;
                        case 15545322:
                            if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                                ResultReceiver resultReceiver3 = this.a;
                                resultReceiver3.getClass();
                                a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e.getMessage());
                                return;
                            }
                            return;
                        case 1246634622:
                            if (stringExtra.equals("CREATE_PASSWORD")) {
                                ResultReceiver resultReceiver4 = this.a;
                                resultReceiver4.getClass();
                                a(resultReceiver4, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e.getMessage());
                                return;
                            }
                            return;
                        case 1980564212:
                            if (stringExtra.equals("SIGN_IN_INTENT")) {
                                ResultReceiver resultReceiver5 = this.a;
                                resultReceiver5.getClass();
                                a(resultReceiver5, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e.getMessage());
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (!stringExtra.equals("BEGIN_SIGN_IN")) {
                        return;
                    }
                    ResultReceiver resultReceiver6 = this.a;
                    resultReceiver6.getClass();
                    a(resultReceiver6, "GET_UNKNOWN", "internal error during the begin sign in operation");
                    return;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        ResultReceiver resultReceiver7 = this.a;
                        resultReceiver7.getClass();
                        a(resultReceiver7, "CREATE_UNKNOWN", "internal error during public key credential creation");
                        return;
                    }
                    return;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        ResultReceiver resultReceiver8 = this.a;
                        resultReceiver8.getClass();
                        a(resultReceiver8, "CREATE_UNKNOWN", "internal error during password creation");
                        return;
                    }
                    return;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        ResultReceiver resultReceiver9 = this.a;
                        resultReceiver9.getClass();
                        a(resultReceiver9, "GET_UNKNOWN", "internal error during the sign-in intent operation");
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.b);
        super.onSaveInstanceState(bundle);
    }
}
