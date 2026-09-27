package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class z3l extends ww8 {
    public final Bundle a;

    public z3l(Context context, Looper looper, r64 r64Var, gw4 gw4Var, eid eidVar) {
        super(context, looper, 212, r64Var, gw4Var, eidVar);
        this.a = new Bundle();
    }

    @Override // defpackage.z81
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof q4l) {
            return (q4l) queryLocalInterface;
        }
        return new usk(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 2);
    }

    @Override // defpackage.z81
    public final gw7[] getApiFeatures() {
        return a4l.c;
    }

    @Override // defpackage.z81
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.a;
    }

    @Override // defpackage.z81, defpackage.cd0
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // defpackage.z81
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // defpackage.z81
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // defpackage.z81
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // defpackage.z81
    public final boolean usesClientTelemetry() {
        return true;
    }
}
