package defpackage;

import android.app.ActivityOptions;
import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.view.WindowInsets;
import android.window.SurfaceSyncGroup;
import kotlin.reflect.jvm.internal.ComputableClassValue;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class sre {
    public static /* bridge */ /* synthetic */ int a() {
        return WindowInsets.Type.systemOverlays();
    }

    public static /* bridge */ /* synthetic */ ActivityOptions b(ActivityOptions activityOptions) {
        return activityOptions.setPendingIntentBackgroundActivityStartMode(1);
    }

    public static /* bridge */ /* synthetic */ BroadcastOptions c() {
        return BroadcastOptions.makeBasic();
    }

    public static /* bridge */ /* synthetic */ BroadcastOptions d(BroadcastOptions broadcastOptions) {
        return broadcastOptions.setShareIdentityEnabled(true);
    }

    public static /* bridge */ /* synthetic */ Bundle e(BroadcastOptions broadcastOptions) {
        return broadcastOptions.toBundle();
    }

    public static /* bridge */ /* synthetic */ Object f(ComputableClassValue computableClassValue, Class cls) {
        return computableClassValue.get(cls);
    }

    public static /* bridge */ /* synthetic */ void g(nx2 nx2Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        nx2Var.onReadoutStarted(cameraCaptureSession, captureRequest, j, j2);
    }

    public static /* bridge */ /* synthetic */ void h(PendingIntent pendingIntent, Bundle bundle) {
        pendingIntent.send(bundle);
    }

    public static /* bridge */ /* synthetic */ void i(Context context, Intent intent, Bundle bundle) {
        context.sendBroadcast(intent, null, bundle);
    }

    public static /* bridge */ /* synthetic */ void j(SurfaceSyncGroup surfaceSyncGroup) {
        surfaceSyncGroup.markSyncReady();
    }

    public static /* bridge */ /* synthetic */ void k(ComputableClassValue computableClassValue, Class cls) {
        computableClassValue.remove(cls);
    }
}
