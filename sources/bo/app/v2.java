package bo.app;

import android.net.Uri;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.b69;
import defpackage.fl1;
import defpackage.il1;
import defpackage.in1;
import defpackage.jl1;
import defpackage.m67;
import defpackage.n1l;
import defpackage.p1l;
import defpackage.pm1;
import defpackage.qga;
import defpackage.r2g;
import defpackage.u0l;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class v2 extends ae implements y9 {
    public String b;
    public final wf c;
    public final w2 d;
    public Long e;
    public Long f;
    public String g;
    public String h;
    public String i;
    public p5 j;
    public String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(r2g r2gVar, String str, wf wfVar, w2 w2Var) {
        super(r2gVar);
        wfVar.getClass();
        w2Var.getClass();
        this.b = str;
        this.c = wfVar;
        this.d = w2Var;
    }

    public static final String b(v2 v2Var) {
        return ">> Request Uri: " + v2Var.f();
    }

    public static final String c(v2 v2Var) {
        return v2Var + " for " + v2Var.b() + " executed successfully.";
    }

    public static final String e() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
    }

    public static final String g() {
        return "******************************************************************";
    }

    public static final String h() {
        return "**                        !! WARNING !!                         **";
    }

    public static final String i() {
        return "**  The current API key/endpoint combination is invalid. This   **";
    }

    public static final String j() {
        return "** is potentially an integration error. Please ensure that your **";
    }

    public static final String k() {
        return "**     API key AND custom endpoint information are correct.     **";
    }

    public static final String l() {
        return "******************************************************************";
    }

    @Override // bo.app.la
    public void a(m8 m8Var, ha haVar, na naVar) {
        haVar.getClass();
        naVar.getClass();
        String a = naVar.a();
        pm1 pm1Var = pm1.W;
        b69.h(this, pm1Var, null, false, new u0l(a, 9), 6);
        if (naVar instanceof qb) {
            m8Var.b(naVar, qb.class);
            b69.h(this, pm1Var, null, false, new n1l(4), 6);
            b69.h(this, pm1Var, null, false, new n1l(5), 6);
            b69.h(this, pm1Var, null, false, new n1l(6), 6);
            b69.h(this, pm1Var, null, false, new n1l(7), 6);
            b69.h(this, pm1Var, null, false, new n1l(8), 6);
            b69.h(this, pm1Var, null, false, new p1l(this, 1), 6);
            b69.h(this, pm1Var, null, false, new p1l(this, 2), 6);
            b69.h(this, pm1Var, null, false, new n1l(3), 6);
        }
        if (naVar instanceof qe) {
            ((m8) haVar).b(new in1((qe) naVar), in1.class);
        }
    }

    public final r2g f() {
        Uri a;
        m67 m67Var = jl1.m;
        Uri uri = this.a.b;
        uri.getClass();
        ReentrantLock reentrantLock = jl1.r;
        reentrantLock.lock();
        try {
            il1 il1Var = jl1.s;
            if (il1Var != null) {
                try {
                    a = il1Var.a(uri);
                } catch (Exception e) {
                    b69.h(jl1.m, pm1.W, e, false, new fl1(18), 4);
                }
                if (a != null) {
                    reentrantLock.unlock();
                    uri = a;
                    return new r2g(uri);
                }
            }
            reentrantLock.unlock();
            return new r2g(uri);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public String toString() {
        return hashCode() + " - " + qga.e(a()) + "\nto target: " + f();
    }

    public /* synthetic */ v2(r2g r2gVar, String str, wf wfVar, w2 w2Var, int i) {
        this(r2gVar, (i & 2) != 0 ? null : str, wfVar, (i & 8) != 0 ? w2.UNKNOWN : w2Var);
    }

    @Override // bo.app.la
    public void b(m8 m8Var) {
        m8Var.getClass();
        m8Var.b(new be(this), be.class);
    }

    @Override // bo.app.la
    public void a(m8 m8Var, ha haVar, kc kcVar) {
        haVar.getClass();
        mf mfVar = kcVar.e;
        if (mfVar != null) {
            ((m8) haVar).b(new in1(new qe(mfVar.a, mfVar.b, mfVar.c, null)), in1.class);
        }
        b69.h(this, null, null, b() == x9.o, new p1l(this, 0), 3);
    }

    public void a(HashMap hashMap) {
        hashMap.put("X-Braze-Api-Key", this.h);
        String str = this.k;
        if (str != null && str.length() != 0) {
            hashMap.put("X-Braze-Auth-Signature", this.k);
        }
        w2 w2Var = this.d;
        if (w2Var != w2.UNKNOWN) {
            hashMap.put("X-Braze-Request-Initiated-By", w2Var.a);
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            p5 p5Var = this.j;
            if (p5Var != null && !p5Var.isEmpty()) {
                jSONObject.put("device", p5Var.forJsonPut());
            }
            String str = this.g;
            if (str != null) {
                jSONObject.put("device_id", str);
            }
            Long l = this.e;
            if (l != null) {
                jSONObject.put("time", l);
            }
            String str2 = this.h;
            if (str2 != null) {
                jSONObject.put("api_key", str2);
            }
            String str3 = this.i;
            if (str3 != null) {
                jSONObject.put(Keys.KEY_SDK_VERSION, str3);
            }
            return jSONObject;
        } catch (JSONException e) {
            b69.h(this, pm1.W, e, false, new n1l(2), 4);
            return null;
        }
    }

    public static final String a(String str) {
        return z0.a("Error occurred while executing Braze request: ", str);
    }

    public static final String a(v2 v2Var) {
        return ">> API key    : " + v2Var.h;
    }

    @Override // bo.app.la
    public void a(m8 m8Var) {
        m8Var.getClass();
        m8Var.b(new ce(this), ce.class);
    }
}
