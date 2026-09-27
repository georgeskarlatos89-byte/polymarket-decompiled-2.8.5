package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.hardware.input.InputManager;
import android.os.Process;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/hardware/input/InputManager;", "b", "()Landroid/hardware/input/InputManager;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class q3 extends Lambda implements Function0<InputManager> {
    public static int i = 0;
    public static int j = 1;
    public static int k;
    public static int l;
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(Context context) {
        super(0);
        this.h = context;
    }

    public static int D8871() {
        int i2 = k;
        int i3 = i2 % 8601251;
        k = i2 + 1;
        if (i3 != 0) {
            return l;
        }
        int myTid = Process.myTid();
        l = myTid;
        return myTid;
    }

    public final InputManager b() {
        int i2 = j + 15;
        i = i2 % 128;
        int i3 = i2 % 2;
        InputManager inputManager = (InputManager) this.h.getSystemService(MetricTracker.Object.INPUT);
        if (i3 == 0) {
            int i4 = i;
            j = (((i4 | 37) << 1) - (i4 ^ 37)) % 128;
            return inputManager;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ InputManager invoke() {
        int i2 = j;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        i = i3 % 128;
        if (i3 % 2 == 0) {
            return b();
        }
        b();
        throw null;
    }
}
