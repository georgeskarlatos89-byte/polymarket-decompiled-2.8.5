package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import io.sentry.android.core.m0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ie5 extends zd5 {
    public final Context d;
    public od5 e;
    public Executor f;
    public CancellationSignal g;
    public final cd5 h;

    public ie5(Context context) {
        context.getClass();
        this.d = context;
        this.h = new cd5(this, new Handler(Looper.getMainLooper()), 3);
    }

    public static dv8 c(ju8 ju8Var) {
        ju8Var.getClass();
        List list = ju8Var.a;
        if (list.size() == 1) {
            Object obj = list.get(0);
            obj.getClass();
            ev8 ev8Var = (ev8) obj;
            String str = ev8Var.f;
            arn.h(str);
            return new dv8(0, str, null, null, ev8Var.g, false);
        }
        throw new mu8("GetSignInWithGoogleOption cannot be combined with other options.");
    }

    public final ku8 d(d6h d6hVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        String str5 = d6hVar.g;
        gx8 gx8Var = null;
        if (str5 != null) {
            String str6 = d6hVar.a;
            str6.getClass();
            try {
                str5.getClass();
                String str7 = d6hVar.b;
                if (str7 != null) {
                    str = str7;
                } else {
                    str = null;
                }
                String str8 = d6hVar.c;
                if (str8 != null) {
                    str2 = str8;
                } else {
                    str2 = null;
                }
                String str9 = d6hVar.d;
                if (str9 != null) {
                    str3 = str9;
                } else {
                    str3 = null;
                }
                String str10 = d6hVar.h;
                if (str10 != null) {
                    str4 = str10;
                } else {
                    str4 = null;
                }
                Uri uri2 = d6hVar.e;
                if (uri2 != null) {
                    uri = uri2;
                } else {
                    uri = null;
                }
                gx8Var = new gx8(str6, str5, str, str3, str2, uri, str4);
            } catch (Exception unused) {
                throw new lu8("When attempting to convert get response, null Google ID Token found");
            }
        } else {
            m0.p("GetSignInIntent", "Credential returned but no google Id found");
        }
        if (gx8Var != null) {
            return new ku8(gx8Var);
        }
        throw new lu8("When attempting to convert get response, null credential found");
    }

    public final od5 e() {
        od5 od5Var = this.e;
        if (od5Var != null) {
            return od5Var;
        }
        Intrinsics.i("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f;
        if (executor != null) {
            return executor;
        }
        Intrinsics.i("executor");
        throw null;
    }

    public final void g(ju8 ju8Var, CancellationSignal cancellationSignal, Executor executor, od5 od5Var) {
        ju8Var.getClass();
        od5Var.getClass();
        executor.getClass();
        this.g = cancellationSignal;
        this.e = od5Var;
        this.f = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (!me5.a(cancellationSignal)) {
            try {
                dv8 c = c(ju8Var);
                y3l b = a6m.b(this.d);
                String str = c.a;
                arn.h(str);
                String str2 = c.d;
                dv8 dv8Var = new dv8(c.f, str, c.b, b.a, str2, c.e);
                di1 a = dpi.a();
                a.e = new gw7[]{a4l.b};
                a.d = new e3g(b, dv8Var);
                a.b = 1555;
                b.doRead(a.a()).f(new a5e(new g75(8, cancellationSignal, this), 23)).d(new vt0(7, this, cancellationSignal));
            } catch (mu8 e) {
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!me5.a(cancellationSignal)) {
                    f().execute(new vd5(3, this, e));
                }
            }
        }
    }
}
