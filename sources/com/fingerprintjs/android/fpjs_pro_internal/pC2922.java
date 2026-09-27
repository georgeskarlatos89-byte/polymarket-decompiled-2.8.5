package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/pC2922;", "", "b", "a", "Lcom/fingerprintjs/android/fpjs_pro_internal/pC2922$b;", "Lcom/fingerprintjs/android/fpjs_pro_internal/pC2922$a;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class pC2922 {
    public static final long a;
    public static int b;
    public static int c;
    public static final byte[] d = null;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/pC2922$a;", "Lcom/fingerprintjs/android/fpjs_pro_internal/pC2922;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends pC2922 {
        public static final a e = new pC2922(null);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/pC2922$b;", "Lcom/fingerprintjs/android/fpjs_pro_internal/pC2922;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends pC2922 {
        public static final b e = new pC2922(null);
    }

    static {
        b();
        b = 0;
        c = 1;
        a = -6085486791188603163L;
    }

    public pC2922(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, int i, Object[] objArr) {
        Throwable cause;
        char c2;
        int i2;
        int i3 = b + 75;
        c = i3 % 128;
        byte b2 = 2;
        if (i3 % 2 != 0) {
            char[] charArray = str.toCharArray();
            ck ckVar = new ck();
            ckVar.vD14832N6715 = i;
            int length = charArray.length;
            long[] jArr = new long[length];
            int i4 = 0;
            ckVar.component5 = 0;
            b = (c + 63) % 128;
            while (true) {
                int i5 = ckVar.component5;
                if (i5 >= charArray.length) {
                    break;
                }
                char c3 = charArray[i5];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[b2] = ckVar;
                    objArr2[1] = ckVar;
                    objArr2[i4] = Integer.valueOf(c3);
                    Object f = rV4669.f(2123814354);
                    if (f == null) {
                        int defaultSize = 4130 - View.getDefaultSize(i4, i4);
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int offsetAfter = 59 - TextUtils.getOffsetAfter("", i4);
                        byte[] bArr = d;
                        i2 = 1846919219;
                        byte b3 = (byte) (bArr[i4] - 1);
                        c2 = 1;
                        byte b4 = b3;
                        byte b5 = b4;
                        int i6 = (b3 * b2) + 97;
                        int i7 = b4 * 3;
                        int i8 = (b5 * 4) + 4;
                        byte[] bArr2 = new byte[1 - i7];
                        int i9 = 0 - i7;
                        int i10 = i4;
                        while (true) {
                            bArr2[i10] = (byte) i6;
                            if (i10 == i9) {
                                break;
                            }
                            i10++;
                            i6 += -bArr[i8];
                            i8++;
                            defaultSize = defaultSize;
                            keyRepeatTimeout = keyRepeatTimeout;
                        }
                        f = rV4669.g(defaultSize, keyRepeatTimeout, offsetAfter, -147715914, new String(bArr2, 0), new Class[]{Integer.TYPE, Object.class, Object.class});
                    } else {
                        c2 = 1;
                        i2 = 1846919219;
                    }
                    jArr[i5] = ((Long) ((Method) f).invoke(null, objArr2)).longValue() ^ (a ^ (-7526550383224563086L));
                    Object[] objArr3 = new Object[2];
                    objArr3[c2] = ckVar;
                    objArr3[0] = ckVar;
                    Object f2 = rV4669.f(i2);
                    if (f2 == null) {
                        f2 = rV4669.g(View.MeasureSpec.getMode(0) + 298, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 62, -407823017, "i", new Class[]{Object.class, Object.class});
                    }
                    ((Method) f2).invoke(null, objArr3);
                    b2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause == null) {
                    }
                }
                cause = th.getCause();
                if (cause == null) {
                    throw cause;
                }
                throw th;
            }
            char[] cArr = new char[length];
            ckVar.component5 = 0;
            while (true) {
                int i11 = ckVar.component5;
                if (i11 < charArray.length) {
                    b = (c + 113) % 128;
                    cArr[i11] = (char) jArr[i11];
                    Object[] objArr4 = {ckVar, ckVar};
                    Object f3 = rV4669.f(1846919219);
                    if (f3 == null) {
                        f3 = rV4669.g(298 - ExpandableListView.getPackedPositionType(0L), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 63 - (ViewConfiguration.getTouchSlop() >> 8), -407823017, "i", new Class[]{Object.class, Object.class});
                    }
                    ((Method) f3).invoke(null, objArr4);
                } else {
                    objArr[0] = new String(cArr);
                    return;
                }
            }
        } else {
            str.toCharArray();
            throw null;
        }
    }

    public static void b() {
        d = new byte[]{1, 31, 50, MessagePack.Code.FIXARRAY_PREFIX};
    }

    public static void setPivotYN16904(long j, long j2) {
        long j3 = j ^ (j2 << 32);
        af.class.getField("a").get(null);
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            a("쓡靷揹㹡諶敝ㇷ", TextUtils.indexOf("", "", 0) + 21377, objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            a("쒦ᗷ昈", 53590 - TextUtils.indexOf((CharSequence) "", '0'), objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            a("쓧ጹ歕", TextUtils.indexOf((CharSequence) "", '0', 0) + 55260, objArr5);
            Method method3 = Map.class.getMethod((String) objArr5[0], Object.class, Object.class);
            method3.setAccessible(true);
            method3.invoke(invoke2, objArr4);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
