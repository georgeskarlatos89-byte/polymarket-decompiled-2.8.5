package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dz0 {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;

    public dz0(String str, Set set, boolean z, boolean z2, boolean z3) {
        set.getClass();
        this.d = str;
        this.e = set;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public atc a() {
        e0d e0dVar = (e0d) this.d;
        if (e0dVar == null) {
            yzc yzcVar = e0d.Companion;
            Object obj = this.e;
            yzcVar.getClass();
            e0dVar = yzc.c(obj);
        }
        return new atc(e0dVar, this.a, this.e, this.b, this.c);
    }

    public boolean b() {
        if (!this.b) {
            this.b = true;
            iam iamVar = (iam) this.e;
            this.c = iamVar.k1().getBoolean((String) this.d, this.a);
        }
        return this.c;
    }

    public void c(boolean z) {
        SharedPreferences.Editor edit = ((iam) this.e).k1().edit();
        edit.putBoolean((String) this.d, z);
        edit.apply();
        this.c = z;
    }

    public dz0(iam iamVar, String str, boolean z) {
        this.e = iamVar;
        arn.e(str);
        this.d = str;
        this.a = z;
    }

    public dz0(String str, Set set, boolean z, int i) {
        this(str, set, true, true, (i & 16) != 0 ? false : z);
    }
}
