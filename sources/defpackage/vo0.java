package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.LocaleList;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vo0 implements k6c, tfd {
    public Object e;
    public Object f;
    public Object c = new Intent("android.intent.action.VIEW");
    public Object d = new Object();
    public int a = 0;
    public boolean b = true;

    public static String k(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.tfd
    public void a(sfd sfdVar) {
        synchronized (this.c) {
            jxh jxhVar = (jxh) ((HashMap) this.e).remove(sfdVar);
            if (jxhVar != null) {
                jxhVar.c.set(false);
                ((CopyOnWriteArraySet) this.f).remove(jxhVar);
            }
        }
    }

    public boolean b(int i, int i2) {
        zqc zqcVar = (zqc) this.d;
        int i3 = this.a;
        ijc ijcVar = (ijc) zqcVar.a[i + i3];
        ijc ijcVar2 = (ijc) ((zqc) this.e).a[i3 + i2];
        if (Intrinsics.areEqual(ijcVar, ijcVar2) || ijcVar.getClass() == ijcVar2.getClass()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tfd
    public void c(Executor executor, sfd sfdVar) {
        jxh jxhVar;
        synchronized (this.c) {
            jxh jxhVar2 = (jxh) ((HashMap) this.e).remove(sfdVar);
            if (jxhVar2 != null) {
                jxhVar2.c.set(false);
                ((CopyOnWriteArraySet) this.f).remove(jxhVar2);
            }
            jxhVar = new jxh((AtomicReference) this.d, executor, sfdVar);
            ((HashMap) this.e).put(sfdVar, jxhVar);
            ((CopyOnWriteArraySet) this.f).add(jxhVar);
        }
        jxhVar.a(0);
    }

    @Override // defpackage.k6c
    public void d() {
        so0.p((MediaCodec) this.c);
    }

    @Override // defpackage.k6c
    public void e(y6c y6cVar, Handler handler) {
        ((MediaCodec) this.c).setOnFrameRenderedListener(new to0(this, y6cVar, 0), handler);
    }

    @Override // defpackage.k6c
    public void f(int i, kf5 kf5Var, long j, int i2) {
        yo0 yo0Var = (yo0) this.e;
        yo0Var.c();
        xo0 b = yo0.b();
        b.a = i;
        b.b = 0;
        b.d = j;
        b.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = b.c;
        cryptoInfo.numSubSamples = kf5Var.f;
        int[] iArr = kf5Var.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = kf5Var.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = kf5Var.b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= bArr.length) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = kf5Var.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= bArr3.length) {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = kf5Var.c;
        if (u1k.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(kf5Var.g, kf5Var.h));
        }
        yo0Var.c.obtainMessage(2, b).sendToTarget();
    }

    @Override // defpackage.k6c
    public void flush() {
        ((yo0) this.e).a();
        ((MediaCodec) this.c).flush();
        zo0 zo0Var = (zo0) this.d;
        synchronized (zo0Var.a) {
            zo0Var.l++;
            Handler handler = zo0Var.c;
            int i = u1k.a;
            handler.post(new q1(zo0Var, 6));
        }
        ((MediaCodec) this.c).start();
    }

    @Override // defpackage.k6c
    public void g(int i) {
        ((MediaCodec) this.c).setVideoScalingMode(i);
    }

    @Override // defpackage.k6c
    public ByteBuffer getInputBuffer(int i) {
        return ((MediaCodec) this.c).getInputBuffer(i);
    }

    @Override // defpackage.k6c
    public ByteBuffer getOutputBuffer(int i) {
        return ((MediaCodec) this.c).getOutputBuffer(i);
    }

    @Override // defpackage.k6c
    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        zo0 zo0Var = (zo0) this.d;
        synchronized (zo0Var.a) {
            try {
                mediaFormat = zo0Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.k6c
    public void h(Surface surface) {
        ((MediaCodec) this.c).setOutputSurface(surface);
    }

    public bw4 i() {
        String str;
        Bundle bundle;
        Intent intent = (Intent) this.c;
        Bundle bundle2 = null;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            q(null, null);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.b);
        ((ah5) this.d).getClass();
        intent.putExtras(new Bundle());
        Bundle bundle3 = (Bundle) this.f;
        if (bundle3 != null) {
            intent.putExtras(bundle3);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.a);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            str = adjustedDefault.get(0).toLanguageTag();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (intent.hasExtra("com.android.browser.headers")) {
                bundle = intent.getBundleExtra("com.android.browser.headers");
            } else {
                bundle = new Bundle();
            }
            if (!bundle.containsKey("Accept-Language")) {
                bundle.putString("Accept-Language", str);
                intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ActivityOptions activityOptions = (ActivityOptions) this.e;
            if (activityOptions == null) {
                activityOptions = ActivityOptions.makeBasic();
                this.e = activityOptions;
            }
            o6.u(activityOptions);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.e) == null) {
                this.e = ActivityOptions.makeBasic();
            }
            z6.e((ActivityOptions) this.e, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions2 = (ActivityOptions) this.e;
        if (activityOptions2 != null) {
            bundle2 = activityOptions2.toBundle();
        }
        return new bw4(4, intent, bundle2);
    }

    @Override // defpackage.k6c
    public void j(int i) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, false);
    }

    public void l(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        boolean z;
        n19 n19Var;
        LoudnessCodecController loudnessCodecController;
        zo0 zo0Var = (zo0) this.d;
        MediaCodec mediaCodec = (MediaCodec) this.c;
        HandlerThread handlerThread = zo0Var.b;
        if (zo0Var.c == null) {
            z = true;
        } else {
            z = false;
        }
        pfn.f(z);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(zo0Var, handler);
        zo0Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        yo0 yo0Var = (yo0) this.e;
        HandlerThread handlerThread2 = yo0Var.b;
        if (!yo0Var.f) {
            handlerThread2.start();
            yo0Var.c = new wo0(yo0Var, handlerThread2.getLooper(), 0);
            yo0Var.f = true;
        }
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (u1k.a >= 35 && (n19Var = (n19) this.f) != null && ((loudnessCodecController = (LoudnessCodecController) n19Var.c) == null || so0.u(loudnessCodecController, mediaCodec))) {
            pfn.f(((HashSet) n19Var.b).add(mediaCodec));
        }
        this.a = 1;
    }

    @Override // defpackage.k6c
    public void m(long j, int i, int i2, int i3) {
        yo0 yo0Var = (yo0) this.e;
        yo0Var.c();
        xo0 b = yo0.b();
        b.a = i;
        b.b = i2;
        b.d = j;
        b.e = i3;
        wo0 wo0Var = yo0Var.c;
        int i4 = u1k.a;
        wo0Var.obtainMessage(1, b).sendToTarget();
    }

    @Override // defpackage.k6c
    public void n(int i, long j) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0034, B:26:0x004c, B:29:0x0042, B:30:0x004e, B:31:0x0053, B:33:0x0054, B:34:0x0056, B:35:0x0057, B:36:0x0059, B:37:0x005a, B:38:0x005c), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0034, B:26:0x004c, B:29:0x0042, B:30:0x004e, B:31:0x0053, B:33:0x0054, B:34:0x0056, B:35:0x0057, B:36:0x0059, B:37:0x005a, B:38:0x005c), top: B:3:0x000e }] */
    @Override // defpackage.k6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int o() {
        boolean z;
        ((yo0) this.e).c();
        zo0 zo0Var = (zo0) this.d;
        synchronized (zo0Var.a) {
            try {
                IllegalStateException illegalStateException = zo0Var.n;
                if (illegalStateException == null) {
                    MediaCodec.CodecException codecException = zo0Var.j;
                    if (codecException == null) {
                        MediaCodec.CryptoException cryptoException = zo0Var.k;
                        if (cryptoException == null) {
                            boolean z2 = false;
                            if (zo0Var.l <= 0 && !zo0Var.m) {
                                z = false;
                                int i = -1;
                                if (!z) {
                                    return -1;
                                }
                                c34 c34Var = zo0Var.d;
                                int i2 = c34Var.b;
                                int i3 = c34Var.c;
                                if (i2 == i3) {
                                    z2 = true;
                                }
                                if (!z2) {
                                    if (i2 != i3) {
                                        i = c34Var.a[i2];
                                        c34Var.b = (i2 + 1) & c34Var.d;
                                    } else {
                                        throw new ArrayIndexOutOfBoundsException();
                                    }
                                }
                                return i;
                            }
                            z = true;
                            int i4 = -1;
                            if (!z) {
                            }
                        } else {
                            zo0Var.k = null;
                            throw cryptoException;
                        }
                    } else {
                        zo0Var.j = null;
                        throw codecException;
                    }
                } else {
                    zo0Var.n = null;
                    throw illegalStateException;
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0035, B:25:0x0040, B:28:0x0044, B:30:0x0050, B:31:0x0077, B:35:0x006d, B:36:0x0079, B:37:0x007e, B:39:0x007f, B:40:0x0081, B:41:0x0082, B:42:0x0084, B:43:0x0085, B:44:0x0087), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0035, B:25:0x0040, B:28:0x0044, B:30:0x0050, B:31:0x0077, B:35:0x006d, B:36:0x0079, B:37:0x007e, B:39:0x007f, B:40:0x0081, B:41:0x0082, B:42:0x0084, B:43:0x0085, B:44:0x0087), top: B:3:0x000e }] */
    @Override // defpackage.k6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int p(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        ((yo0) this.e).c();
        zo0 zo0Var = (zo0) this.d;
        synchronized (zo0Var.a) {
            try {
                IllegalStateException illegalStateException = zo0Var.n;
                if (illegalStateException == null) {
                    MediaCodec.CodecException codecException = zo0Var.j;
                    if (codecException == null) {
                        MediaCodec.CryptoException cryptoException = zo0Var.k;
                        if (cryptoException == null) {
                            boolean z2 = false;
                            if (zo0Var.l <= 0 && !zo0Var.m) {
                                z = false;
                                if (!z) {
                                    return -1;
                                }
                                c34 c34Var = zo0Var.e;
                                int i = c34Var.b;
                                int i2 = c34Var.c;
                                if (i == i2) {
                                    z2 = true;
                                }
                                if (z2) {
                                    return -1;
                                }
                                if (i != i2) {
                                    int i3 = c34Var.a[i];
                                    c34Var.b = c34Var.d & (i + 1);
                                    if (i3 >= 0) {
                                        pfn.g(zo0Var.h);
                                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) zo0Var.f.remove();
                                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                                    } else if (i3 == -2) {
                                        zo0Var.h = (MediaFormat) zo0Var.g.remove();
                                    }
                                    return i3;
                                }
                                throw new ArrayIndexOutOfBoundsException();
                            }
                            z = true;
                            if (!z) {
                            }
                        } else {
                            zo0Var.k = null;
                            throw cryptoException;
                        }
                    } else {
                        zo0Var.j = null;
                        throw codecException;
                    }
                } else {
                    zo0Var.n = null;
                    throw illegalStateException;
                }
            } finally {
            }
        }
    }

    public void q(ch5 ch5Var, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", ch5Var);
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        ((Intent) this.c).putExtras(bundle);
    }

    public void r() {
        Intent intent = (Intent) this.c;
        this.a = 2;
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
    }

    @Override // defpackage.k6c
    public void release() {
        n19 n19Var;
        n19 n19Var2;
        try {
            if (this.a == 1) {
                yo0 yo0Var = (yo0) this.e;
                if (yo0Var.f) {
                    yo0Var.a();
                    yo0Var.b.quit();
                }
                yo0Var.f = false;
                zo0 zo0Var = (zo0) this.d;
                synchronized (zo0Var.a) {
                    zo0Var.m = true;
                    zo0Var.b.quit();
                    zo0Var.a();
                }
            }
            this.a = 2;
            if (!this.b) {
                try {
                    int i = u1k.a;
                    if (i >= 30 && i < 33) {
                        ((MediaCodec) this.c).stop();
                    }
                    if (i >= 35 && (n19Var2 = (n19) this.f) != null) {
                        n19Var2.P0((MediaCodec) this.c);
                    }
                    ((MediaCodec) this.c).release();
                    this.b = true;
                } finally {
                }
            }
        } catch (Throwable th) {
            if (!this.b) {
                try {
                    int i2 = u1k.a;
                    if (i2 >= 30 && i2 < 33) {
                        ((MediaCodec) this.c).stop();
                    }
                    if (i2 >= 35 && (n19Var = (n19) this.f) != null) {
                        n19Var.P0((MediaCodec) this.c);
                    }
                    ((MediaCodec) this.c).release();
                    this.b = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.k6c
    public void setParameters(Bundle bundle) {
        yo0 yo0Var = (yo0) this.e;
        yo0Var.c();
        wo0 wo0Var = yo0Var.c;
        int i = u1k.a;
        wo0Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.k6c
    public boolean u(q96 q96Var) {
        zo0 zo0Var = (zo0) this.d;
        synchronized (zo0Var.a) {
            zo0Var.o = q96Var;
        }
        return true;
    }
}
