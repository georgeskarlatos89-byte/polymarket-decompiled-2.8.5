package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.RuntimeShader;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class w6 {
    public static /* bridge */ /* synthetic */ void A(RuntimeShader runtimeShader, float[] fArr) {
        runtimeShader.setFloatUniform("colors", fArr);
    }

    public static /* bridge */ /* synthetic */ boolean B(fa0 fa0Var) {
        return ValueAnimator.registerDurationScaleChangeListener(fa0Var);
    }

    public static /* bridge */ /* synthetic */ void C(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uAngle", f);
    }

    public static /* bridge */ /* synthetic */ void D(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uWeaveScale", f);
    }

    public static /* bridge */ /* synthetic */ float a() {
        return ValueAnimator.getDurationScale();
    }

    public static /* bridge */ /* synthetic */ int b() {
        return MediaStore.getPickImagesMaxLimit();
    }

    public static /* bridge */ /* synthetic */ ApplicationInfo c(PackageManager packageManager, String str, PackageManager.ApplicationInfoFlags applicationInfoFlags) {
        return packageManager.getApplicationInfo(str, applicationInfoFlags);
    }

    public static /* bridge */ /* synthetic */ PackageManager.ApplicationInfoFlags d() {
        return PackageManager.ApplicationInfoFlags.of(0L);
    }

    public static /* bridge */ /* synthetic */ RuntimeShader e(Object obj) {
        return (RuntimeShader) obj;
    }

    public static /* synthetic */ RuntimeShader f(String str) {
        return new RuntimeShader(str);
    }

    public static /* bridge */ /* synthetic */ BoringLayout.Metrics g(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static /* synthetic */ BoringLayout h(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, true);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction i() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback j(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher k(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher l(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ List m(AudioManager audioManager, AudioAttributes audioAttributes) {
        return audioManager.getAudioDevicesForAttributes(audioAttributes);
    }

    public static /* synthetic */ void n() {
    }

    public static /* bridge */ /* synthetic */ void o(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("sigma", f);
    }

    public static /* bridge */ /* synthetic */ void p(RuntimeShader runtimeShader, float f, float f2) {
        runtimeShader.setFloatUniform("iResolution", f, f2);
    }

    public static /* bridge */ /* synthetic */ void q(RuntimeShader runtimeShader, float[] fArr) {
        runtimeShader.setFloatUniform("positions", fArr);
    }

    public static /* bridge */ /* synthetic */ void r(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    public static /* bridge */ /* synthetic */ void s(WebSettings webSettings) {
        webSettings.setAlgorithmicDarkeningAllowed(true);
    }

    public static /* bridge */ /* synthetic */ void t(OnBackInvokedDispatcher onBackInvokedDispatcher, jd0 jd0Var) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, jd0Var);
    }

    public static /* bridge */ /* synthetic */ void u(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ boolean v(fa0 fa0Var) {
        return ValueAnimator.unregisterDurationScaleChangeListener(fa0Var);
    }

    public static /* bridge */ /* synthetic */ boolean w(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static /* bridge */ /* synthetic */ List x(AudioManager audioManager, AudioAttributes audioAttributes) {
        return audioManager.getDirectProfilesForAttributes(audioAttributes);
    }

    public static /* bridge */ /* synthetic */ void y(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uTime", f);
    }

    public static /* bridge */ /* synthetic */ void z(RuntimeShader runtimeShader, float f, float f2) {
        runtimeShader.setFloatUniform("uSize", f, f2);
    }
}
