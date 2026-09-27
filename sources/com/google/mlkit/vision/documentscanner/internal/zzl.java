package com.google.mlkit.vision.documentscanner.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import defpackage.eid;
import defpackage.gw4;
import defpackage.gw7;
import defpackage.jwn;
import defpackage.lwn;
import defpackage.nwn;
import defpackage.r64;
import defpackage.ww8;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzl extends ww8 {
    public zzl(Context context, Looper looper, r64 r64Var, gw4 gw4Var, eid eidVar) {
        super(context, looper, 362, r64Var, gw4Var, eidVar);
    }

    @Override // defpackage.z81
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i = lwn.f;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService");
        if (queryLocalInterface instanceof nwn) {
            return (nwn) queryLocalInterface;
        }
        return new jwn(iBinder);
    }

    @Override // defpackage.z81
    public final gw7[] getApiFeatures() {
        return new gw7[]{OptionalModuleUtils.FEATURE_DOCSCAN_UI};
    }

    @Override // defpackage.z81, defpackage.cd0
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // defpackage.z81
    public final String getServiceDescriptor() {
        return "com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService";
    }

    @Override // defpackage.z81
    public final String getStartServiceAction() {
        return "com.google.android.gms.mlkit.docscan.ui.DocumentScanningChimeraService.START";
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
