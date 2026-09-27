package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Bundle;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.models.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class fx8 {
    public static /* bridge */ /* synthetic */ void A(RuntimeShader runtimeShader) {
        runtimeShader.setFloatUniform("ditherMix", 1.0f);
    }

    public static /* bridge */ /* synthetic */ void B(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(i, onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ Serializable C(Intent intent) {
        return intent.getSerializableExtra("error", SocureDocVError.class);
    }

    public static /* bridge */ /* synthetic */ PackageManager.ComponentInfoFlags a() {
        return PackageManager.ComponentInfoFlags.of(0L);
    }

    public static /* bridge */ /* synthetic */ PackageManager.ResolveInfoFlags b() {
        return PackageManager.ResolveInfoFlags.of(0L);
    }

    public static /* bridge */ /* synthetic */ ProviderInfo c(PackageManager packageManager, PackageManager.ComponentInfoFlags componentInfoFlags) {
        return packageManager.resolveContentProvider("com.huawei.appmarket.commondata", componentInfoFlags);
    }

    public static /* bridge */ /* synthetic */ RenderEffect d(RuntimeShader runtimeShader) {
        return RenderEffect.createRuntimeShaderEffect(runtimeShader, "source");
    }

    public static /* bridge */ /* synthetic */ CameraCharacteristics.Key e() {
        return CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
    }

    public static /* bridge */ /* synthetic */ AccessibilityManager$AccessibilityServicesStateChangeListener f(Object obj) {
        return (AccessibilityManager$AccessibilityServicesStateChangeListener) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher g(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ Serializable h(Intent intent) {
        return intent.getSerializableExtra("EXTRA_KEY_LOCALE", Locale.class);
    }

    public static /* bridge */ /* synthetic */ Serializable i(Bundle bundle, String str, Class cls) {
        return bundle.getSerializable(str, cls);
    }

    public static /* bridge */ /* synthetic */ Object j(Intent intent) {
        return intent.getParcelableExtra("EXTRA_KEY_CONTACT_DATA", ContactData.class);
    }

    public static /* bridge */ /* synthetic */ Object k(Bundle bundle) {
        return bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class);
    }

    public static /* bridge */ /* synthetic */ ArrayList l(Intent intent) {
        return intent.getParcelableArrayListExtra("EXTRA_KEY_FIELDS", AddressField.class);
    }

    public static /* bridge */ /* synthetic */ List m(PackageManager packageManager, Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        return packageManager.queryBroadcastReceivers(intent, resolveInfoFlags);
    }

    public static /* bridge */ /* synthetic */ void n(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) {
        packageManager.getActivityInfo(componentName, componentInfoFlags);
    }

    public static /* bridge */ /* synthetic */ void o(RuntimeShader runtimeShader) {
        runtimeShader.setFloatUniform("ditherCell", 3.0f);
    }

    public static /* bridge */ /* synthetic */ void p(RuntimeShader runtimeShader, float f) {
        runtimeShader.setFloatUniform("maskAvailable", f);
    }

    public static /* bridge */ /* synthetic */ void q(RuntimeShader runtimeShader, float f, float f2) {
        runtimeShader.setFloatUniform("maskScale", f, f2);
    }

    public static /* bridge */ /* synthetic */ void r(RuntimeShader runtimeShader, float f, float f2, float f3) {
        runtimeShader.setFloatUniform("bgColor", f, f2, f3);
    }

    public static /* bridge */ /* synthetic */ void s(RuntimeShader runtimeShader, Shader shader) {
        runtimeShader.setInputShader("mask", shader);
    }

    public static /* bridge */ /* synthetic */ void t(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(i, onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ void u(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    public static /* bridge */ /* synthetic */ boolean v(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static /* bridge */ /* synthetic */ Serializable w(Intent intent) {
        return intent.getSerializableExtra("EXTRA_KEY_TRANSLATION", HashMap.class);
    }

    public static /* bridge */ /* synthetic */ Object x(Intent intent) {
        return intent.getParcelableExtra("EXTRA_KEY_DESIGN_TOKENS", DesignTokens.class);
    }

    public static /* bridge */ /* synthetic */ Object y(Bundle bundle) {
        return bundle.getParcelable(ConstantsKt.KEY_MODEL, l.class);
    }

    public static /* bridge */ /* synthetic */ List z(PackageManager packageManager, Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        return packageManager.queryIntentActivities(intent, resolveInfoFlags);
    }
}
