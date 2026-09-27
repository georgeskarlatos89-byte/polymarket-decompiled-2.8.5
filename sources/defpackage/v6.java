package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class v6 {
    public static /* bridge */ /* synthetic */ int a(Spatializer spatializer) {
        return spatializer.getImmersiveAudioLevel();
    }

    public static /* bridge */ /* synthetic */ Spatializer b(AudioManager audioManager) {
        return audioManager.getSpatializer();
    }

    public static /* bridge */ /* synthetic */ Spatializer c(Object obj) {
        return (Spatializer) obj;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction d() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
    }

    public static /* bridge */ /* synthetic */ void e(AudioAttributes.Builder builder) {
        builder.setSpatializationBehavior(0);
    }

    public static /* bridge */ /* synthetic */ void f(Spatializer spatializer, hz5 hz5Var, zg6 zg6Var) {
        spatializer.addOnSpatializerStateChangedListener(hz5Var, zg6Var);
    }

    public static /* bridge */ /* synthetic */ void g(Spatializer spatializer, zg6 zg6Var) {
        spatializer.removeOnSpatializerStateChangedListener(zg6Var);
    }

    public static /* bridge */ /* synthetic */ boolean h(Spatializer spatializer) {
        return spatializer.isAvailable();
    }

    public static /* bridge */ /* synthetic */ boolean i(Spatializer spatializer, AudioAttributes audioAttributes, AudioFormat audioFormat) {
        return spatializer.canBeSpatialized(audioAttributes, audioFormat);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction j() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
    }

    public static /* bridge */ /* synthetic */ boolean k(Spatializer spatializer) {
        return spatializer.isEnabled();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction l() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
    }
}
