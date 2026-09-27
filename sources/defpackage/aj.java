package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.mlkit.common.MlKitException;
import io.sentry.util.l;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class aj extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ aj(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r3v44, types: [r6l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [lsl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object, vzn] */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                try {
                    return (Cipher) oe7.b.a.getInstance("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    xbc.m(e);
                    return null;
                }
            case 1:
                try {
                    return (Cipher) oe7.b.a.getInstance("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    xbc.m(e2);
                    return null;
                }
            case 2:
                try {
                    return (Cipher) oe7.b.a.getInstance("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    xbc.m(e3);
                    return null;
                }
            case 3:
                try {
                    return (Cipher) oe7.b.a.getInstance("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e4) {
                    xbc.m(e4);
                    return null;
                }
            case 4:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    r60 r60Var = new r60(choreographer, Handler.createAsync(myLooper));
                    return r60Var.plus(r60Var.k);
                }
                dmk.n("no Looper on this thread");
                return null;
            case 5:
                return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
            case 6:
                return new SimpleDateFormat("HH:mm:ss", Locale.US);
            case 7:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
            case 8:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return syb.b();
                }
                if (Looper.myLooper() == null) {
                    return null;
                }
                return new y39(new Handler(Looper.myLooper()));
            case 9:
                try {
                    return (Cipher) oe7.b.a.getInstance("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e5) {
                    xbc.m(e5);
                    return null;
                }
            case 10:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 11:
                return new PathMeasure();
            case 12:
                return new Path();
            case 13:
                return new Path();
            case 14:
                return new float[4];
            case 15:
                return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
            case 16:
                return new l();
            case 17:
                return Boolean.FALSE;
            case MlKitException.UNSUPPORTED /* 18 */:
                ?? obj = new Object();
                obj.a = 0;
                return obj;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return new Random();
            case 20:
                ?? obj2 = new Object();
                obj2.a = 0;
                return obj2;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return 0L;
            case 22:
                Thread.currentThread();
                if (y5n.b == null) {
                    y5n.b = Looper.getMainLooper().getThread();
                }
                ?? obj3 = new Object();
                obj3.a = false;
                obj3.b = null;
                Thread currentThread = Thread.currentThread();
                WeakHashMap weakHashMap = xyn.b;
                synchronized (weakHashMap) {
                    weakHashMap.put(currentThread, obj3);
                }
                return obj3;
            default:
                return new Random();
        }
    }
}
