package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class g2l extends ww8 {
    @Override // defpackage.z81
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        if (queryLocalInterface instanceof j3l) {
            return (j3l) queryLocalInterface;
        }
        return new usk(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 1);
    }

    @Override // defpackage.z81
    public final gw7[] getApiFeatures() {
        return w2l.c;
    }

    @Override // defpackage.z81, defpackage.cd0
    public final int getMinApkVersion() {
        return 253600000;
    }

    @Override // defpackage.z81
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // defpackage.z81
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // defpackage.z81
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
