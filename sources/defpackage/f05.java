package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ScheduledExecutorService;
import org.webrtc.EglThread;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f05 implements ObjectConstructor, cfd, hkb, ikb, yk4, w57, EglThread.ReleaseMonitor {
    public final /* synthetic */ int a;

    public /* synthetic */ f05(int i) {
        this.a = i;
    }

    public static /* synthetic */ void c() {
        throw new RuntimeException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i, int i2, String str) {
        throw new IllegalArgumentException((str + i + ((char) i2)).toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Throwable th) {
        throw new SecurityException(str + obj, th);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new Exception(str + obj);
    }

    @Override // defpackage.w57
    public float a(float f) {
        float f2;
        float f3;
        switch (this.a) {
            case 23:
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f4 = f - 0.54545456f;
                    f2 = 7.5625f * f4 * f4;
                    f3 = 0.75f;
                } else if (f < 0.90909094f) {
                    float f5 = f - 0.8181818f;
                    f2 = 7.5625f * f5 * f5;
                    f3 = 0.9375f;
                } else {
                    float f6 = f - 0.95454544f;
                    f2 = 7.5625f * f6 * f6;
                    f3 = 0.984375f;
                }
                return f2 + f3;
            default:
                return f;
        }
    }

    public Constructor b() {
        switch (this.a) {
            case 13:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(su7.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(su7.class).getConstructor(null);
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.a) {
            case 0:
                return ConstructorConstructor.h();
            case 1:
                return new fib(true);
            case 2:
                return new LinkedHashMap();
            case 3:
                return new TreeMap();
            case 4:
                return ConstructorConstructor.b();
            case 5:
                return new ConcurrentHashMap();
            case 6:
                return ConstructorConstructor.l();
            case 7:
                return new ConcurrentSkipListMap();
            case 8:
                return ConstructorConstructor.r();
            default:
                return ConstructorConstructor.t();
        }
    }

    @Override // defpackage.yk4
    public Object create(uk4 uk4Var) {
        switch (this.a) {
            case 16:
                Set g = ((wtc) uk4Var).g(xif.a(hx0.class));
                jw8 jw8Var = jw8.c;
                if (jw8Var == null) {
                    synchronized (jw8.class) {
                        try {
                            jw8Var = jw8.c;
                            if (jw8Var == null) {
                                jw8Var = new jw8(0);
                                jw8.c = jw8Var;
                            }
                        } finally {
                        }
                    }
                }
                return new wh6(g, jw8Var);
            case 27:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 28:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            default:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
        }
    }

    @Override // defpackage.ikb
    public void d(Object obj, f78 f78Var) {
    }

    @Override // defpackage.hkb
    public void invoke(Object obj) {
    }

    @Override // org.webrtc.EglThread.ReleaseMonitor
    public boolean onRelease(EglThread eglThread) {
        return EglThread.b(eglThread);
    }
}
