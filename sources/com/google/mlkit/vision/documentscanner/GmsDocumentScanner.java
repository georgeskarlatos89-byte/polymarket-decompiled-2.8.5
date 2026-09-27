package com.google.mlkit.vision.documentscanner;

import android.app.Activity;
import android.content.IntentSender;
import com.google.android.gms.tasks.Task;
import defpackage.fld;
import defpackage.gw7;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface GmsDocumentScanner extends fld {
    @Override // defpackage.fld
    /* synthetic */ gw7[] getOptionalFeatures();

    Task<IntentSender> getStartScanIntent(Activity activity);
}
