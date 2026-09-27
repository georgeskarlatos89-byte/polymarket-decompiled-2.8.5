package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.internal.l;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class o1k {
    public static volatile Handler c;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = new char[64];
    public static final int[] d = {96000, 88200, 64000, 48000, AudioConstants.AUDIO_SAMPLE_RATE, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final void a(List list, kjc kjcVar, pq4 pq4Var, int i) {
        int i2;
        boolean z;
        kjc kjcVar2;
        list.getClass();
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(604862030);
        if (sr8Var.j(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i3 & 1, z)) {
            kjcVar2 = kjcVar;
            de8.a(kjcVar2, null, null, null, 0, 0, sel.d(1825121395, new fe4(list, 1), sr8Var), sr8Var, 1572870, 62);
        } else {
            kjcVar2 = kjcVar;
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new r92(list, kjcVar2, i, 3);
        }
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        dmk.v("You must call this method on the main thread");
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int d(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    public static int e(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = i1k.a[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                if (i != 4) {
                    return 4;
                }
                return 8;
            }
        }
        return i2;
    }

    public static int f(wa3 wa3Var) {
        int i = wa3Var.i(4);
        if (i == 15) {
            if (wa3Var.b() >= 24) {
                return wa3Var.i(24);
            }
            throw dwd.a(null, "AAC header insufficient data");
        }
        if (i < 13) {
            return d[i];
        }
        throw dwd.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static ArrayList g(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler h() {
        if (c == null) {
            synchronized (o1k.class) {
                try {
                    if (c == null) {
                        c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static int i(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int j(int i, Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return i(hashCode, i);
    }

    public static boolean k(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (i2 <= 0 && i2 != Integer.MIN_VALUE) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static f0 l(wa3 wa3Var, boolean z) {
        int i = wa3Var.i(5);
        if (i == 31) {
            i = wa3Var.i(6) + 32;
        }
        int f = f(wa3Var);
        int i2 = wa3Var.i(4);
        String f2 = ace.f(i, "mp4a.40.");
        if (i == 5 || i == 29) {
            f = f(wa3Var);
            int i3 = wa3Var.i(5);
            if (i3 == 31) {
                i3 = wa3Var.i(6) + 32;
            }
            i = i3;
            if (i == 22) {
                i2 = wa3Var.i(4);
            }
        }
        if (z) {
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7 && i != 17) {
                switch (i) {
                    case zh4.REMOTE_EXCEPTION /* 19 */:
                    case 20:
                    case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw dwd.c("Unsupported audio object type: " + i);
                }
            }
            if (wa3Var.h()) {
                q7m.g("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (wa3Var.h()) {
                wa3Var.t(14);
            }
            boolean h = wa3Var.h();
            if (i2 != 0) {
                if (i == 6 || i == 20) {
                    wa3Var.t(3);
                }
                if (h) {
                    if (i == 22) {
                        wa3Var.t(16);
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        wa3Var.t(3);
                    }
                    wa3Var.t(1);
                }
                switch (i) {
                    case 17:
                    case zh4.REMOTE_EXCEPTION /* 19 */:
                    case 20:
                    case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    case 22:
                    case 23:
                        int i4 = wa3Var.i(2);
                        if (i4 == 2 || i4 == 3) {
                            throw dwd.c("Unsupported epConfig: " + i4);
                        }
                }
            } else {
                l.g();
                return null;
            }
        }
        int i5 = e[i2];
        if (i5 != -1) {
            return new f0(f, i5, f2);
        }
        throw dwd.a(null, null);
    }
}
