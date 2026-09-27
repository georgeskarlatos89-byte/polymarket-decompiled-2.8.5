package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.compose.ui.text.input.OffsetMapping;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dm0 implements w3k, tof, edd, OffsetMapping, e5k, k57 {
    public static final dm0 c = new dm0(0, 0);
    public static final dm0 d = new dm0(1, 0);
    public static final Object e = new Object();
    public static volatile dm0 f;
    public final /* synthetic */ int a;
    public int b;

    public dm0(Intent intent) {
        Uri data;
        int i;
        this.a = 3;
        if (intent == null) {
            data = null;
        } else {
            data = intent.getData();
        }
        if (data != null) {
            i = -1;
        } else {
            i = 0;
        }
        this.b = i;
    }

    public static dm0 g() {
        dm0 dm0Var;
        synchronized (e) {
            try {
                if (f == null) {
                    f = new dm0(3, 1);
                }
                dm0Var = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dm0Var;
    }

    public static String j(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // defpackage.w3k
    public Object M(vfa vfaVar, float f2) {
        boolean z;
        int i;
        float f3;
        int i2;
        int argb;
        float f4;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = 0;
        if (vfaVar.o() == tfa.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            vfaVar.beginArray();
        }
        while (vfaVar.hasNext()) {
            arrayList.add(Float.valueOf((float) vfaVar.nextDouble()));
        }
        int i5 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.b = 2;
        }
        if (z) {
            vfaVar.endArray();
        }
        int i6 = this.b;
        if (i6 == -1) {
            i6 = arrayList.size() / 4;
            this.b = i6;
        }
        float[] fArr = new float[i6];
        int[] iArr = new int[i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = this.b * 4;
            if (i7 >= i) {
                break;
            }
            int i10 = i7 / 4;
            double floatValue = ((Float) arrayList.get(i7)).floatValue();
            int i11 = i4;
            int i12 = i7 % 4;
            if (i12 != 0) {
                if (i12 != i3) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            iArr[i10] = Color.argb(255, i8, i9, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i9 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i8 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i10 > 0) {
                    float f5 = (float) floatValue;
                    if (fArr[i10 - 1] >= f5) {
                        fArr[i10] = f5 + 0.01f;
                    }
                }
                fArr[i10] = (float) floatValue;
            }
            i7++;
            i4 = i11;
            i3 = 1;
        }
        int i13 = i4;
        vz8 vz8Var = new vz8(fArr, iArr);
        if (arrayList.size() <= i) {
            return vz8Var;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i14 = i13;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i14] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i14] = ((Float) arrayList.get(i)).floatValue();
                i14++;
            }
            i++;
        }
        float[] fArr4 = vz8Var.a;
        if (fArr4.length == 0) {
            fArr4 = fArr2;
        } else if (size != 0) {
            int length = fArr4.length + size;
            float[] fArr5 = new float[length];
            int i15 = i13;
            int i16 = i15;
            int i17 = i16;
            int i18 = i17;
            while (i15 < length) {
                float f6 = Float.NaN;
                if (i17 < fArr4.length) {
                    f3 = fArr4[i17];
                } else {
                    f3 = Float.NaN;
                }
                if (i18 < size) {
                    f6 = fArr2[i18];
                }
                if (!Float.isNaN(f6) && f3 >= f6) {
                    if (!Float.isNaN(f3) && f6 >= f3) {
                        fArr5[i15] = f3;
                        i17++;
                        i18++;
                        i16++;
                    } else {
                        fArr5[i15] = f6;
                        i18++;
                    }
                } else {
                    fArr5[i15] = f3;
                    i17++;
                }
                i15++;
            }
            if (i16 == 0) {
                fArr4 = fArr5;
            } else {
                fArr4 = Arrays.copyOf(fArr5, length - i16);
            }
        }
        int length2 = fArr4.length;
        int[] iArr2 = new int[length2];
        int i19 = i13;
        while (i19 < length2) {
            float f7 = fArr4[i19];
            int binarySearch = Arrays.binarySearch(fArr, f7);
            int binarySearch2 = Arrays.binarySearch(fArr2, f7);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                int i20 = iArr[binarySearch];
                if (size >= i5 && f7 > fArr2[i13]) {
                    for (int i21 = 1; i21 < size; i21++) {
                        float f8 = fArr2[i21];
                        if (f8 >= f7 || i21 == size - 1) {
                            if (f8 <= f7) {
                                f4 = fArr3[i21];
                            } else {
                                int i22 = i21 - 1;
                                float f9 = fArr2[i22];
                                f4 = tgc.f(fArr3[i22], fArr3[i21], (f7 - f9) / (f8 - f9));
                            }
                            argb = Color.argb((int) (f4 * 255.0f), Color.red(i20), Color.green(i20), Color.blue(i20));
                        }
                    }
                    dmk.v("Unreachable code.");
                    return null;
                }
                argb = Color.argb((int) (fArr3[i13] * 255.0f), Color.red(i20), Color.green(i20), Color.blue(i20));
                iArr2[i19] = argb;
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f10 = fArr3[binarySearch2];
                if (i6 >= i5 && f7 != fArr[i13]) {
                    for (int i23 = 1; i23 < i6; i23++) {
                        float f11 = fArr[i23];
                        if (f11 >= f7 || i23 == i6 - 1) {
                            if (i23 == i6 - 1 && f7 >= f11) {
                                i2 = Color.argb((int) (f10 * 255.0f), Color.red(iArr[i23]), Color.green(iArr[i23]), Color.blue(iArr[i23]));
                            } else {
                                int i24 = i23 - 1;
                                float f12 = fArr[i24];
                                int i25 = iArr[i23];
                                int c2 = sql.c(iArr[i24], (f7 - f12) / (f11 - f12), i25);
                                i2 = Color.argb((int) (f10 * 255.0f), Color.red(c2), Color.green(c2), Color.blue(c2));
                            }
                        }
                    }
                    dmk.v("Unreachable code.");
                    return null;
                }
                i2 = iArr[i13];
                iArr2[i19] = i2;
            }
            i19++;
            i5 = 2;
        }
        return new vz8(fArr4, iArr2);
    }

    @Override // defpackage.k57
    public int b(Context context, String str, boolean z) {
        return 0;
    }

    @Override // defpackage.k57
    public int c(Context context, String str) {
        return this.b;
    }

    public void e(String str, String str2) {
        if (this.b <= 6) {
            m0.d(str, str2);
        }
    }

    public void f(String str, String str2, Throwable th) {
        if (this.b <= 6) {
            m0.e(str, str2, th);
        }
    }

    @Override // defpackage.tof
    public Object getValue(Object obj, vka vkaVar) {
        jgj jgjVar = (jgj) obj;
        jgjVar.getClass();
        vkaVar.getClass();
        return jgjVar.a.get(this.b);
    }

    public void h(String str, String str2) {
        if (this.b <= 4) {
            Log.i(str, str2);
        }
    }

    @Override // defpackage.e5k
    public int i() {
        return this.b;
    }

    @Override // defpackage.e5k
    public int k() {
        return 0;
    }

    public void m(String str, String str2) {
        if (this.b <= 5) {
            m0.p(str, str2);
        }
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int s(int i) {
        if (i <= this.b) {
            return i;
        }
        return i - 1;
    }

    @Override // defpackage.edd
    public String t() {
        switch (this.a) {
            case 9:
                return ix2.i(this.b, " digits", new StringBuilder("expected at least "));
            default:
                return ix2.i(this.b, " digits", new StringBuilder("expected at most "));
        }
    }

    @Override // defpackage.c5k
    public sa0 u(long j, sa0 sa0Var, sa0 sa0Var2, sa0 sa0Var3) {
        if (j < this.b * 1000000) {
            return sa0Var;
        }
        return sa0Var2;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int v(int i) {
        if (i <= this.b) {
            return i;
        }
        return i + 1;
    }

    public /* synthetic */ dm0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public dm0() {
        this.a = 5;
        this.b = Build.VERSION.SDK_INT;
    }

    public /* synthetic */ dm0(int i) {
        this.a = i;
    }

    @Override // defpackage.c5k
    public sa0 r(long j, sa0 sa0Var, sa0 sa0Var2, sa0 sa0Var3) {
        return sa0Var3;
    }
}
