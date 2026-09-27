package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.r5g;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class setOnTouchListener {
    public static final char b;
    public static final char c;
    public static final char d;
    public static final char e;
    public static int f;
    public static int g;
    public static final int h;
    public static final byte[] i = null;
    public final ContentResolver a;

    static {
        d();
        h = 1;
        f = 0;
        g = 1;
        b = (char) 65432;
        c = (char) 60808;
        d = (char) 13905;
        e = (char) 31558;
    }

    public setOnTouchListener(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public static void D8871(long j, long j2) {
        long j3;
        int i2 = f + 113;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            j3 = j & (j2 >>> 90);
            af.class.getField("a").get(null);
        } else {
            j3 = j ^ (j2 << 32);
            af.class.getField("a").get(null);
        }
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            b("ꃹ퉑ම錩㋽䰂梁羙", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            b("붟⓸奣涝", 4 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            b("줒뻵顸盝", (ViewConfiguration.getTapTimeout() >> 16) + 3, objArr5);
            Method method3 = Map.class.getMethod((String) objArr5[0], Object.class, Object.class);
            method3.setAccessible(true);
            method3.invoke(invoke2, objArr4);
            int i3 = g + 27;
            f = i3 % 128;
            if (i3 % 2 == 0) {
            } else {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static String a() {
        int i2;
        byte[] bArr = new byte[1];
        if (i == null) {
            i2 = -65;
        } else {
            i2 = 65;
        }
        bArr[0] = (byte) i2;
        return new String(bArr, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.fingerprintjs.android.fpjs_pro_internal.co, java.lang.Object] */
    public static void b(String str, int i2, Object[] objArr) {
        char[] charArray;
        if ((h + 67) % 2 != 0) {
            charArray = str.toCharArray();
            int i3 = 23 / 0;
        } else {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        ?? obj = new Object();
        char[] cArr2 = new char[cArr.length];
        obj.component9 = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = obj.component9;
            if (i4 < cArr.length) {
                cArr3[0] = cArr[i4];
                char c2 = 1;
                cArr3[1] = cArr[i4 + 1];
                int i5 = 58224;
                int i6 = 0;
                while (i6 < 16) {
                    char c3 = cArr3[c2];
                    char c4 = cArr3[0];
                    char c5 = c2;
                    int i7 = i6;
                    int i8 = (c4 + i5) ^ ((c4 << 4) + ((char) (d ^ 6670137673230944684L)));
                    int i9 = c4 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(e);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[c5] = Integer.valueOf(i8);
                        objArr2[0] = Integer.valueOf(c3);
                        Object f2 = rV4669.f(13315690);
                        Class cls = Integer.TYPE;
                        if (f2 == null) {
                            f2 = rV4669.g((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5633, (char) (Process.myTid() >> 22), (ViewConfiguration.getEdgeSlop() >> 16) + 52, -1989151986, a(), new Class[]{cls, cls, cls, cls});
                        }
                        char charValue = ((Character) ((Method) f2).invoke(null, objArr2)).charValue();
                        cArr3[c5] = charValue;
                        char c6 = cArr3[0];
                        int i10 = (charValue + i5) ^ ((charValue << 4) + ((char) (b ^ 6670137673230944684L)));
                        int i11 = charValue >>> 5;
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(c);
                        objArr3[2] = Integer.valueOf(i11);
                        objArr3[c5] = Integer.valueOf(i10);
                        objArr3[0] = Integer.valueOf(c6);
                        Object f3 = rV4669.f(13315690);
                        if (f3 == null) {
                            f3 = rV4669.g(Gravity.getAbsoluteGravity(0, 0) + 5633, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 52 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1989151986, a(), new Class[]{cls, cls, cls, cls});
                        }
                        cArr3[0] = ((Character) ((Method) f3).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6 = i7 + 1;
                        c2 = c5;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                char c7 = c2;
                int i12 = obj.component9;
                cArr2[i12] = cArr3[0];
                cArr2[i12 + 1] = cArr3[c7];
                Object[] objArr4 = new Object[2];
                objArr4[c7] = obj;
                objArr4[0] = obj;
                Object f4 = rV4669.f(1265007788);
                if (f4 == null) {
                    f4 = rV4669.g(View.getDefaultSize(0, 0) + 2041, (char) (9856 - KeyEvent.getDeadChar(0, 0)), (Process.myTid() >> 22) + 51, -1027431992, "C", new Class[]{Object.class, Object.class});
                }
                ((Method) f4).invoke(null, objArr4);
            } else {
                objArr[0] = new String(cArr2, 0, i2);
                return;
            }
        }
    }

    public static void d() {
        i = new byte[]{101, 14, 96, MessagePack.Code.UINT64};
    }

    public final String c() {
        try {
            Object[] objArr = {0L, r0, r0, new v5(this), 7, null};
            Boolean bool = Boolean.FALSE;
            Object f2 = rV4669.f(-308176489);
            Object obj = "";
            if (f2 == null) {
                int alpha = 1526 - Color.alpha(0);
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int indexOf = 50 - TextUtils.indexOf((CharSequence) "", '0', 0);
                Class cls = Long.TYPE;
                Class cls2 = Boolean.TYPE;
                f2 = rV4669.g(alpha, maxKeyCode, indexOf, 1678066931, "D8871", new Class[]{cls, cls2, cls2, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke = ((Method) f2).invoke(null, objArr);
            Result.Companion companion = Result.INSTANCE;
            if (invoke instanceof r5g) {
                f = (g + 63) % 128;
            } else {
                obj = invoke;
            }
            String str = (String) obj;
            int i2 = g + 35;
            f = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 72 / 0;
            }
            return str;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final String e() {
        Cursor query;
        Uri parse = Uri.parse(w3.a);
        String[] strArr = {"android_id"};
        String str = null;
        try {
            ContentResolver contentResolver = this.a;
            contentResolver.getClass();
            query = contentResolver.query(parse, null, null, strArr, null);
        } catch (Exception unused) {
        }
        if (query == null) {
            return null;
        }
        if (query.moveToFirst() && query.getColumnCount() >= 2) {
            try {
                String hexString = Long.toHexString(Long.parseLong(query.getString(1)));
                query.close();
                g = (f + 13) % 128;
                str = hexString;
            } catch (NumberFormatException unused2) {
                query.close();
            }
            f = (g + 21) % 128;
            return str;
        }
        query.close();
        return null;
    }
}
