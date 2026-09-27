package defpackage;

import android.app.Activity;
import android.graphics.RuntimeShader;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import java.time.Clock;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h84 {
    public static /* bridge */ /* synthetic */ void A(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uAngle", f);
    }

    public static /* bridge */ /* synthetic */ void B(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uWeaveScale", f);
    }

    public static /* bridge */ /* synthetic */ void C(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uWeaveIntensity", f);
    }

    public static /* bridge */ /* synthetic */ void D(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uHoleRatio", f);
    }

    public static /* synthetic */ RuntimeShader a() {
        return new RuntimeShader("\nuniform float2 uSize;\nuniform float uTime;\nuniform float uAngle;\nuniform float uWeaveScale;\nuniform float uWeaveIntensity;\nuniform float uHoleRatio;\nuniform float uSheen;\nuniform float uSpeed;\nuniform float uWaveAmount;\n\nconst float TAU = 6.28318530718;\n\nfloat hash(float2 p) {\n    p = fract(p * float2(123.34, 456.21));\n    p += dot(p, p + 45.32);\n    return fract(p.x * p.y);\n}\n\nfloat valueNoise(float2 p) {\n    float2 i = floor(p);\n    float2 f = fract(p);\n    float a = hash(i);\n    float b = hash(i + float2(1.0, 0.0));\n    float c = hash(i + float2(0.0, 1.0));\n    float d = hash(i + float2(1.0, 1.0));\n    float2 u = f * f * (3.0 - 2.0 * f);\n    return mix(mix(a, b, u.x), mix(c, d, u.x), u.y);\n}\n\nfloat fbm(float2 p) {\n    float v = 0.0;\n    float amp = 0.5;\n    for (int i = 0; i < 4; i++) {\n        v += amp * valueNoise(p);\n        p *= 2.0;\n        amp *= 0.5;\n    }\n    return v;\n}\n\nhalf4 main(float2 position) {\n    float2 uv = position / max(uSize, float2(1.0, 1.0));\n\n    float t = uTime * uSpeed;\n    float ramp = smoothstep(0.0, 1.0, uv.x);\n\n    float wind = 0.55 * sin(t * 0.16) + 0.30 * sin(t * 0.071 + 1.0);\n    float2 wdir = float2(cos(wind), sin(wind) * 0.6);\n    float along = dot(uv, wdir);\n\n    float flow = fbm(uv * 2.3 + float2(t * 0.18, t * 0.11)) - 0.5;\n    float gust = 0.65 + 0.45 * sin(t * 0.27 + uv.y * 3.1 + flow * 2.0);\n\n    float k1 = TAU * 1.15;\n    float k2 = TAU * 2.10;\n    float ph1 = along * k1 - t * 1.7 + flow * 3.2;\n    float ph2 = along * k2 - t * 2.6 + 1.7 + flow * 2.1;\n    float crossSway = sin(uv.y * TAU * 0.8 - t * 1.05);\n\n    float ampSmooth = uWaveAmount * ramp;\n    float amp = ampSmooth * gust;\n    float wave = (sin(ph1) + 0.5 * sin(ph2) + 0.3 * crossSway) * amp;\n    float slope = (cos(ph1) * k1 + 0.5 * cos(ph2) * k2) * wdir.x * ampSmooth;\n\n    float2 suv = uv;\n    suv.y += wave;\n    suv.x += wave * 0.3 * wdir.y;\n\n    // Square cells in points, matching ClothOverlayView's aspect-corrected weaveScale.\n    float2 mg = suv * float2(uWeaveScale, uWeaveScale * uSize.y / max(uSize.x, 1.0));\n    float rowOff = 0.5 * mod(floor(mg.y), 2.0);\n    float2 c = fract(mg + float2(rowOff, 0.0)) - 0.5;\n    float d = length(c);\n    float hole = smoothstep(uHoleRatio / 3.0, uHoleRatio, d);\n    float topLight = (-c.y) * (1.0 - hole);\n    float weave = hole + topLight * 0.8;\n\n    float fold = 1.0 + clamp(slope, -1.5, 1.5) * 0.11;\n\n    float2 lightDir = float2(cos(uAngle + 0.6), sin(uAngle + 0.6));\n    float band = dot(uv - 0.5, lightDir);\n    float s = exp(-pow(band / 0.45, 2.0));\n    float sheenAmt = s * uSheen;\n\n    float meshDev = (weave - 1.0) * uWeaveIntensity;\n    float foldDev = fold - 1.0;\n    float v = clamp(0.5 + meshDev + foldDev + sheenAmt, 0.0, 1.0);\n    return half4(half3(v), 1.0);\n}\n");
    }

    public static /* bridge */ /* synthetic */ CameraCharacteristics.Key b() {
        return CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
    }

    public static /* bridge */ /* synthetic */ DynamicRangeProfiles c(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    public static /* synthetic */ EditorBoundsInfo.Builder d() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher e(pk4 pk4Var) {
        return pk4Var.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher f(wk4 wk4Var) {
        return wk4Var.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher g(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ Object h(Bundle bundle) {
        return bundle.getParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", IContentCardsUpdateHandler.class);
    }

    public static /* bridge */ /* synthetic */ Clock i() {
        return SystemClock.currentNetworkTimeClock();
    }

    public static /* bridge */ /* synthetic */ Set j(DynamicRangeProfiles dynamicRangeProfiles) {
        return dynamicRangeProfiles.getSupportedProfiles();
    }

    public static /* bridge */ /* synthetic */ void k(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uWeaveIntensity", f);
    }

    public static /* bridge */ /* synthetic */ void l(RuntimeShader runtimeShader, float f, float f2) {
        runtimeShader.setFloatUniform("uSize", f, f2);
    }

    public static /* bridge */ /* synthetic */ void m(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ boolean n(AudioManager audioManager) {
        return audioManager.isRampingRingerEnabled();
    }

    public static /* bridge */ /* synthetic */ Object o(Bundle bundle) {
        return bundle.getParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY", IContentCardsViewBindingHandler.class);
    }

    public static /* bridge */ /* synthetic */ void p(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uHoleRatio", f);
    }

    public static /* bridge */ /* synthetic */ void q(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ void r(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uSheen", f);
    }

    public static /* bridge */ /* synthetic */ void s(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uSpeed", f);
    }

    public static /* bridge */ /* synthetic */ void t(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uWaveAmount", f);
    }

    public static /* bridge */ /* synthetic */ Object u(Bundle bundle) {
        return bundle.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", Parcelable.class);
    }

    public static /* bridge */ /* synthetic */ void v(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uSheen", f);
    }

    public static /* bridge */ /* synthetic */ void w(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ void x(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uSpeed", f);
    }

    public static /* bridge */ /* synthetic */ void y(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uWaveAmount", f);
    }

    public static /* bridge */ /* synthetic */ void z(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("uTime", f);
    }
}
