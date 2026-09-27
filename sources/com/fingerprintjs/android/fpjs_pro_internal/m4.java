package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.graphics.Color;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.r5g;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m4 {
    public static int d = 0;
    public static int e = 1;
    public final setOnTouchListener a;
    public final tM9319B53 b;
    public final d3 c;

    public m4(setOnTouchListener setontouchlistener, tM9319B53 tm9319b53, d3 d3Var) {
        this.a = setontouchlistener;
        this.b = tm9319b53;
        this.c = d3Var;
    }

    public final String a() {
        int i = d + 115;
        e = i % 128;
        int i2 = i % 2;
        d3 d3Var = this.c;
        if (i2 != 0) {
            String a = d3Var.a();
            if (a == null) {
                int i3 = e;
                d = ((i3 & 69) + (i3 | 69)) % 128;
                a = "";
            }
            int i4 = d;
            e = (((i4 | 49) << 1) - (i4 ^ 49)) % 128;
            return a;
        }
        d3Var.a();
        throw null;
    }

    public final String b() {
        int i;
        int i2 = d;
        e = ((i2 & 27) + (i2 | 27)) % 128;
        try {
            Object[] objArr = {0L, r0, r0, new Function0<String>() { // from class: com.fingerprintjs.android.fpjs_pro_internal.tM9319B53.1
                public static final char[] i;
                public static final int j;
                public static final boolean k;
                public static final boolean l;
                public static int m;
                public static int n;
                public static int o;
                public static int p;
                public static final byte[] q = null;

                static {
                    c();
                    o = 0;
                    p = 1;
                    m = 0;
                    n = 1;
                    i = new char[]{38940, 38967, 38946, 38939, 38955, 38981, 38956, 39015, 39004, 38950, 38938};
                    j = -1996121706;
                    k = true;
                    l = true;
                }

                public AnonymousClass1() {
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:4:0x0027). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static String a(int i3, byte b) {
                    int i4;
                    int i5;
                    int i6 = i3 + 107;
                    int i7 = (b * 2) + 1;
                    byte[] bArr = new byte[i7];
                    byte[] bArr2 = q;
                    int i8 = 3;
                    if (bArr2 == null) {
                        int i9 = 3;
                        int i10 = 0;
                        i6 += i8;
                        i8 = i9;
                        i4 = i10;
                        bArr[i4] = (byte) i6;
                        i5 = i4 + 1;
                        if (i5 == i7) {
                            return new String(bArr, 0);
                        }
                        int i11 = i8 + 1;
                        i9 = i11;
                        i8 = bArr2[i11];
                        i10 = i5;
                        i6 += i8;
                        i8 = i9;
                        i4 = i10;
                        bArr[i4] = (byte) i6;
                        i5 = i4 + 1;
                        if (i5 == i7) {
                        }
                    } else {
                        i4 = 0;
                        bArr[i4] = (byte) i6;
                        i5 = i4 + 1;
                        if (i5 == i7) {
                        }
                    }
                }

                public static void b(int i3, String str, Object[] objArr2) {
                    byte[] bytes = str.getBytes("ISO-8859-1");
                    cn cnVar = new cn();
                    Class cls = Integer.TYPE;
                    char[] cArr = i;
                    if (cArr != null) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr[i4])};
                                Object f = rV4669.f(-1231974710);
                                if (f == null) {
                                    f = rV4669.g(((Process.getThreadPriority(0) + 20) >> 6) + 4455, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 55064), (ViewConfiguration.getTapTimeout() >> 16) + 52, 1060459438, a(0, (byte) 0), new Class[]{cls});
                                }
                                cArr2[i4] = ((Character) ((Method) f).invoke(null, objArr3)).charValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        cArr = cArr2;
                    }
                    Object[] objArr4 = {Integer.valueOf(j)};
                    Object f2 = rV4669.f(910422024);
                    if (f2 == null) {
                        int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6409;
                        char red = (char) (Color.red(0) + 41548);
                        int resolveSize = 51 - View.resolveSize(0, 0);
                        byte length2 = (byte) q.length;
                        f2 = rV4669.g(i5, red, resolveSize, -1075368596, a(length2, (byte) (length2 - 4)), new Class[]{cls});
                    }
                    int intValue = ((Integer) ((Method) f2).invoke(null, objArr4)).intValue();
                    if (l) {
                        p = (o + 75) % 128;
                        int length3 = bytes.length;
                        cnVar.D8871 = length3;
                        char[] cArr3 = new char[length3];
                        cnVar.setPivotYN16904 = 0;
                        while (true) {
                            int i6 = cnVar.setPivotYN16904;
                            int i7 = cnVar.D8871;
                            if (i6 < i7) {
                                o = (p + 89) % 128;
                                cArr3[i6] = (char) (cArr[bytes[(i7 - 1) - i6] + i3] - intValue);
                                Object[] objArr5 = {cnVar, cnVar};
                                Object f3 = rV4669.f(1050500938);
                                if (f3 == null) {
                                    f3 = rV4669.g((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6511, (char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 52, -1220967890, a(1, (byte) 0), new Class[]{Object.class, Object.class});
                                }
                                ((Method) f3).invoke(null, objArr5);
                            } else {
                                objArr2[0] = new String(cArr3);
                                return;
                            }
                        }
                    } else {
                        if (k) {
                            int i8 = p + 17;
                            o = i8 % 128;
                            if (i8 % 2 != 0) {
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                }

                public static void c() {
                    q = new byte[]{81, MessagePack.Code.FIXEXT4, 96, 57};
                }

                public static void vD14832N6715(long j2, long j3) {
                    long j4;
                    int i3 = n + 31;
                    m = i3 % 128;
                    if (i3 % 2 != 0) {
                        j4 = j2 * (j3 >>> 35);
                        af.class.getField("a").get(null);
                    } else {
                        j4 = j2 ^ (j3 << 32);
                        af.class.getField("a").get(null);
                    }
                    n = (m + 109) % 128;
                    try {
                        Object[] objArr2 = {Long.valueOf(j4)};
                        Object[] objArr3 = new Object[1];
                        b(126 - MotionEvent.axisFromString(""), "\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                        Method method = Long.class.getMethod((String) objArr3[0], Long.TYPE);
                        method.setAccessible(true);
                        Object invoke = method.invoke(null, objArr2);
                        Object obj = ah.class.getField("INSTANCE").get(null);
                        Method method2 = ah.class.getMethod("component5", null);
                        method2.setAccessible(true);
                        Object invoke2 = method2.invoke(obj, null);
                        Object[] objArr4 = new Object[1];
                        b((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, "\u0089\u0088\u0088", objArr4);
                        Object[] objArr5 = {(String) objArr4[0], invoke};
                        Object[] objArr6 = new Object[1];
                        b(TextUtils.indexOf((CharSequence) "", '0', 0) + 128, "\u008b\u0084\u008a", objArr6);
                        Method method3 = Map.class.getMethod((String) objArr6[0], Object.class, Object.class);
                        method3.setAccessible(true);
                        method3.invoke(invoke2, objArr5);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }

                public final String d() {
                    m = (n + 17) % 128;
                    int i3 = tM9319B53.c;
                    int i4 = i3 + 117;
                    tM9319B53.d = i4 % 128;
                    int i5 = i4 % 2;
                    ContentResolver contentResolver = tM9319B53.this.a;
                    if (i5 == 0) {
                        int i6 = 85 / 0;
                    }
                    int i7 = i3 + 113;
                    tM9319B53.d = i7 % 128;
                    if (i7 % 2 != 0) {
                        contentResolver.getClass();
                        String string = Settings.Secure.getString(contentResolver, "android_id");
                        string.getClass();
                        int i8 = n + 109;
                        m = i8 % 128;
                        if (i8 % 2 == 0) {
                            return string;
                        }
                        throw null;
                    }
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ String invoke() {
                    n = (m + 27) % 128;
                    String d2 = d();
                    int i3 = n + 57;
                    m = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 1 / 0;
                    }
                    return d2;
                }
            }, 7, null};
            Boolean bool = Boolean.FALSE;
            Object f = rV4669.f(-308176489);
            if (f == null) {
                int tapTimeout = 1526 - (ViewConfiguration.getTapTimeout() >> 16);
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 52;
                Class cls = Long.TYPE;
                Class cls2 = Boolean.TYPE;
                f = rV4669.g(tapTimeout, jumpTapTimeout, i3, 1678066931, "D8871", new Class[]{cls, cls2, cls2, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke = ((Method) f).invoke(null, objArr);
            Result.Companion companion = Result.INSTANCE;
            if (invoke instanceof r5g) {
                int i4 = tM9319B53.d;
                tM9319B53.c = (i4 + 97) % 128;
                i = i4;
                invoke = "";
            } else {
                i = (tM9319B53.c + 1) % 128;
                tM9319B53.d = i;
            }
            String str = (String) invoke;
            int i5 = i + 11;
            tM9319B53.c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = e;
                d = (((i6 | 1) << 1) - (i6 ^ 1)) % 128;
                return str;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
