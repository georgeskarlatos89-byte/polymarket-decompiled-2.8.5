package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.input.InputManager;
import android.view.InputDevice;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/fingerprintjs/android/fpjs_pro_internal/b5;", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class g2 extends Lambda implements Function0<List<? extends b5>> {
    public static int i = 0;
    public static int j = 1;
    public final /* synthetic */ h2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var) {
        super(0);
        this.h = h2Var;
    }

    public final List<b5> b() {
        h2 h2Var = this.h;
        InputManager a = h2.a(h2Var);
        a.getClass();
        int[] inputDeviceIds = a.getInputDeviceIds();
        inputDeviceIds.getClass();
        ArrayList arrayList = new ArrayList(inputDeviceIds.length);
        int length = inputDeviceIds.length;
        int i2 = 0;
        while (i2 < length) {
            InputDevice inputDevice = h2.a(h2Var).getInputDevice(inputDeviceIds[i2]);
            inputDevice.getClass();
            String valueOf = String.valueOf(inputDevice.getVendorId());
            String name = inputDevice.getName();
            name.getClass();
            arrayList.add(new b5(name, valueOf));
            int i3 = i2 + 55;
            i2 = ((i3 & (-54)) << 1) + (i3 ^ (-54));
            i = (j + 7) % 128;
        }
        int i4 = j;
        int i5 = (i4 & 51) + (i4 | 51);
        i = i5 % 128;
        if (i5 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ List<? extends b5> invoke() {
        int i2 = j;
        int i3 = (i2 & 21) + (i2 | 21);
        i = i3 % 128;
        int i4 = i3 % 2;
        List<b5> b = b();
        if (i4 != 0) {
            int i5 = 28 / 0;
        }
        int i6 = i;
        int i7 = (i6 ^ 33) + ((i6 & 33) << 1);
        j = i7 % 128;
        if (i7 % 2 != 0) {
            return b;
        }
        throw null;
    }
}
