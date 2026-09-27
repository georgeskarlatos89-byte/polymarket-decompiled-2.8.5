package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gra {
    public static final /* synthetic */ vka[] q = {new eqc(gra.class, "_hasSetter", "get_hasSetter()Z", 0), new eqc(gra.class, "_hasGetter", "get_hasGetter()Z", 0)};
    public int a;
    public final String b;
    public final hra c;
    public final hra d;
    public final ArrayList e;
    public ira f;
    public final ArrayList g;
    public final ArrayList h;
    public mra i;
    public ira j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;

    public gra(String str, int i, int i2, int i3) {
        int i4;
        str.getClass();
        this.a = i;
        this.b = str;
        g78 g78Var = j78.C;
        g78Var.getClass();
        d78 d78Var = new d78(g78Var, 1);
        a78 a78Var = a78.g;
        int i5 = d78Var.b;
        if (i5 == 1 && (i4 = d78Var.c) == 1) {
            g78 g78Var2 = j78.B;
            g78Var2.getClass();
            d78 d78Var2 = new d78(g78Var2, 1);
            if (d78Var2.b == 1 && d78Var2.c == 1) {
                int i6 = 1 << d78Var2.a;
                hra hraVar = new hra(i2);
                vka[] vkaVarArr = q;
                vkaVarArr[1].getClass();
                a78Var.set(this, Integer.valueOf(i6 | this.a));
                this.c = hraVar;
                vkaVarArr[0].getClass();
                this.d = ((((Number) a78Var.get(this)).intValue() >>> d78Var.a) & ((1 << i5) - 1)) == i4 ? new hra(i3) : null;
                this.e = new ArrayList(0);
                this.g = new ArrayList(0);
                new ArrayList(0);
                this.h = new ArrayList();
                this.k = new ArrayList(0);
                this.l = new LinkedHashMap(0);
                this.m = new ArrayList(0);
                this.n = new ArrayList(0);
                this.o = new ArrayList(0);
                efc.a.getClass();
                List a = dfc.a();
                ArrayList arrayList = new ArrayList(CollectionsKt.w(a));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    ((cia) ((efc) it.next())).getClass();
                    arrayList.add(new Object());
                }
                this.p = arrayList;
                return;
            }
            f27.q(ix2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", d78Var2, " was passed"));
            throw null;
        }
        f27.q(ix2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", d78Var, " was passed"));
        throw null;
    }
}
