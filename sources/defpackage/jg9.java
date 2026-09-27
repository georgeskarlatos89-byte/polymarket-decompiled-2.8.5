package defpackage;

import io.ably.lib.http.HttpConstants;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jg9 {
    public static final jg9 b;
    public static final jg9 c;
    public static final jg9 d;
    public static final jg9 e;
    public static final List f;
    public final String a;

    static {
        jg9 jg9Var = new jg9(HttpConstants.Methods.GET);
        b = jg9Var;
        jg9 jg9Var2 = new jg9(HttpConstants.Methods.POST);
        c = jg9Var2;
        jg9 jg9Var3 = new jg9(HttpConstants.Methods.PUT);
        jg9 jg9Var4 = new jg9(HttpConstants.Methods.PATCH);
        jg9 jg9Var5 = new jg9(HttpConstants.Methods.DELETE);
        jg9 jg9Var6 = new jg9("HEAD");
        d = jg9Var6;
        jg9 jg9Var7 = new jg9("OPTIONS");
        e = jg9Var7;
        f = CollectionsKt.listOf(jg9Var, jg9Var2, jg9Var3, jg9Var4, jg9Var5, jg9Var6, jg9Var7);
    }

    public jg9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof jg9) || !Intrinsics.areEqual(this.a, ((jg9) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
