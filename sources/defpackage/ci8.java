package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ci8 {
    public static final exb a = new exb(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final b7h d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new i9(4));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new b7h();
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((xh8) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #1 {all -> 0x00a6, all -> 0x0076, NameNotFoundException -> 0x009c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:24:0x0072, B:26:0x0087, B:29:0x0093, B:34:0x0077, B:35:0x007a, B:36:0x007b, B:38:0x002f, B:40:0x0037, B:43:0x003b, B:45:0x003f, B:47:0x004a, B:56:0x009c, B:23:0x006c), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #1 {all -> 0x00a6, all -> 0x0076, NameNotFoundException -> 0x009c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:24:0x0072, B:26:0x0087, B:29:0x0093, B:34:0x0077, B:35:0x007a, B:36:0x007b, B:38:0x002f, B:40:0x0037, B:43:0x003b, B:45:0x003f, B:47:0x004a, B:56:0x009c, B:23:0x006c), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bi8 b(String str, Context context, List list, int i) {
        Typeface typeface;
        int i2;
        Typeface a2;
        exb exbVar = a;
        Trace.beginSection(xmm.b("getFontSync"));
        try {
            typeface = (Typeface) exbVar.c(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new bi8(-1);
        } finally {
        }
        if (typeface != null) {
            return new bi8(typeface);
        }
        lh6 a3 = wh8.a(context, list);
        List list2 = a3.b;
        int i3 = a3.a;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = -2;
                if (i2 == 0) {
                    return new bi8(i2);
                }
                if (list2.size() > 1) {
                    sij sijVar = qij.a;
                    Trace.beginSection(xmm.b("TypefaceCompat.createFromFontInfoWithFallback"));
                    a2 = qij.a.d(context, list2, i);
                    Trace.endSection();
                } else {
                    a2 = qij.a(context, (ui8[]) list2.get(0), i);
                }
                if (a2 != null) {
                    exbVar.e(str, a2);
                    return new bi8(a2);
                }
                return new bi8(-3);
            }
            i2 = -3;
            if (i2 == 0) {
            }
        } else {
            ui8[] ui8VarArr = (ui8[]) list2.get(0);
            if (ui8VarArr != null && ui8VarArr.length != 0) {
                int length = ui8VarArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        int i5 = ui8VarArr[i4].f;
                        if (i5 != 0) {
                            if (i5 >= 0) {
                                i2 = i5;
                            }
                        } else {
                            i4++;
                        }
                    } else {
                        i2 = 0;
                        break;
                    }
                }
                if (i2 == 0) {
                }
            }
            i2 = 1;
            if (i2 == 0) {
            }
        }
    }
}
