package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import com.launchdarkly.sdk.j;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class a56 implements abc {
    public static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    public static final a56 d = new a56(true, null, null);
    public boolean a;
    public Object b;

    public a56(int i) {
        switch (i) {
            case 9:
                this.b = new Handler(Looper.getMainLooper(), new ia1(1));
                return;
            default:
                this.b = new SparseBooleanArray();
                return;
        }
    }

    public static void b(int i, ArrayList arrayList) {
        int i2 = 0;
        while (true) {
            if (i2 < 7) {
                if (c[i2] == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != -1 && !arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public static j c(String str, long j, l0a l0aVar) {
        j jVar = new j();
        jVar.e("kind", str);
        jVar.b(j, "creationDate");
        j jVar2 = new j();
        jVar2.e("diagnosticId", l0aVar.b);
        jVar2.e("sdkKeySuffix", l0aVar.c);
        jVar.d(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, jVar2.a());
        return jVar;
    }

    public static a56 v(String str) {
        return new a56(false, str, null);
    }

    public static a56 w(String str, Exception exc) {
        return new a56(false, str, exc);
    }

    public void a(int i) {
        pfn.f(!this.a);
        ((SparseBooleanArray) this.b).append(i, true);
    }

    public f78 d() {
        pfn.f(!this.a);
        this.a = true;
        return new f78((SparseBooleanArray) this.b);
    }

    public boolean e() {
        return this.a;
    }

    public el8 f(el8 el8Var) {
        String str;
        if (this.a && ((qf5) this.b).a(el8Var)) {
            dl8 a = el8Var.a();
            String str2 = el8Var.k;
            a.m = ggc.m("application/x-media3-cues");
            a.I = ((qf5) this.b).k(el8Var);
            StringBuilder sb = new StringBuilder();
            sb.append(el8Var.n);
            if (str2 != null) {
                str = ApiConstant.SPACE.concat(str2);
            } else {
                str = "";
            }
            sb.append(str);
            a.j = sb.toString();
            a.r = Long.MAX_VALUE;
            return new el8(a);
        }
        return el8Var;
    }

    @Override // defpackage.abc
    public void g(cac cacVar, boolean z) {
        i5j i5jVar = (i5j) this.b;
        if (this.a) {
            return;
        }
        this.a = true;
        i5jVar.a.a.dismissPopupMenus();
        i5jVar.b.onPanelClosed(108, cacVar);
        this.a = false;
    }

    public boolean h(CharSequence charSequence, int i) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            if (((vvn) this.b) == null) {
                return e();
            }
            char c2 = 2;
            for (int i2 = 0; i2 < i && c2 == 2; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                a56 a56Var = asi.a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c2 = 2;
                                break;
                        }
                    }
                    c2 = 0;
                }
                c2 = 1;
            }
            if (c2 == 0) {
                return true;
            }
            if (c2 == 1) {
                return false;
            }
            return e();
        }
        omf.a();
        return false;
    }

    public void i() {
        this.a = false;
    }

    public void j(byte b) {
        ((v0h) this.b).y(String.valueOf(b));
    }

    public void k(char c2) {
        v0h v0hVar = (v0h) this.b;
        v0hVar.k(v0hVar.b, 1);
        char[] cArr = (char[]) v0hVar.c;
        int i = v0hVar.b;
        v0hVar.b = i + 1;
        cArr[i] = c2;
    }

    public void l(int i) {
        ((v0h) this.b).y(String.valueOf(i));
    }

    public void m(long j) {
        ((v0h) this.b).y(String.valueOf(j));
    }

    public void n(String str) {
        str.getClass();
        ((v0h) this.b).y(str);
    }

    public void o(short s) {
        ((v0h) this.b).y(String.valueOf(s));
    }

    @Override // defpackage.abc
    public boolean p(cac cacVar) {
        ((i5j) this.b).b.onMenuOpened(108, cacVar);
        return true;
    }

    public void q(String str) {
        int i;
        str.getClass();
        v0h v0hVar = (v0h) this.b;
        v0hVar.k(v0hVar.b, str.length() + 2);
        char[] cArr = (char[]) v0hVar.c;
        int i2 = v0hVar.b;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c2 = cArr[i5];
            byte[] bArr = v1i.b;
            if (c2 < bArr.length && bArr[c2] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    v0hVar.k(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = v1i.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) v0hVar.c)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = v1i.a[charAt];
                                str2.getClass();
                                v0hVar.k(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) v0hVar.c, i5);
                                int length3 = str2.length() + i5;
                                v0hVar.b = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) v0hVar.c;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                v0hVar.b = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) v0hVar.c)[i5] = charAt;
                    }
                    i5 = i;
                }
                v0hVar.k(i5, 1);
                ((char[]) v0hVar.c)[i5] = '\"';
                v0hVar.b = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        v0hVar.b = i4 + 1;
    }

    public synchronized void r(h3g h3gVar, boolean z) {
        try {
            if (!this.a && !z) {
                this.a = true;
                h3gVar.b();
                this.a = false;
            }
            ((Handler) this.b).obtainMessage(1, h3gVar).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public /* synthetic */ a56(Object obj, boolean z) {
        this.b = obj;
    }

    public /* synthetic */ a56(boolean z, Object obj) {
        this.a = z;
        this.b = obj;
    }

    public a56(boolean z, String str, Exception exc) {
        this.a = z;
        this.b = exc;
    }

    public /* synthetic */ a56(Object obj) {
        this.b = obj;
        this.a = true;
    }

    public a56(vvn vvnVar, boolean z) {
        this((Object) vvnVar, false);
        this.a = z;
    }
}
