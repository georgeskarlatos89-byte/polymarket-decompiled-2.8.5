package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class o6 {
    public static Context a(Context context, int i) {
        return context.createDeviceContext(i);
    }

    public static eb5 b(Intent intent) {
        CreateCredentialException createCredentialException = (CreateCredentialException) intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", CreateCredentialException.class);
        if (createCredentialException == null) {
            return null;
        }
        String type = createCredentialException.getType();
        type.getClass();
        return asn.b(createCredentialException.getMessage(), type);
    }

    public static mb5 c(Intent intent, String str) {
        CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", CreateCredentialResponse.class);
        if (createCredentialResponse == null) {
            return null;
        }
        Bundle data = createCredentialResponse.getData();
        data.getClass();
        return ysn.b(data, str);
    }

    public static gu8 d(Intent intent) {
        intent.getClass();
        GetCredentialException getCredentialException = (GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", GetCredentialException.class);
        if (getCredentialException == null) {
            return null;
        }
        String type = getCredentialException.getType();
        type.getClass();
        return asn.c(getCredentialException.getMessage(), type);
    }

    public static ku8 e(Intent intent) {
        intent.getClass();
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (getCredentialResponse == null) {
            return null;
        }
        Credential credential = getCredentialResponse.getCredential();
        credential.getClass();
        String type = credential.getType();
        type.getClass();
        Bundle data = credential.getData();
        data.getClass();
        return new ku8(ctn.b(data, type));
    }

    public static AccessibilityNodeInfo.AccessibilityAction f() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float g(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int j(Context context) {
        return context.getDeviceId();
    }

    public static int k(Context context) {
        return context.getDeviceId();
    }

    public static int[] l(wwi wwiVar, RectF rectF, int i, final y9 y9Var) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i == 1) {
            graphemeClusterSegmentFinder = new ld0(new ubk(3, wwiVar.f.getText(), wwiVar.j()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(wwiVar.f.getText(), wwiVar.a);
        }
        return wwiVar.f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: c30
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) y9.this.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static int m(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int n(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static boolean o(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }

    public static boolean p(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean q(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static void r(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void s(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void t(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static void u(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }
}
