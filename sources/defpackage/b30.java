package defpackage;

import android.app.Activity;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.graphics.ColorSpace;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.view.ViewConfiguration;
import android.window.BackEvent;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b30 {
    public static /* bridge */ /* synthetic */ float a(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static /* bridge */ /* synthetic */ int b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static /* bridge */ /* synthetic */ int c(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static /* bridge */ /* synthetic */ CreateCredentialException d(Throwable th) {
        return (CreateCredentialException) th;
    }

    public static /* bridge */ /* synthetic */ CreateCredentialResponse e(Object obj) {
        return (CreateCredentialResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Credential f(GetCredentialResponse getCredentialResponse) {
        return getCredentialResponse.getCredential();
    }

    public static /* bridge */ /* synthetic */ CredentialManager g(Object obj) {
        return (CredentialManager) obj;
    }

    public static /* bridge */ /* synthetic */ GetCredentialException h(Throwable th) {
        return (GetCredentialException) th;
    }

    public static /* bridge */ /* synthetic */ GetCredentialResponse i(Object obj) {
        return (GetCredentialResponse) obj;
    }

    public static /* bridge */ /* synthetic */ ColorSpace.Named j() {
        return ColorSpace.Named.BT2020_HLG;
    }

    public static /* bridge */ /* synthetic */ CameraCharacteristics.Key k() {
        return CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
    }

    public static /* bridge */ /* synthetic */ CaptureRequest.Key l() {
        return CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
    }

    public static /* bridge */ /* synthetic */ Bundle m(CreateCredentialResponse createCredentialResponse) {
        return createCredentialResponse.getData();
    }

    public static /* bridge */ /* synthetic */ Bundle n(Credential credential) {
        return credential.getData();
    }

    public static /* bridge */ /* synthetic */ Object o(o44 o44Var, Class cls) {
        return o44Var.get(cls);
    }

    public static /* bridge */ /* synthetic */ String p(CreateCredentialException createCredentialException) {
        return createCredentialException.getMessage();
    }

    public static /* bridge */ /* synthetic */ String q(Credential credential) {
        return credential.getType();
    }

    public static /* bridge */ /* synthetic */ String r(GetCredentialException getCredentialException) {
        return getCredentialException.getType();
    }

    public static /* bridge */ /* synthetic */ void s(Activity activity) {
        activity.overrideActivityTransition(1, R.anim.stripe_transition_fade_in, R.anim.stripe_transition_fade_out);
    }

    public static /* bridge */ /* synthetic */ float t(BackEvent backEvent) {
        return backEvent.getTouchY();
    }

    public static /* bridge */ /* synthetic */ int u(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static /* bridge */ /* synthetic */ ColorSpace.Named v() {
        return ColorSpace.Named.BT2020_PQ;
    }

    public static /* bridge */ /* synthetic */ String w(CreateCredentialException createCredentialException) {
        return createCredentialException.getType();
    }

    public static /* bridge */ /* synthetic */ String x(GetCredentialException getCredentialException) {
        return getCredentialException.getMessage();
    }

    public static /* bridge */ /* synthetic */ float y(BackEvent backEvent) {
        return backEvent.getProgress();
    }
}
