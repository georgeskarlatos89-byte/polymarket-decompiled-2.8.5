package defpackage;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class sal {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public static Intent a(Context context, p5n p5nVar) {
        Bundle bundle;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str = p5nVar.a;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (p5nVar.c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
            } catch (RemoteException | IllegalArgumentException e) {
                m0.p("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            if (acquireUnstableContentProviderClient != null) {
                try {
                    bundle = acquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle2);
                    acquireUnstableContentProviderClient.release();
                    if (bundle != null) {
                        Intent intent2 = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                StringBuilder sb = new StringBuilder(str.length() + 72);
                                sb.append("Dynamic lookup for intent failed for action ");
                                sb.append(str);
                                sb.append(" but has possible resolution");
                                m0.p("ServiceBindIntentUtils", sb.toString());
                                throw new z8l(new qw4(25, pendingIntent, null));
                            }
                        }
                    }
                    if (intent == null) {
                        m0.p("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
                    }
                } catch (Throwable th) {
                    acquireUnstableContentProviderClient.release();
                    throw th;
                }
            } else {
                throw new RemoteException("Failed to acquire ContentProviderClient");
            }
        }
        if (intent == null) {
            return new Intent(str).setPackage(p5nVar.b);
        }
        return intent;
    }
}
