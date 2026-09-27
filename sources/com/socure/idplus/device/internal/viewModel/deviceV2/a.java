package com.socure.idplus.device.internal.viewModel.deviceV2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.socure.idplus.device.context.SigmaDeviceContext;
import com.socure.idplus.device.internal.behavior.model.ViewportSizeEvent;
import com.socure.idplus.device.internal.mediaDevice.model.MediaDeviceEvent;
import com.socure.idplus.device.internal.sigmaDeviceSession.manager.j;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.AndroidAttributes;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.Battery;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.DeviceMetadata;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.DeviceNetwork;
import io.intercom.android.sdk.models.AttributeType;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a extends Lambda implements Function1 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ViewportSizeEvent b;
    public final /* synthetic */ SigmaDeviceContext c;
    public final /* synthetic */ MediaDeviceEvent d;
    public final /* synthetic */ j e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ViewportSizeEvent viewportSizeEvent, SigmaDeviceContext sigmaDeviceContext, MediaDeviceEvent mediaDeviceEvent, j jVar) {
        super(1);
        this.a = context;
        this.b = viewportSizeEvent;
        this.c = sigmaDeviceContext;
        this.d = mediaDeviceEvent;
        this.e = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num;
        String str;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Float f;
        boolean z;
        String str2;
        int i;
        String str3;
        Float f2;
        Double d;
        com.socure.idplus.device.internal.utils.b bVar;
        Resources resources;
        Configuration configuration;
        AndroidAttributes androidAttributes = (AndroidAttributes) obj;
        androidAttributes.getClass();
        UUID uuid = com.socure.idplus.device.internal.utils.f.a;
        String str4 = Build.VERSION.RELEASE;
        str4.getClass();
        String str5 = Build.MODEL;
        String str6 = Build.MANUFACTURER;
        Context context = this.a;
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            num = Integer.valueOf(configuration.screenLayout & 15);
        } else {
            num = null;
        }
        num.getClass();
        if (num.intValue() >= 3) {
            str = "tablet";
        } else {
            str = AttributeType.PHONE;
        }
        String str7 = str;
        Context context2 = this.a;
        context2.getClass();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Object systemService = context2.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
        systemService.getClass();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        float rint = (float) Math.rint(((float) memoryInfo.totalMem) / 1.07374182E9f);
        ViewportSizeEvent viewportSizeEvent = this.b;
        if (viewportSizeEvent != null) {
            num2 = Integer.valueOf(viewportSizeEvent.getViewportHeight());
        } else {
            num2 = null;
        }
        ViewportSizeEvent viewportSizeEvent2 = this.b;
        if (viewportSizeEvent2 != null) {
            num3 = Integer.valueOf(viewportSizeEvent2.getViewportWidth());
        } else {
            num3 = null;
        }
        ViewportSizeEvent viewportSizeEvent3 = this.b;
        if (viewportSizeEvent3 != null) {
            num4 = Integer.valueOf(viewportSizeEvent3.getScreenHeight());
        } else {
            num4 = null;
        }
        ViewportSizeEvent viewportSizeEvent4 = this.b;
        if (viewportSizeEvent4 != null) {
            num5 = Integer.valueOf(viewportSizeEvent4.getScreenWidth());
        } else {
            num5 = null;
        }
        ViewportSizeEvent viewportSizeEvent5 = this.b;
        if (viewportSizeEvent5 != null) {
            f = Float.valueOf(viewportSizeEvent5.getDevicePixelRatio());
        } else {
            f = null;
        }
        String id = TimeZone.getDefault().getID();
        id.getClass();
        int offset = (TimeZone.getDefault().getOffset(new Date().getTime()) / 1000) / 60;
        String languageTag = Locale.getDefault().toLanguageTag();
        languageTag.getClass();
        String lowerCase = languageTag.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        String J = ArraysKt.J(strArr, null, null, null, null, 63);
        Context context3 = this.a;
        context3.getClass();
        if (com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.NETWORK, context3)) {
            Object systemService2 = context3.getApplicationContext().getSystemService("connectivity");
            systemService2.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService2;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            allNetworks.getClass();
            int length = allNetworks.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = length;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i2]);
                ConnectivityManager connectivityManager2 = connectivityManager;
                if (networkCapabilities != null) {
                    boolean hasTransport = networkCapabilities.hasTransport(4);
                    z = true;
                    if (hasTransport) {
                        break;
                    }
                }
                i2++;
                length = i3;
                connectivityManager = connectivityManager2;
            }
        }
        z = false;
        DeviceNetwork deviceNetwork = new DeviceNetwork(z);
        UUID uuid2 = com.socure.idplus.device.internal.utils.f.a;
        Context context4 = this.a;
        context4.getClass();
        Intent registerReceiver = context4.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            str2 = str5;
            i = registerReceiver.getIntExtra("status", -1);
        } else {
            str2 = str5;
            i = -1;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    str3 = "unknown";
                } else {
                    str3 = "full";
                }
            } else {
                str3 = "unplugged";
            }
        } else {
            str3 = "charging";
        }
        if (context4.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
            f2 = Float.valueOf(r1.getIntExtra("level", -1) / r1.getIntExtra("scale", -1));
        } else {
            f2 = null;
        }
        if (f2 != null) {
            d = Double.valueOf(f2.floatValue());
        } else {
            d = null;
        }
        Battery battery = new Battery(str3, d);
        Context context5 = this.a;
        context5.getClass();
        if (context5.getClassLoader().loadClass("com.facebook.react.ReactActivity") != null) {
            bVar = com.socure.idplus.device.internal.utils.b.REACT_NATIVE;
            String str8 = bVar.a;
            String value = this.c.getValue();
            str2.getClass();
            str6.getClass();
            this.e.invoke(new DeviceMetadata("4.10.3", null, null, str4, str2, str6, str7, rint, num3, num2, num5, num4, f, id, offset, lowerCase, J, deviceNetwork, battery, str8, value, androidAttributes, this.d, 6, null));
            return Unit.INSTANCE;
        }
        if (com.socure.idplus.device.internal.utils.c.a()) {
            bVar = com.socure.idplus.device.internal.utils.b.REACT;
        } else if (com.socure.idplus.device.internal.common.utils.a.a(context5, "io.flutter.embedding.android") != null) {
            bVar = com.socure.idplus.device.internal.utils.b.FLUTTER;
        } else {
            bVar = com.socure.idplus.device.internal.utils.b.NATIVE;
        }
        String str82 = bVar.a;
        String value2 = this.c.getValue();
        str2.getClass();
        str6.getClass();
        this.e.invoke(new DeviceMetadata("4.10.3", null, null, str4, str2, str6, str7, rint, num3, num2, num5, num4, f, id, offset, lowerCase, J, deviceNetwork, battery, str82, value2, androidAttributes, this.d, 6, null));
        return Unit.INSTANCE;
    }
}
