package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xs6 {
    public final Context a;
    public final ys6 b;
    public VelocityTracker c;
    public float d;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public final int[] h = {bd0.API_PRIORITY_OTHER, 0};

    public xs6(Context context, ys6 ys6Var) {
        this.a = context;
        this.b = ys6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x00b8, code lost:
    
        if (r5 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0071, code lost:
    
        if (r14 >= 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MotionEvent motionEvent, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        float f;
        float f2;
        float f3;
        long j;
        int i8;
        float f4;
        float f5;
        float sqrt;
        float f6;
        float[] fArr;
        float f7;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i9 = this.f;
        int[] iArr = this.h;
        if (i9 == source && this.g == deviceId && this.e == i) {
            z = false;
            i2 = 1;
            i3 = 0;
        } else {
            Context context = this.a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 1;
            int i10 = Build.VERSION.SDK_INT;
            i3 = 0;
            if (i10 >= 34) {
                i4 = o6.n(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i, source2) != null) {
                    Resources resources = context.getResources();
                    if (source2 == 4194304 && i == 26) {
                        i5 = resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
                    } else {
                        i5 = -1;
                    }
                    Objects.requireNonNull(viewConfiguration);
                    if (i5 != -1) {
                        if (i5 != 0) {
                            i4 = resources.getDimensionPixelSize(i5);
                        }
                    } else {
                        i4 = viewConfiguration.getScaledMinimumFlingVelocity();
                    }
                }
                i4 = bd0.API_PRIORITY_OTHER;
            }
            iArr[0] = i4;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i10 >= 34) {
                i6 = o6.m(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i, source3) != null) {
                    Resources resources2 = context.getResources();
                    if (source3 == 4194304 && i == 26) {
                        i7 = resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                    } else {
                        i7 = -1;
                    }
                    Objects.requireNonNull(viewConfiguration);
                    if (i7 != -1) {
                        if (i7 != 0) {
                            i6 = resources2.getDimensionPixelSize(i7);
                        }
                    } else {
                        i6 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                }
                i6 = Integer.MIN_VALUE;
            }
            iArr[1] = i6;
            this.f = source;
            this.g = deviceId;
            this.e = i;
            z = true;
        }
        int i11 = iArr[i3];
        VelocityTracker velocityTracker = this.c;
        if (i11 == Integer.MAX_VALUE) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.c = null;
                return;
            }
            return;
        }
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.c = velocityTracker;
        }
        Map map = n5k.a;
        velocityTracker.addMovement(motionEvent);
        float f8 = 0.0f;
        int i12 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = n5k.a;
            if (!map2.containsKey(velocityTracker)) {
                map2.put(velocityTracker, new o5k());
            }
            o5k o5kVar = (o5k) map2.get(velocityTracker);
            long[] jArr = o5kVar.b;
            long eventTime = motionEvent.getEventTime();
            int i13 = o5kVar.d;
            if (i13 != 0 && eventTime - jArr[o5kVar.e] > 40) {
                o5kVar.d = i3;
                o5kVar.c = 0.0f;
                i13 = 0;
            }
            int i14 = (o5kVar.e + 1) % 20;
            o5kVar.e = i14;
            if (i13 != 20) {
                o5kVar.d = i13 + 1;
            }
            o5kVar.a[i14] = motionEvent.getAxisValue(26);
            jArr[o5kVar.e] = eventTime;
        }
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        o5k o5kVar2 = (o5k) n5k.a.get(velocityTracker);
        if (o5kVar2 != null) {
            float[] fArr2 = o5kVar2.a;
            long[] jArr2 = o5kVar2.b;
            int i15 = o5kVar2.d;
            if (i15 >= 2) {
                int i16 = o5kVar2.e;
                int i17 = ((i16 + 20) - (i15 - 1)) % 20;
                long j2 = jArr2[i16];
                while (true) {
                    j = jArr2[i17];
                    long j3 = j2 - j;
                    i8 = o5kVar2.d;
                    if (j3 <= 100) {
                        break;
                    }
                    o5kVar2.d = i8 - 1;
                    i17 = (i17 + 1) % 20;
                }
                if (i8 >= 2) {
                    if (i8 == 2) {
                        int i18 = (i17 + 1) % 20;
                        long j4 = jArr2[i18];
                        if (j != j4) {
                            sqrt = fArr2[i18] / ((float) (j4 - j));
                            f4 = Float.MAX_VALUE;
                            f = 0.0f;
                        }
                    } else {
                        f4 = Float.MAX_VALUE;
                        float f9 = 0.0f;
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            f5 = 1.0f;
                            if (i19 >= o5kVar2.d - 1) {
                                break;
                            }
                            int i21 = i19 + i17;
                            long j5 = jArr2[i21 % 20];
                            int i22 = (i21 + 1) % i12;
                            if (jArr2[i22] == j5) {
                                f6 = f8;
                                fArr = fArr2;
                            } else {
                                i20++;
                                if (f9 < f8) {
                                    f5 = -1.0f;
                                }
                                f6 = f8;
                                fArr = fArr2;
                                float sqrt2 = f5 * ((float) Math.sqrt(Math.abs(f9) * 2.0f));
                                float f10 = fArr[i22] / ((float) (jArr2[i22] - j5));
                                f9 += Math.abs(f10) * (f10 - sqrt2);
                                if (i20 == i2) {
                                    f9 *= 0.5f;
                                }
                            }
                            i19++;
                            f8 = f6;
                            fArr2 = fArr;
                            i12 = 20;
                            i2 = 1;
                        }
                        f = f8;
                        if (f9 < f) {
                            f5 = -1.0f;
                        }
                        sqrt = f5 * ((float) Math.sqrt(Math.abs(f9) * 2.0f));
                    }
                    f7 = sqrt * 1000.0f;
                    o5kVar2.c = f7;
                    if (f7 >= (-Math.abs(f4))) {
                        o5kVar2.c = -Math.abs(f4);
                    } else if (o5kVar2.c > Math.abs(f4)) {
                        o5kVar2.c = Math.abs(f4);
                    }
                }
            }
            f4 = Float.MAX_VALUE;
            sqrt = 0.0f;
            f = 0.0f;
            f7 = sqrt * 1000.0f;
            o5kVar2.c = f7;
            if (f7 >= (-Math.abs(f4))) {
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f2 = o6.g(velocityTracker, i);
        } else if (i == 0) {
            f2 = velocityTracker.getXVelocity();
        } else if (i == 1) {
            f2 = velocityTracker.getYVelocity();
        } else {
            o5k o5kVar3 = (o5k) n5k.a.get(velocityTracker);
            if (o5kVar3 != null && i == 26) {
                f2 = o5kVar3.c;
            } else {
                f2 = f;
            }
        }
        ys6 ys6Var = this.b;
        float c = ys6Var.c() * f2;
        float signum = Math.signum(c);
        if (z || (signum != Math.signum(this.d) && signum != f)) {
            ys6Var.d();
        }
        if (Math.abs(c) < iArr[0]) {
            return;
        }
        float max = Math.max(-r1, Math.min(c, iArr[1]));
        if (ys6Var.b(max)) {
            f3 = max;
        } else {
            f3 = f;
        }
        this.d = f3;
    }
}
