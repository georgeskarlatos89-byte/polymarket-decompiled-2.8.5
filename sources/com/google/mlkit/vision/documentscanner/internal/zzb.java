package com.google.mlkit.vision.documentscanner.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanner;
import com.google.mlkit.vision.documentscanner.GmsDocumentScannerOptions;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.c0o;
import defpackage.dmk;
import defpackage.enl;
import defpackage.fzn;
import defpackage.gw7;
import defpackage.hdi;
import defpackage.k5n;
import defpackage.lvn;
import defpackage.m9n;
import defpackage.pz8;
import defpackage.q9n;
import defpackage.r3l;
import defpackage.uun;
import defpackage.wtc;
import defpackage.yfn;
import defpackage.yun;
import io.radar.sdk.RadarTrackingOptions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzb implements GmsDocumentScanner {
    private static boolean zza;
    private static int zzb;
    private final GmsDocumentScannerOptions zzc;
    private final gw7[] zzd;
    private final k5n zze;
    private final uun zzf;
    private final yun zzg;

    /* JADX WARN: Type inference failed for: r0v1, types: [j0, java.lang.Object] */
    public zzb(GmsDocumentScannerOptions gmsDocumentScannerOptions) {
        uun i = lvn.i();
        yun yunVar = new yun(MlKitContext.getInstance().getApplicationContext());
        this.zzc = gmsDocumentScannerOptions;
        this.zze = zzf.zza(gmsDocumentScannerOptions);
        this.zzg = yunVar;
        this.zzf = i;
        ?? obj = new Object();
        obj.c = new Object[4];
        obj.a = 0;
        obj.h(OptionalModuleUtils.FEATURE_DOCSCAN_UI);
        if (gmsDocumentScannerOptions.zzg()) {
            obj.h(OptionalModuleUtils.FEATURE_DOCSCAN_SHADOW_REMOVAL);
        }
        if (gmsDocumentScannerOptions.zzh()) {
            obj.h(OptionalModuleUtils.FEATURE_DOCSCAN_STAIN_REMOVAL);
        }
        obj.b = true;
        this.zzd = (gw7[]) c0o.s(obj.a, (Object[]) obj.c).toArray(new gw7[0]);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [a7h, java.lang.Object] */
    private final void zza(m9n m9nVar, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        wtc wtcVar = new wtc(15);
        ?? obj = new Object();
        obj.a = Long.valueOf((elapsedRealtime - j) & Long.MAX_VALUE);
        obj.b = m9nVar;
        obj.c = this.zze;
        wtcVar.e = new yfn(obj);
        this.zzf.a(new r3l(wtcVar), q9n.ON_DEVICE_DOCUMENT_SCANNER_UI_FINISH);
        this.zzg.a(m9nVar.zza(), j2, currentTimeMillis);
    }

    private static void zzb(String str) {
        Log.isLoggable("GmsDocumentScannerImpl", 3);
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanner, defpackage.fld
    public final gw7[] getOptionalFeatures() {
        return this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0127  */
    /* JADX WARN: Type inference failed for: r8v1, types: [a7h, java.lang.Object] */
    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Task<IntentSender> getStartScanIntent(Activity activity) {
        fzn c;
        boolean z;
        boolean z2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        Context applicationContext = activity.getApplicationContext();
        wtc wtcVar = new wtc(15);
        ?? obj = new Object();
        obj.c = this.zze;
        wtcVar.f = new yfn(obj);
        this.zzf.a(new r3l(wtcVar), q9n.ON_DEVICE_DOCUMENT_SCANNER_UI_CREATE);
        ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            float f = ((((float) memoryInfo.totalMem) / 1024.0f) / 1024.0f) / 1024.0f;
            StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 17);
            sb.append("total RAM (GB) = ");
            sb.append(f);
            zzb(sb.toString());
            if (f < 1.7f) {
                zza(m9n.LOW_MEMORY, elapsedRealtime, currentTimeMillis);
                StringBuilder sb2 = new StringBuilder(String.valueOf(1.7f).length() + 65);
                sb2.append("Device RAM is below the minimal requirement for this feature: 1.7 GB");
                c = Tasks.c(new MlKitException(sb2.toString(), 18));
                if (c != null) {
                    return c;
                }
                zza zzaVar = new zza(this);
                Bundle bundle = new Bundle();
                bundle.putBinder("bundle_binder_extra_callbacks", zzaVar);
                Intent putExtra = new Intent(activity, (Class<?>) GmsDocumentScanningDelegateActivity.class).putExtra("boolean_extra_request_uris_in_result_intent", true);
                GmsDocumentScannerOptions gmsDocumentScannerOptions = this.zzc;
                Intent putExtra2 = putExtra.putExtras(new Intent().putParcelableArrayListExtra("uri_array_extra_initial_image_uris", null).putExtra("int_extra_default_capture_mode", 1).putExtra("boolean_extra_flash_mode_change_allowed", true).putExtra("boolean_extra_gallery_import_allowed", gmsDocumentScannerOptions.zza()).putExtra("boolean_extra_enable_gallery_import_auto_transform", true).putExtra("int_extra_page_limit_max", gmsDocumentScannerOptions.zzb()).putExtra("boolean_extra_page_edit_listener_enabled", false).putExtra("int_array_extra_result_formats", gmsDocumentScannerOptions.zzc()).putExtra("boolean_extra_enable_all_new_features_by_default", gmsDocumentScannerOptions.zze()).putExtra("boolean_extra_filter_allowed", gmsDocumentScannerOptions.zzf()).putExtra("boolean_extra_shadow_removal_allowed", gmsDocumentScannerOptions.zzg()).putExtra("boolean_extra_stain_removal_allowed", gmsDocumentScannerOptions.zzh()).putExtra("boolean_extra_enable_compute_hash_for_gallery_image", false).putExtra("boolean_extra_enable_auto_enhancements", gmsDocumentScannerOptions.zzi()).putExtra("string_extra_camera_id", gmsDocumentScannerOptions.zzd())).setFlags(1).putExtra("bundle_binder_extra_callbacks", bundle);
                if (applicationContext.getPackageName().equals("com.google.android.gms")) {
                    putExtra2 = GmsDocumentScanningDelegateActivity.zza(applicationContext, putExtra2).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.mlkit.docscan.ui.DocumentScanningActivity"));
                }
                int i = zzb;
                zzb = i + 1;
                boolean a = enl.a(67108864, 67108864);
                if (putExtra2.getComponent() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (enl.a(0, 1)) {
                        if (a) {
                            dmk.v("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
                            return null;
                        }
                    } else if (!a) {
                        dmk.v("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
                        return null;
                    }
                    Intent intent = new Intent(putExtra2);
                    if (!a) {
                        if (intent.getPackage() == null) {
                            intent.setPackage(intent.getComponent().getPackageName());
                        }
                        if (!enl.a(0, 3) && intent.getAction() == null) {
                            intent.setAction("");
                        }
                        if (!enl.a(0, 9) && intent.getCategories() == null) {
                            intent.addCategory("");
                        }
                        if (!enl.a(0, 5) && intent.getData() == null) {
                            intent.setDataAndType(Uri.EMPTY, ApiConstant.ALL_MEDIA_TYPE);
                        }
                        if (!enl.a(0, 17) && intent.getClipData() == null) {
                            intent.setClipData(enl.a);
                        }
                    }
                    PendingIntent activity2 = PendingIntent.getActivity(activity, i, intent, 67108864);
                    if (activity2 == null) {
                        zza(m9n.UNKNOWN_ERROR, elapsedRealtime, currentTimeMillis);
                        return Tasks.c(new MlKitException("Failed to create IntentSender", 13));
                    }
                    return Tasks.d(activity2.getIntentSender());
                }
                dmk.v("Must set component on Intent.");
                return null;
            }
        }
        if (!zza) {
            OptionalModuleUtils.requestDownload(applicationContext, this.zzd);
            zza = true;
        }
        a.b.getClass();
        int a2 = pz8.a(applicationContext);
        zzb(hdi.l(a2, "gmsVersion=", new StringBuilder(String.valueOf(a2).length() + 11)));
        if (a2 >= 233900000) {
            if (new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_DOCUMENT").resolveActivity(applicationContext.getPackageManager()) != null) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(z).length() + 27);
            sb3.append("isDocScanActivityAvailable=");
            sb3.append(z);
            zzb(sb3.toString());
            if (z) {
                c = null;
                if (c != null) {
                }
            }
        }
        zza(m9n.GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, elapsedRealtime, currentTimeMillis);
        c = Tasks.c(new MlKitException("Feature not available in the current version of the Google Play services", 14));
        if (c != null) {
        }
    }
}
