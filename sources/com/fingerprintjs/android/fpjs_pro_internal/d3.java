package com.fingerprintjs.android.fpjs_pro_internal;

import android.media.MediaDrm;
import android.os.Build;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import defpackage.r5g;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.UUID;
import kotlin.Result;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d3 {
    public static int a = 0;
    public static int b = 1;

    public static String b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i6 | i3;
        int i8 = ~i;
        int i9 = ~i3;
        int i10 = ~(i8 | i9);
        int i11 = (~(i3 | i8)) | (~(i9 | i6));
        int i12 = (-1889271808) * i2;
        int i13 = ((-548405248) * i4) + (1607991296 * i5) + i12 + (1543273332 * i11) + (i10 * 1543273332) + ((-1543273332) * i7) + (862422157 * i) + ((-345998475) * i6) + 1335230464;
        int a2 = com.fingerprintjs.android.fpjs_pro.g.a(i4, -1243605516, (1389894630 * i5) + i6 + i + i2);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a2, 182059008, (i4 * (-147040884)) + (i5 * (-349388198)) + (i2 * (-88671137)) + (i11 * 12) + (i10 * 12) + (i7 * (-12)) + (i * (-88671149)) + ((i6 * (-88671125)) - 261777699), -132513792, ((-1553596416) * a2) + i13) != 1) {
            int i14 = a;
            b = ((i14 ^ 111) + ((i14 & 111) << 1)) % 128;
            MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
            byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
            b(new Object[]{mediaDrm}, -1647135955, q2.a(), q2.a(), q2.a(), q2.a(), 1647135956);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(propertyByteArray);
            String H = ArraysKt.H(messageDigest.digest(), "", e.h, 30);
            int i15 = c1.b;
            int i16 = i15 % 8918572;
            c1.b = i15 + 1;
            if (i16 == 0) {
                Process.myUid();
            }
            int i17 = c1.b;
            int i18 = i17 % 8918572;
            c1.b = i17 + 1;
            if (i18 == 0) {
                Process.myUid();
            }
            int i19 = b;
            int i20 = (i19 ^ 29) + ((i19 & 29) << 1);
            a = i20 % 128;
            if (i20 % 2 == 0) {
                return H;
            }
            throw null;
        }
        MediaDrm mediaDrm2 = (MediaDrm) objArr[0];
        int i21 = a;
        int i22 = ((i21 | 37) << 1) - (i21 ^ 37);
        b = i22 % 128;
        if (i22 % 2 == 0 && Build.VERSION.SDK_INT < 121) {
            mediaDrm2.release();
            b = (a + 101) % 128;
            return null;
        }
        int i23 = a;
        b = ((i23 ^ 91) + ((i23 & 91) << 1)) % 128;
        mediaDrm2.close();
        int i24 = b;
        a = ((i24 ^ 89) + ((i24 & 89) << 1)) % 128;
        return null;
    }

    public final String a() {
        try {
            Object obj = null;
            Object[] objArr = {0L, r0, r0, new c3(this), 7, null};
            Boolean bool = Boolean.FALSE;
            Object f = rV4669.f(-308176489);
            if (f == null) {
                int normalizeMetaState = KeyEvent.normalizeMetaState(0) + 1526;
                char combineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int resolveSize = 51 - View.resolveSize(0, 0);
                Class cls = Long.TYPE;
                Class cls2 = Boolean.TYPE;
                f = rV4669.g(normalizeMetaState, combineMeasuredStates, resolveSize, 1678066931, "D8871", new Class[]{cls, cls2, cls2, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke = ((Method) f).invoke(null, objArr);
            Result.Companion companion = Result.INSTANCE;
            if (invoke instanceof r5g) {
                int i = (b + 27) % 128;
                a = i;
                b = (i + 19) % 128;
            } else {
                obj = invoke;
            }
            return (String) obj;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
