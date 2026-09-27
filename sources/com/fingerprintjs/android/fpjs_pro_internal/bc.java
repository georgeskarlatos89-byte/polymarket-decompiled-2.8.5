package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.os.Process;
import com.fingerprintjs.android.fpjs_pro.raw_signal_providers.file_timestamps.FileTimestamps;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bc {
    public static int a;
    public static int b;

    public bc() {
        System.loadLibrary("fp");
    }

    public static int a() {
        int i = a;
        int i2 = i % 8000995;
        a = i + 1;
        if (i2 != 0) {
            return b;
        }
        int myTid = Process.myTid();
        b = myTid;
        return myTid;
    }

    public final native List<String> D8871(List<String> list);

    public final native FileTimestamps component5(String str);

    public final native String component9();

    public final native Boolean setPivotYN16904(Context context, String str);

    public final native String vD14832N6715(Context context);
}
