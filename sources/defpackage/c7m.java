package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.fingerprintjs.android.fpjs_pro.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class c7m extends mlm {
    public char c;
    public long d;
    public String e;
    public final q6m f;
    public final q6m g;
    public final q6m h;
    public final q6m i;
    public final q6m j;
    public final q6m k;
    public final q6m l;
    public final q6m m;
    public final q6m n;

    public c7m(kfm kfmVar) {
        super(kfmVar);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new q6m(this, 6, false, false);
        this.g = new q6m(this, 6, true, false);
        this.h = new q6m(this, 6, false, true);
        this.i = new q6m(this, 5, false, false);
        this.j = new q6m(this, 5, true, false);
        this.k = new q6m(this, 5, false, true);
        this.l = new q6m(this, 4, false, false);
        this.m = new q6m(this, 3, false, false);
        this.n = new q6m(this, 2, false, false);
    }

    public static w6m k1(String str) {
        if (str == null) {
            return null;
        }
        return new w6m(str);
    }

    public static String n1(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String o1 = o1(obj, z);
        String o12 = o1(obj2, z);
        String o13 = o1(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(o1)) {
            sb.append(str2);
            sb.append(o1);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(o12)) {
            sb.append(str2);
            sb.append(o12);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(o13)) {
            sb.append(str3);
            sb.append(o13);
        }
        return sb.toString();
    }

    public static String o1(Object obj, boolean z) {
        String th;
        int lastIndexOf;
        String substring;
        String className;
        int lastIndexOf2;
        String substring2;
        String str = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            if (charAt == '-') {
                str = "-";
            }
            StringBuilder sb = new StringBuilder(g.d(str.length() + length + 3, String.valueOf(round2).length(), str));
            ix2.A(sb, str, round, "...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb2 = new StringBuilder(th);
            String canonicalName = kfm.class.getCanonicalName();
            if (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) {
                substring = "";
            } else {
                substring = canonicalName.substring(0, lastIndexOf);
            }
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length2 = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                    if (TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) {
                        substring2 = "";
                    } else {
                        substring2 = className.substring(0, lastIndexOf2);
                    }
                    if (substring2.equals(substring)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                }
                i++;
            }
            return sb2.toString();
        }
        if (obj instanceof w6m) {
            return ((w6m) obj).a;
        }
        if (z) {
            return "-";
        }
        return obj.toString();
    }

    @Override // defpackage.mlm
    public final boolean h1() {
        return false;
    }

    public final void l1(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m1(), i)) {
            Log.println(i, m1(), n1(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            arn.h(str);
            lem lemVar = ((kfm) this.a).g;
            if (lemVar == null) {
                Log.println(6, m1(), "Scheduler not set. Not logging error/warn");
            } else {
                if (!lemVar.b) {
                    Log.println(6, m1(), "Scheduler not initialized. Not logging error/warn");
                    return;
                }
                if (i >= 9) {
                    i = 8;
                }
                lemVar.p1(new k6m(this, i, str, obj, obj2, obj3));
            }
        }
    }

    public final String m1() {
        String str;
        synchronized (this) {
            try {
                str = this.e;
                if (str == null) {
                    ((kfm) ((kfm) this.a).d.a).getClass();
                    str = "FA";
                    this.e = "FA";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
