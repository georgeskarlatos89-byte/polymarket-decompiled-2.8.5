package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import com.socure.docv.capturesdk.common.utils.DeviceConstants;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class le3 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le3(int i, Class cls, String str) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((z24) obj).h);
            case 6:
                return Float.valueOf(((z24) obj).i);
            case 7:
                return Float.valueOf(((b34) obj).h);
            case 8:
                return Float.valueOf(((b34) obj).i);
            case 9:
                return Float.valueOf(((p17) obj).b());
            case 10:
                return Float.valueOf(((q8b) obj).h);
            case 11:
                return Float.valueOf(((s8b) obj).i);
            case 12:
                return Float.valueOf(((View) obj).getTransitionAlpha());
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                oe3 oe3Var = (oe3) obj;
                PointF pointF = (PointF) obj2;
                oe3Var.getClass();
                oe3Var.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                oe3Var.b = round;
                int i = oe3Var.f + 1;
                oe3Var.f = i;
                if (i == oe3Var.g) {
                    View view = oe3Var.e;
                    int i2 = oe3Var.a;
                    int i3 = oe3Var.c;
                    int i4 = oe3Var.d;
                    le3 le3Var = xbk.a;
                    view.setLeftTopRightBottom(i2, round, i3, i4);
                    oe3Var.f = 0;
                    oe3Var.g = 0;
                    return;
                }
                return;
            case 1:
                oe3 oe3Var2 = (oe3) obj;
                PointF pointF2 = (PointF) obj2;
                oe3Var2.getClass();
                oe3Var2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                oe3Var2.d = round2;
                int i5 = oe3Var2.g + 1;
                oe3Var2.g = i5;
                if (oe3Var2.f == i5) {
                    View view2 = oe3Var2.e;
                    int i6 = oe3Var2.a;
                    int i7 = oe3Var2.b;
                    int i8 = oe3Var2.c;
                    le3 le3Var2 = xbk.a;
                    view2.setLeftTopRightBottom(i6, i7, i8, round2);
                    oe3Var2.f = 0;
                    oe3Var2.g = 0;
                    return;
                }
                return;
            case 2:
                View view3 = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int left = view3.getLeft();
                int top = view3.getTop();
                int round3 = Math.round(pointF3.x);
                int round4 = Math.round(pointF3.y);
                le3 le3Var3 = xbk.a;
                view3.setLeftTopRightBottom(left, top, round3, round4);
                return;
            case 3:
                View view4 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                int round5 = Math.round(pointF4.x);
                int round6 = Math.round(pointF4.y);
                int right = view4.getRight();
                int bottom = view4.getBottom();
                le3 le3Var4 = xbk.a;
                view4.setLeftTopRightBottom(round5, round6, right, bottom);
                return;
            case 4:
                View view5 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round7 = Math.round(pointF5.x);
                int round8 = Math.round(pointF5.y);
                int width = view5.getWidth() + round7;
                int height = view5.getHeight() + round8;
                le3 le3Var5 = xbk.a;
                view5.setLeftTopRightBottom(round7, round8, width, height);
                return;
            case 5:
                z24 z24Var = (z24) obj;
                float floatValue = ((Float) obj2).floatValue();
                z24Var.h = floatValue;
                int i9 = (int) (floatValue * 5400.0f);
                xv7 xv7Var = z24Var.e;
                ArrayList arrayList = (ArrayList) z24Var.b;
                v17 v17Var = (v17) arrayList.get(0);
                float f = z24Var.h * 1520.0f;
                v17Var.a = (-20.0f) + f;
                v17Var.b = f;
                for (int i10 = 0; i10 < 4; i10++) {
                    v17Var.b = (xv7Var.getInterpolation(p6.j(i9, z24.k[i10], 667)) * 250.0f) + v17Var.b;
                    v17Var.a = (xv7Var.getInterpolation(p6.j(i9, z24.l[i10], 667)) * 250.0f) + v17Var.a;
                }
                float f2 = v17Var.a;
                float f3 = v17Var.b;
                v17Var.a = (((f3 - f2) * z24Var.i) + f2) / 360.0f;
                v17Var.b = f3 / 360.0f;
                int i11 = 0;
                while (true) {
                    if (i11 < 4) {
                        float j = p6.j(i9, z24.m[i11], 333);
                        if (j > 0.0f && j < 1.0f) {
                            int i12 = i11 + z24Var.g;
                            int[] iArr = z24Var.f.e;
                            int length = i12 % iArr.length;
                            int length2 = (length + 1) % iArr.length;
                            ((v17) arrayList.get(0)).c = ek0.a(xv7Var.getInterpolation(j), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2])).intValue();
                        } else {
                            i11++;
                        }
                    }
                }
                ((lt9) z24Var.a).invalidateSelf();
                return;
            case 6:
                ((z24) obj).i = ((Float) obj2).floatValue();
                return;
            case 7:
                b34 b34Var = (b34) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                b34Var.h = floatValue2;
                int i13 = (int) (floatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = b34Var.e;
                ArrayList arrayList2 = (ArrayList) b34Var.b;
                v17 v17Var2 = (v17) arrayList2.get(0);
                float f4 = b34Var.h * 1080.0f;
                int[] iArr2 = b34.l;
                float f5 = 0.0f;
                for (int i14 : iArr2) {
                    f5 += timeInterpolator.getInterpolation(p6.j(i13, i14, RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE)) * 90.0f;
                }
                v17Var2.g = f4 + f5;
                float interpolation = timeInterpolator.getInterpolation(p6.j(i13, 0, DeviceConstants.MIN_EXP_RAM)) - timeInterpolator.getInterpolation(p6.j(i13, DeviceConstants.MIN_EXP_RAM, DeviceConstants.MIN_EXP_RAM));
                v17Var2.a = 0.0f;
                float[] fArr = b34.m;
                float i15 = pfn.i(fArr[0], fArr[1], interpolation);
                v17Var2.b = i15;
                float f6 = b34Var.i;
                if (f6 > 0.0f) {
                    v17Var2.b = (1.0f - f6) * i15;
                }
                int i16 = 0;
                while (true) {
                    if (i16 < iArr2.length) {
                        float j2 = p6.j(i13, iArr2[i16], 100);
                        if (j2 >= 0.0f && j2 <= 1.0f) {
                            int i17 = i16 + b34Var.g;
                            int[] iArr3 = b34Var.f.e;
                            int length3 = i17 % iArr3.length;
                            int length4 = (length3 + 1) % iArr3.length;
                            ((v17) arrayList2.get(0)).c = ek0.a(timeInterpolator.getInterpolation(j2), Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4])).intValue();
                        } else {
                            i16++;
                        }
                    }
                }
                ((lt9) b34Var.a).invalidateSelf();
                return;
            case 8:
                ((b34) obj).i = ((Float) obj2).floatValue();
                return;
            case 9:
                p17 p17Var = (p17) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                if (p17Var.i != floatValue3) {
                    p17Var.i = floatValue3;
                    p17Var.invalidateSelf();
                    return;
                }
                return;
            case 10:
                q8b q8bVar = (q8b) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                q8bVar.h = floatValue4;
                ArrayList arrayList3 = (ArrayList) q8bVar.b;
                ((v17) arrayList3.get(0)).a = 0.0f;
                float j3 = p6.j((int) (floatValue4 * 333.0f), 0, 667);
                v17 v17Var3 = (v17) arrayList3.get(0);
                v17 v17Var4 = (v17) arrayList3.get(1);
                xv7 xv7Var2 = q8bVar.d;
                float interpolation2 = xv7Var2.getInterpolation(j3);
                v17Var4.a = interpolation2;
                v17Var3.b = interpolation2;
                v17 v17Var5 = (v17) arrayList3.get(1);
                v17 v17Var6 = (v17) arrayList3.get(2);
                float interpolation3 = xv7Var2.getInterpolation(j3 + 0.49925038f);
                v17Var6.a = interpolation3;
                v17Var5.b = interpolation3;
                ((v17) arrayList3.get(2)).b = 1.0f;
                if (q8bVar.g && ((v17) arrayList3.get(1)).b < 1.0f) {
                    ((v17) arrayList3.get(2)).c = ((v17) arrayList3.get(1)).c;
                    ((v17) arrayList3.get(1)).c = ((v17) arrayList3.get(0)).c;
                    ((v17) arrayList3.get(0)).c = q8bVar.e.e[q8bVar.f];
                    q8bVar.g = false;
                }
                ((lt9) q8bVar.a).invalidateSelf();
                return;
            case 11:
                s8b s8bVar = (s8b) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                s8bVar.i = floatValue5;
                int i18 = (int) (floatValue5 * 1800.0f);
                Interpolator[] interpolatorArr = s8bVar.e;
                ArrayList arrayList4 = (ArrayList) s8bVar.b;
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    v17 v17Var7 = (v17) arrayList4.get(i19);
                    int[] iArr4 = s8b.l;
                    int i20 = i19 * 2;
                    int i21 = iArr4[i20];
                    int[] iArr5 = s8b.k;
                    v17Var7.a = qfn.a(interpolatorArr[i20].getInterpolation(p6.j(i18, i21, iArr5[i20])), 0.0f, 1.0f);
                    int i22 = i20 + 1;
                    v17Var7.b = qfn.a(interpolatorArr[i22].getInterpolation(p6.j(i18, iArr4[i22], iArr5[i22])), 0.0f, 1.0f);
                }
                if (s8bVar.h) {
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((v17) it.next()).c = s8bVar.f.e[s8bVar.g];
                    }
                    s8bVar.h = false;
                }
                ((lt9) s8bVar.a).invalidateSelf();
                return;
            case 12:
                ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
