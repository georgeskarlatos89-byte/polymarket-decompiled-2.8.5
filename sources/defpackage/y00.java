package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y00 implements ViewTranslationCallback {
    public static final y00 a = new Object();

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(View view) {
        k6 k6Var;
        Function0 function0;
        view.getClass();
        i10 contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.e = d10.SHOW_ORIGINAL;
        c1a d = contentCaptureManager.d();
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ytg ytgVar = ((hug) objArr[(i << 3) + i3]).a.d;
                            if (cjj.e(ytgVar, kug.E) != null && (k6Var = (k6) cjj.e(ytgVar, xtg.n)) != null && (function0 = (Function0) k6Var.b) != null) {
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(View view) {
        k6 k6Var;
        Function1 function1;
        view.getClass();
        i10 contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.e = d10.SHOW_ORIGINAL;
        c1a d = contentCaptureManager.d();
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ytg ytgVar = ((hug) objArr[(i << 3) + i3]).a.d;
                            if (Intrinsics.areEqual(cjj.e(ytgVar, kug.E), Boolean.TRUE) && (k6Var = (k6) cjj.e(ytgVar, xtg.m)) != null && (function1 = (Function1) k6Var.b) != null) {
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(View view) {
        k6 k6Var;
        Function1 function1;
        view.getClass();
        i10 contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.e = d10.SHOW_TRANSLATED;
        c1a d = contentCaptureManager.d();
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ytg ytgVar = ((hug) objArr[(i << 3) + i3]).a.d;
                            if (Intrinsics.areEqual(cjj.e(ytgVar, kug.E), Boolean.FALSE) && (k6Var = (k6) cjj.e(ytgVar, xtg.m)) != null && (function1 = (Function1) k6Var.b) != null) {
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}
