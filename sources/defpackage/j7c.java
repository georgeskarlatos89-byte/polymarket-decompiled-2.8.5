package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j7c {
    public static final /* synthetic */ int g = 0;
    public final String a;
    public final g7c b;
    public final f7c c;
    public final n7c d;
    public final d7c e;
    public final h7c f;

    static {
        t68 t68Var = new t68();
        new d85();
        List list = Collections.EMPTY_LIST;
        we8 we8Var = jr9.b;
        wwf wwfVar = wwf.e;
        e7c e7cVar = new e7c();
        h7c h7cVar = h7c.a;
        new c7c(t68Var);
        new f7c(e7cVar);
        n7c n7cVar = n7c.B;
        ix2.v(0, 1, 2, 3, 4);
        u1k.G(5);
    }

    public j7c(String str, d7c d7cVar, g7c g7cVar, f7c f7cVar, n7c n7cVar, h7c h7cVar) {
        this.a = str;
        this.b = g7cVar;
        this.c = f7cVar;
        this.d = n7cVar;
        this.e = d7cVar;
        this.f = h7cVar;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [d7c, c7c] */
    public static j7c b(String str) {
        Uri parse;
        g7c g7cVar;
        t68 t68Var = new t68();
        new d85();
        List list = Collections.EMPTY_LIST;
        we8 we8Var = jr9.b;
        wwf wwfVar = wwf.e;
        e7c e7cVar = new e7c();
        h7c h7cVar = h7c.a;
        if (str == null) {
            parse = null;
        } else {
            parse = Uri.parse(str);
        }
        Uri uri = parse;
        if (uri != null) {
            g7cVar = new g7c(uri, null, null, list, wwfVar, null, -9223372036854775807L);
        } else {
            g7cVar = null;
        }
        return new j7c("", new c7c(t68Var), g7cVar, new f7c(e7cVar), n7c.B, h7cVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, b7c] */
    /* JADX WARN: Type inference failed for: r1v8, types: [t68, java.lang.Object] */
    public final b7c a() {
        ?? obj = new Object();
        obj.d = new t68();
        obj.e = new d85();
        obj.f = Collections.EMPTY_LIST;
        we8 we8Var = jr9.b;
        obj.g = wwf.e;
        obj.k = new e7c();
        obj.l = h7c.a;
        obj.i = -9223372036854775807L;
        ?? obj2 = new Object();
        obj2.a = this.e.a;
        obj.d = obj2;
        obj.a = this.a;
        obj.j = this.d;
        obj.k = this.c.a();
        obj.l = this.f;
        g7c g7cVar = this.b;
        if (g7cVar != null) {
            obj.c = g7cVar.b;
            obj.b = g7cVar.a;
            obj.f = g7cVar.c;
            obj.g = g7cVar.d;
            obj.h = g7cVar.e;
            obj.e = new d85();
            obj.i = g7cVar.f;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j7c) {
                j7c j7cVar = (j7c) obj;
                if (Objects.equals(this.a, j7cVar.a) && this.e.equals(j7cVar.e) && Objects.equals(this.b, j7cVar.b) && this.c.equals(j7cVar.c) && Objects.equals(this.d, j7cVar.d) && Objects.equals(this.f, j7cVar.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        g7c g7cVar = this.b;
        if (g7cVar != null) {
            i = g7cVar.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + i) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return hashCode2;
    }
}
