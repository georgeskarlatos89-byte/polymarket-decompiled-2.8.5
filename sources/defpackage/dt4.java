package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class dt4 {
    public final String a;
    public final Context b;
    public int c;
    public int d;
    public final String e;
    public final dzh f;
    public final uhl g;
    public final int h;
    public final cyg i;
    public final b9j j;
    public final boolean k;
    public final long l;
    public final long m;
    public final dzh n;
    public final ah5 o;
    public final boolean p;
    public Boolean q;
    public String r;
    public final h4a s;
    public final boolean t;
    public final boolean u;
    public File v;
    public LinkedHashSet w;

    public dt4(String str, Context context, int i, int i2, String str2, dzh dzhVar, uhl uhlVar, int i3, cyg cygVar, b9j b9jVar, boolean z, long j, Set set, long j2, dzh dzhVar2, ah5 ah5Var, boolean z2, Boolean bool, String str3, h4a h4aVar, boolean z3, boolean z4) {
        str.getClass();
        context.getClass();
        str2.getClass();
        dzhVar.getClass();
        uhlVar.getClass();
        cygVar.getClass();
        b9jVar.getClass();
        set.getClass();
        dzhVar2.getClass();
        ah5Var.getClass();
        h4aVar.getClass();
        str.getClass();
        str2.getClass();
        dzhVar.getClass();
        uhlVar.getClass();
        cygVar.getClass();
        dzhVar2.getClass();
        ah5Var.getClass();
        this.a = str;
        this.b = context;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = dzhVar;
        this.g = uhlVar;
        this.h = i3;
        this.i = cygVar;
        this.j = b9jVar;
        this.k = z;
        this.l = j;
        this.m = j2;
        this.n = dzhVar2;
        this.o = ah5Var;
        this.p = z2;
        this.q = bool;
        this.r = str3;
        this.s = h4aVar;
        this.t = z3;
        this.u = z4;
        this.w = CollectionsKt.P0(set);
        new fh6(true, false, false, false).e.add(new bp(this, 13));
    }

    public final File a() {
        if (this.v == null) {
            Context context = this.b;
            File dir = context.getDir("amplitude", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append('/');
            File file = new File(dir, woa.r(sb, this.e, "/analytics/"));
            this.v = file;
            file.mkdirs();
        }
        File file2 = this.v;
        file2.getClass();
        return file2;
    }
}
