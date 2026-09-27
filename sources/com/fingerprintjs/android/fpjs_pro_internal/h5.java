package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.location.Location;
import android.os.Process;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import defpackage.cy7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/location/Location;", "a", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/location/Location;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class h5 extends Lambda implements Function1<SafeWithTimeoutProContext, Location> {
    public static int i;
    public static int j;
    public final /* synthetic */ k5 h;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/f2;", "Landroid/location/Location;", "", "vD14832N6715", "(Lcom/fingerprintjs/android/fpjs_pro_internal/f2;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a extends Lambda implements Function1<f2, Unit> {
        public static int i = 0;
        public static int j = 1;
        public final /* synthetic */ cy7 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cy7 cy7Var) {
            super(1);
            this.h = cy7Var;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
            Unit unit;
            int i8 = ~i7;
            int i9 = ~((~i4) | i8);
            int i10 = i2 | i9 | (~(i7 | i4));
            int i11 = (~(i4 | i2)) | (~(i8 | i4)) | (~(i8 | i2));
            int i12 = ((-914358272) * i5) + ((-1818230784) * i6) + (1796210688 * i3) + ((-2007367491) * i9) + (i11 * (-2007367491)) + (2007367491 * i10) + ((-491389116) * i7) + ((-211156802) * i2) + 1314914304;
            int a = com.fingerprintjs.android.fpjs_pro.g.a(i5, 1237199896, (1351532378 * i6) + i2 + i7 + i3);
            if (com.fingerprintjs.android.fpjs_pro.g.c(a, -77201408, (i5 * 1712827608) + (i6 * 1283666474) + (i3 * 406039561) + (i9 * 677) + (i11 * 677) + (i10 * (-677)) + (i7 * 406038884) + ((i2 * 406040238) - 634933780), 1831469056, ((-2051670016) * a) + i12) != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i13 = j;
                int i14 = ((i13 | 9) << 1) - (i13 ^ 9);
                i = i14 % 128;
                int i15 = i14 % 2;
                Object[] objArr2 = {aVar, (f2) obj};
                int D8871 = q3.D8871();
                int D88712 = q3.D8871();
                int D88713 = q3.D8871();
                int D88714 = q3.D8871();
                if (i15 != 0) {
                    a(objArr2, -1954127517, D88712, D8871, D88714, D88713, 1954127518);
                    unit = Unit.INSTANCE;
                    int i16 = 53 / 0;
                } else {
                    a(objArr2, -1954127517, D88712, D8871, D88714, D88713, 1954127518);
                    unit = Unit.INSTANCE;
                }
                int i17 = j;
                i = ((i17 ^ 51) + ((i17 & 51) << 1)) % 128;
                return unit;
            }
            a aVar2 = (a) objArr[0];
            f2 f2Var = (f2) objArr[1];
            Task e = aVar2.h.e();
            e.getClass();
            e.f(new j3(new g5(f2Var), 1)).d(new k3(f2Var, 2));
            int i18 = i + 87;
            j = i18 % 128;
            if (i18 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(f2 f2Var) {
            int D8871 = q3.D8871();
            return a(new Object[]{this, f2Var}, -622226258, q3.D8871(), D8871, q3.D8871(), q3.D8871(), 622226258);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(k5 k5Var) {
        super(1);
        this.h = k5Var;
    }

    public static int setPivotYN16904() {
        int i2 = i;
        int i3 = i2 % 9255952;
        i = i2 + 1;
        if (i3 != 0) {
            return j;
        }
        int myPid = Process.myPid();
        j = myPid;
        return myPid;
    }

    public final Location a(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i2 = k5.e;
        k5.d = ((i2 ^ 67) + ((i2 & 67) << 1)) % 128;
        Context context = this.h.a;
        int i3 = i2 + 93;
        k5.d = i3 % 128;
        if (i3 % 2 == 0) {
            a aVar = new a(LocationServices.a(context));
            ax axVar = new ax();
            aVar.invoke(axVar);
            return (Location) axVar.a();
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Location invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        return a(safeWithTimeoutProContext);
    }
}
