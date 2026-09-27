package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.android.R;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class drl {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, AudioConstants.AUDIO_SAMPLE_RATE, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, Barcode.FORMAT_UPC_A, 640, 768, 896, Barcode.FORMAT_UPC_E, ConstantsKt.MIN_BACK_CAMERA_HEIGHT, ConstantsKt.MIN_FRONT_CAMERA_WIDTH, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, AudioConstants.AUDIO_BIT_RATE, 22050, AudioConstants.AUDIO_SAMPLE_RATE, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    public static wa3 a(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 != Byte.MAX_VALUE && b2 != 100 && b2 != 64 && b2 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b3 = copyOf[0];
            if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
                for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                    byte b4 = copyOf[i2];
                    int i3 = i2 + 1;
                    copyOf[i2] = copyOf[i3];
                    copyOf[i3] = b4;
                }
            }
            wa3 wa3Var = new wa3(copyOf.length, copyOf);
            if (copyOf[0] == 31) {
                wa3 wa3Var2 = new wa3(copyOf.length, copyOf);
                while (wa3Var2.b() >= 16) {
                    wa3Var2.t(2);
                    int i4 = wa3Var2.i(14) & 16383;
                    int min = Math.min(8 - wa3Var.d, 14);
                    int i5 = wa3Var.d;
                    int i6 = (8 - i5) - min;
                    byte[] bArr3 = wa3Var.b;
                    int i7 = wa3Var.c;
                    byte b5 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr3[i7]);
                    bArr3[i7] = b5;
                    int i8 = 14 - min;
                    bArr3[i7] = (byte) (b5 | ((i4 >>> i8) << i6));
                    int i9 = i7 + 1;
                    while (true) {
                        bArr2 = wa3Var.b;
                        if (i8 > 8) {
                            bArr2[i9] = (byte) (i4 >>> (i8 - 8));
                            i8 -= 8;
                            i9++;
                        }
                    }
                    int i10 = 8 - i8;
                    byte b6 = (byte) (bArr2[i9] & ((1 << i10) - 1));
                    bArr2[i9] = b6;
                    bArr2[i9] = (byte) (((i4 & ((1 << i8) - 1)) << i10) | b6);
                    wa3Var.t(14);
                    wa3Var.a();
                }
            }
            wa3Var.o(copyOf.length, copyOf);
            return wa3Var;
        }
        return new wa3(bArr.length, bArr);
    }

    public static final String b(pq4 pq4Var, int i2) {
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.l(AndroidCompositionLocals_androidKt.a);
        Resources resources = ((Context) sr8Var.l(AndroidCompositionLocals_androidKt.b)).getResources();
        if (i2 == 0) {
            return resources.getString(R.string.navigation_menu);
        }
        if (i2 == 1) {
            return resources.getString(R.string.close_drawer);
        }
        if (i2 == 2) {
            return resources.getString(R.string.close_sheet);
        }
        if (i2 == 3) {
            return resources.getString(R.string.default_error_message);
        }
        if (i2 == 4) {
            return resources.getString(R.string.dropdown_menu);
        }
        if (i2 == 5) {
            return resources.getString(R.string.range_start);
        }
        if (i2 == 6) {
            return resources.getString(R.string.range_end);
        }
        if (i2 == 7) {
            return resources.getString(R.string.mc2_snackbar_pane_title);
        }
        return "";
    }

    public static int c(wa3 wa3Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && wa3Var.h(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return wa3Var.i(iArr[i2]) + i4;
    }

    public static final Bundle d(String str, String str2) {
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }
}
