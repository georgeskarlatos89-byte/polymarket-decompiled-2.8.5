package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import android.text.InputFilter;
import com.checkout.components.ui.utils.extensions.Utils;
import com.google.mlkit.vision.barcode.common.Barcode;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class at0 {
    public static AudioManager a;
    public static final int[] b = {1, 2, 3, 6};
    public static final int[] c = {48000, AudioConstants.AUDIO_SAMPLE_RATE, 32000};
    public static final int[] d = {24000, 22050, 16000};
    public static final int[] e = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, Barcode.FORMAT_UPC_A, 576, 640};
    public static final int[] g = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final void a(final owi owiVar, final swi swiVar, eq9 eq9Var, String str, Function0 function0, eq9 eq9Var2, String str2, Function0 function02, final y5j y5jVar, boolean z, final a6j a6jVar, pq4 pq4Var, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        eq9 eq9Var3;
        int i6;
        int i7;
        int i8;
        int i9;
        eq9 eq9Var4;
        int i10;
        int i11;
        Function0 function03;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z2;
        sr8 sr8Var;
        final String str3;
        final Function0 function04;
        final String str4;
        final Function0 function05;
        final eq9 eq9Var5;
        final boolean z3;
        Function0 function06;
        Function0 function07;
        long m23toComposeColorvNxB06k;
        boolean j;
        int i19;
        owiVar.getClass();
        swiVar.getClass();
        a6jVar.getClass();
        long j2 = a6jVar.c;
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.g0(1498677704);
        if (sr8Var2.h(owiVar)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i20 = i | i4;
        if (sr8Var2.h(swiVar)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i21 = i20 | i5;
        int i22 = i3 & 4;
        if (i22 != 0) {
            i7 = i21 | 384;
            eq9Var3 = eq9Var;
        } else {
            eq9Var3 = eq9Var;
            if (sr8Var2.h(eq9Var3)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i7 = i21 | i6;
        }
        int i23 = i7 | 3072;
        int i24 = i3 & 16;
        if (i24 != 0) {
            i9 = i7 | 27648;
        } else {
            if (sr8Var2.j(function0)) {
                i8 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i8 = 8192;
            }
            i9 = i23 | i8;
        }
        int i25 = i3 & 32;
        if (i25 != 0) {
            i11 = i9 | 196608;
            eq9Var4 = eq9Var2;
        } else {
            eq9Var4 = eq9Var2;
            if (sr8Var2.h(eq9Var4)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i11 = i9 | i10;
        }
        int i26 = i11 | 1572864;
        int i27 = i3 & 128;
        if (i27 != 0) {
            i13 = i11 | 14155776;
            function03 = function02;
        } else {
            function03 = function02;
            if (sr8Var2.j(function03)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i13 = i26 | i12;
        }
        if (sr8Var2.h(y5jVar)) {
            i14 = 67108864;
        } else {
            i14 = 33554432;
        }
        int i28 = i13 | i14;
        int i29 = i3 & Barcode.FORMAT_UPC_A;
        if (i29 != 0) {
            i15 = i29;
            i16 = i28 | 805306368;
        } else {
            if ((i & 805306368) == 0) {
                i15 = i29;
                if (sr8Var2.i(z)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i28 |= i17;
            } else {
                i15 = i29;
            }
            i16 = i28;
        }
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                j = sr8Var2.h(a6jVar);
            } else {
                j = sr8Var2.j(a6jVar);
            }
            if (j) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i2 | i19;
        } else {
            i18 = i2;
        }
        if ((i16 & 306783379) == 306783378 && (i18 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (sr8Var2.V(i16 & 1, z2)) {
            eq9 eq9Var6 = null;
            if (i22 != 0) {
                eq9Var3 = null;
            }
            Object obj = oq4.a;
            if (i24 != 0) {
                Object Q = sr8Var2.Q();
                if (Q == obj) {
                    Q = new ljg(4);
                    sr8Var2.o0(Q);
                }
                function06 = (Function0) Q;
            } else {
                function06 = function0;
            }
            if (i25 == 0) {
                eq9Var6 = eq9Var4;
            }
            if (i27 != 0) {
                Object Q2 = sr8Var2.Q();
                if (Q2 == obj) {
                    Q2 = new ljg(5);
                    sr8Var2.o0(Q2);
                }
                function07 = (Function0) Q2;
            } else {
                function07 = function03;
            }
            if (i15 != 0) {
                z3 = true;
            } else {
                z3 = z;
            }
            float f2 = v5j.a;
            Utils utils = Utils.INSTANCE;
            long m23toComposeColorvNxB06k2 = utils.m23toComposeColorvNxB06k(j2);
            if (z3) {
                m23toComposeColorvNxB06k = utils.m23toComposeColorvNxB06k(a6jVar.b);
            } else {
                m23toComposeColorvNxB06k = utils.m23toComposeColorvNxB06k(j2);
            }
            long j3 = m23toComposeColorvNxB06k;
            long j4 = ib4.m;
            sr8Var = sr8Var2;
            te0.b(sel.d(1622691151, new bhg(3, swiVar, owiVar), sr8Var2), null, sel.d(1350636557, new gtc(eq9Var3, function06, a6jVar, 17), sr8Var2), sel.d(-116550972, new yd(eq9Var6, function07, a6jVar, 22), sr8Var2), 0.0f, 0.0f, null, v5j.c(m23toComposeColorvNxB06k2, j3, j4, j4, j4, j4, sr8Var2, 0), y5jVar, sr8Var, (i16 & 234881024) | 3462);
            Function0 function08 = function07;
            eq9Var5 = eq9Var6;
            function04 = function06;
            function05 = function08;
            str3 = "";
            str4 = str3;
        } else {
            sr8Var = sr8Var2;
            sr8Var.Y();
            str3 = str;
            function04 = function0;
            str4 = str2;
            function05 = function03;
            eq9Var5 = eq9Var4;
            z3 = z;
        }
        final eq9 eq9Var7 = eq9Var3;
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: qjg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int a2 = rtn.a(i | 1);
                    int a3 = rtn.a(i2);
                    at0.a(owi.this, swiVar, eq9Var7, str3, function04, eq9Var5, str4, function05, y5jVar, z3, a6jVar, (pq4) obj2, a2, a3, i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static int b(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0 && i < 3 && i2 >= 0 && i3 < 19) {
            int i4 = c[i];
            if (i4 == 44100) {
                return ((i2 % 2) + g[i3]) * 2;
            }
            int i5 = f[i3];
            if (i4 == 32000) {
                return i5 * 6;
            }
            return i5 * 4;
        }
        return -1;
    }

    public static synchronized AudioManager c(Context context) {
        synchronized (at0.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    a = null;
                }
                AudioManager audioManager = a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    us4 us4Var = new us4(0, false);
                    h31.b().execute(new e10(3, applicationContext, us4Var));
                    us4Var.a();
                    AudioManager audioManager2 = a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract InputFilter[] d(InputFilter[] inputFilterArr);

    public abstract boolean e();

    public abstract void f(boolean z);

    public abstract void g(boolean z);
}
